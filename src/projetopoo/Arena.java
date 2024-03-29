/*
 * ARENA DE COMBATE
 */
package projetopoo;

import java.util.Scanner;


public class Arena {
	Scanner scanner = new Scanner(System.in);
	private Character jogador; //Atributo que contem jogador participante da Arena
	private Monstro inimigo; //Atributo que contem inimigo participante da Arena
	private int dano; //Variavel para calcular dano infrigido ou tomado pelo jogador
	private String status, resposta;
	
	//Construtor, invoca jogador e inimigo para a arena
	public Arena(Character j, Monstro m) {
		this.jogador = j;
		this.inimigo = m;
		Monstro.setDerrota(false);
		inimigo.Descricao(); //Descreve inimigo
		
	}
	
	//Turno do Jogador. Sempre se inicia primeiro, com uma palavra atribuida previamente
	public void TurnoJogador(Palavra word) {
		System.out.println("Acerte as palavras para atacar!!\n");
		espera(1000);
		System.out.println("O que significa \""+word.getGenero()+" "+word.getPalavra()+"\"?");
		System.out.printf(">> ");
                
                //Jogador digita traducao da palavra.
		resposta = (scanner.next()).toLowerCase(); 
                //Caso a palavra esteja correta.
		if (resposta.equals(word.getTraducao())) { 
			System.out.println("\nResposta Correta! "+jogador.getNome().toUpperCase()+" consegue atingir o inimigo");
			espera(1000);
			dano = jogador.getATK()+((int)Math.random()*10); // Inflige dano ao oponente baseado no ATK
		}
		else { //Caso a palavra esteja errada
			System.out.println("\nResposta Errada! O inimigo resiste ao ataque");
			espera(1000);
			dano = ((int)Math.random()*3)+1; //Dano minimo de 1 a 3 sera infligido ao oponente
		}
		inimigo.tomaDano(dano); //Dano infligido ao inimigo
		inimigo.verHP(); // Verificacao do HP inimigo
		inimigo.verificaStatus(); //Verificacao da condicao de derrota do inimigo
		espera(1000);
	}
	
	//Turno do inimigo. Uma palavra sempre eh atribuida externamente
	public void TurnoInimigo(Palavra word) {
		System.out.println("Acerte as palavras para se defender!!\n");
		espera(1000);
		System.out.println("O que significa \""+word.getGenero()+" "+word.getPalavra()+"\"?");
		System.out.printf(">> ");
                //Jogador digita a resposta.
		resposta = (scanner.next()).toLowerCase(); 
		
		if (resposta.equals(word.getTraducao())) { //Caso palavra esteja correta
			System.out.println("\nResposta Correta! "+jogador.getNome().toUpperCase()+" consegue desviar do golpe");
			espera(1000);
		}
		else { //Caso a palavra esteja errada
			System.out.println("\nResposta Errada! "+jogador.getNome().toUpperCase()+" foi atingido pelo inimigo");
			espera(1000);
			dano = inimigo.getATK()+((int)Math.random()*10); //Dano tomado considera ATK do inimigo
			jogador.tomaDano(dano);
		}
		 //Subtracao do HP no dano levado
		jogador.verHP(); //Verificacao do HP do jogador
		jogador.verificaStatus(); //Verificacao se jogador nao sofreu KO (HP <= 0 )
		espera(1000);
	}
	
	//Permite que o codigo aguarde antes de prosseguir com a sua execucao.
	public void espera(int mili) {
		try {
		    Thread.sleep(mili);
		} catch (InterruptedException e) {
		    System.err.format("ERRO", e);
		}		
	}	
}
