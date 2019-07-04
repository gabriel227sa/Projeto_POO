/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

import java.util.Scanner;

public class Herois {
	private Character[] herois = new Character[9];
	Scanner scanner = new Scanner(System.in);

	public void CriaChar(int i) {
		Character hero = new Character();
		System.out.println("Qual o nome do personagem: ");
		String nome = scanner.next();
		hero.nome = nome;
		hero.HP = 50;
		hero.MaxHP = 50;
		hero.ATK = (int)(Math.random()*5)+10;
		hero.EXP = 0;
		this.herois[i] = hero;
	}
	public Character seletor() {
		System.out.println("Qual slot deseja selecionar?");
		int selecao = scanner.nextInt();
		if (this.herois[selecao] == null) {
			this.CriaChar(selecao);
			return herois[selecao];
		}
		else {
			return herois[selecao];
		}
	}
	
	public void VerificaChar(int i) {
		this.herois[i].Descricao();
	}
	public Character Summon(int i) {
		return herois[i];
	}
	public void ListaChar() {
		for (int i = 0;i<9;i++) {
			if(herois[i] != null) {
				System.out.println("Slot "+i+": "+herois[i].getNome());
			}
			else {
				System.out.println("Slot "+i+": Vazio");

			}
		}
	}	
}