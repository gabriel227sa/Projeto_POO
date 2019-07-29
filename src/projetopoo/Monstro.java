/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

public class Monstro {
	protected String nome;
	protected int HP; // HP que sera modificado em combate
	protected int MaxHP; //HP maximo
	protected int ATK; //Ataque do monstro
	private static boolean derrota; // Condicao estatica que define se inimigo foi derrotado
	
	public Monstro() {
		Monstro.derrota = false; // Construtor define monstro como nao-derrotado
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
	
	//Descreve os atributos do inimigo
	public void Descricao() {
		System.out.println();
		System.out.println(this.getNome()+":");
		System.out.println("MaxHP: "+this.getMaxHP());
		System.out.println("ATK: "+this.getATK());
		System.out.println();
	}
	//Metodo que calcula o dano levado pelo inimigo e subtrai o HP
	public void tomaDano(int dano) {
		System.out.println(this.getNome()+ " tomou "+dano+" de dano!");
		this.setHP(this.getHP()-dano);
	}
	//Metodo que verifica se inimigo foi derrotado ou nao
	public void verificaStatus() {
		if (this.getHP() <= 0) {
			Monstro.setDerrota(true);
		}
	}
	//Metodo que verifica somente o HP do inimigo
	public void verHP() {
		System.out.println(this.getNome()+" esta com "+this.getHP()+" HP\n");
	}
}
