/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

public class Bestiario {
	private Monstro[] bestiario = new Monstro[5];
	private String[][] nomes = {{"Orc", "Goblin", "Bruxo"},
						{"Niffth","Dragao","Medusa"},
						{"Serpente","Zumbi","High Tech Dracula"},
						{"Dragão Branco", "Dragão Vermelho", "Dragão Macabro"},
						{"Espirito Perdido", "Pudim de Passas", "The Rosetta"}
						};
	
	public Bestiario() {
		int j;
		for (int i = 0;i<5;i++) {
			Monstro monstro = new Monstro();
			j = (int)((Math.random()*3)+1);
			monstro.setNome(nomes[i][j-1]);
			monstro.setHP((50*j)+(i*20));
			monstro.setMaxHP((50*j)+(i*20));
			monstro.setATK((3*j)+(i*3));
			monstro.setEXP(10 + (i*j*10));
			this.bestiario[i] = monstro;
		}
	}
	public void VerificaMonstro(int i) {
		this.bestiario[i].Descricao();
	}
	public Monstro Summon(int i) {
		return bestiario[i];
	}
	public String getBestNome(int i) {
		return bestiario[i].nome;
	}
}