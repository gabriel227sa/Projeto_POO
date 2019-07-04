/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

public class Monstro {
	protected String nome;
	protected int HP;
	protected int MaxHP;
	protected int EXP;
	protected int ATK;
	private static boolean derrota;
	
	public Monstro() {
		Monstro.derrota = false;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	public int getMaxHP() {
		return MaxHP;
	}
	public void setMaxHP(int maxHP) {
		MaxHP = maxHP;
	}
	public int getEXP() {
		return EXP;
	}
	public void setEXP(int eXP) {
		EXP = eXP;
	}
	public int getATK() {
		return ATK;
	}
	public void setATK(int aTK) {
		ATK = aTK;
	}
	
	public static boolean getDerrota() {
		return derrota;
	}

	public static void setDerrota(boolean derrota) {
		Monstro.derrota = derrota;
	}

	public void Descricao() {
		System.out.println();
		System.out.println(this.getNome()+":");
		System.out.println("MaxHP: "+this.getMaxHP());
		System.out.println("ATK: "+this.getATK());
		System.out.println("EXP: "+this.getEXP());
		System.out.println();
	}
	public void tomaDano(int dano) {
		System.out.println(this.getNome()+ " tomou "+dano+" de dano!");
		this.setHP(this.getHP()-dano);
	}
	public void verificaStatus() {
		if (this.getHP() <= 0) {
			Monstro.setDerrota(true);
		}
	}
	public void verHP() {
		System.out.println(this.getNome()+"esta com "+this.getHP()+" HP");
	}
}