/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

public class Character extends Monstro { //Heranca de monstros. Herois tambem sao monstros por dentro =)
	int nivel; //nivel atual do heroi
	private static boolean derrota; //Condicao que determina se jogador foi derrotado
	
	public Character() {
		this.nivel = 1;
		Character.derrota = false;
	}

	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	public static boolean getDerrota() {
		return derrota;
	}

	public static void setDerrota(boolean derrota) {
		Character.derrota = derrota;
	}

	//Da descricao detalhada de heroi
	public void Descricao() {
		System.out.println(this.getNome()+":");
		System.out.println("MaxHP: "+this.getMaxHP());
		System.out.println("ATK: "+this.getATK());
		System.out.println("Nivel: "+this.getNivel());
		System.out.println("EXP: "+this.getEXP());
		System.out.println();
	}
}