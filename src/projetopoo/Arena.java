/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

import java.util.Scanner;

public class Arena {
	Scanner scanner = new Scanner(System.in);
	Character jogador;
	Monstro inimigo;
	int dano;
	String status;
	
	public Arena(Character j, Monstro m) {
		this.jogador = j;
		this.inimigo = m;
		Monstro.setDerrota(false);
		inimigo.Descricao();
		
	}
	public void TurnoJogador(Palavra word) {
		System.out.println("Turno do Jogador!!\n");
		System.out.println("O que significa \""+word.getPalavra()+"?");
		String x = scanner.next();
		if (x.equals(word.getTraducao())) {
			System.out.println("Resposta Correta!");
			dano = jogador.getATK()+((int)Math.random()*10);
		}
		else {
			System.out.println("Resposta Errada!");
			dano = ((int)Math.random()*3)+1;
		}
		inimigo.tomaDano(dano);
		inimigo.verHP();
		inimigo.verificaStatus();
	}
	public void TurnoInimigo(Palavra word) {
		System.out.println("Turno do Inimigo!!\n");
		System.out.println("O que significa \""+word.getPalavra()+"?");
		String x = scanner.next();
		if (x.equals(word.getTraducao())) {
			System.out.println("Resposta Correta!");
			dano = ((int)Math.random()*3)+1;
		}
		else {
			System.out.println("Resposta Errada!");	
			dano = inimigo.getATK()+((int)Math.random()*10);
		}
		jogador.tomaDano(dano);
		jogador.verHP();
		jogador.verificaStatus();
	}
	
}