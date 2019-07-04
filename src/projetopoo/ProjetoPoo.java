/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

import java.util.Scanner;

public class ProjetoPoo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Dicionario dicionario = new Dicionario();
		Bestiario bestiario = new Bestiario();
		Herois herois = new Herois();
		
		Character Jogador = herois.seletor();
		herois.ListaChar();
		Jogador.Descricao();
		
		//Combate
		boolean fim;
		for (int i=0;i<5;i++) {
			fim = false;
			System.out.println(bestiario.getBestNome(i)+" apareceu para o combate!\n"
							   +Jogador.getNome()+" acerte as palavras para derrota-lo");
			Arena A = new Arena(Jogador,bestiario.Summon(i));
			while(fim == false) {
				Palavra word = dicionario.getPalavra((int)(Math.random()*26));
				A.TurnoJogador(word);
				if (Monstro.getDerrota() == true) {
					System.out.println("Voce venceu!\n");
					break;
				}
				
				Palavra word2 = dicionario.getPalavra((int)(Math.random()*26));
				A.TurnoInimigo(word2);
				if (Character.getDerrota() == true) {
					System.out.println("Voce morreu!");
					break;
				}
			}
		}
	}
}