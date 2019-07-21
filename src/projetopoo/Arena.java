/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

import java.util.Scanner;

public class Arena {
	Scanner scanner = new Scanner(System.in);
	Character jogador; //Atributo que contem jogador participante da Arena
	Monstro inimigo; //Atributo que contem inimigo participante da Arena
	int dano; //Variavel para calcular dano infrigido ou tomado pelo jogador
	String status;
	
	//Construtor, invoca jogador e inimigo para a arena
	public Arena(Character j, Monstro m) {
		this.jogador = j;
		this.inimigo = m;
		Monstro.setDerrota(false);
		inimigo.Descricao(); //Descreve inimigo
		
	}
	
	//Turno do Jogador. Sempre se inicia primeiro, com uma palavra atribuida previamente
	public void TurnoJogador(Palavra word) {
		System.out.println("Turno do Jogador!!\n");
		System.out.println("O que significa \""+word.getGenero()+" "+word.getPalavra()+"?");
		String x = scanner.next(); //Jogador introduz traducao da palavra
		if (x.equals(word.getTraducao())) { //Caso a palavra esteja correta
			System.out.println("Resposta Correta!");
			dano = jogador.getATK()+((int)Math.random()*10); // Inflige dano ao oponente baseado no ATK
		}
		else { //Caso a palavra esteja errada
			System.out.println("Resposta Errada!");
			dano = ((int)Math.random()*3)+1; //Dano minimo de 1 a 3 sera infligido ao oponente
		}
		inimigo.tomaDano(dano); //Dano infligido ao inimigo
		inimigo.verHP(); // Verificacao do HP inimigo
		inimigo.verificaStatus(); //Verificacao da condicao de derrota do inimigo
	}
	
	//Turno do inimigo. Uma palavra sempre eh atribuida externamente
	public void TurnoInimigo(Palavra word) {
		System.out.println("Turno do Inimigo!!\n");
		System.out.println("O que significa \""+word.getPalavra()+"?");
		String x = scanner.next(); //Jogador introduz palavra
		if (x.equals(word.getTraducao())) { //Caso palavra esteja correta
			System.out.println("Resposta Correta!");
			dano = ((int)Math.random()*3)+1; //Dano levado sera minimo, de 1 a 3
		}
		else { //Caso a palavra esteja errada
			System.out.println("Resposta Errada!");	
			dano = inimigo.getATK()+((int)Math.random()*10); //Dano tomado considera ATK do inimigo
		}
		jogador.tomaDano(dano); //Subtracao do HP no dano levado
		jogador.verHP(); //Verificacao do HP do jogador
		jogador.verificaStatus(); //Verificacao se jogador nao sofreu KO (HP <= 0 )
	}
	
}