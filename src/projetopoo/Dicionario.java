/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

public class Dicionario {
	private Palavra[] dicionario = new Palavra[26];
	
	public Dicionario() {
		dicionario[0] = new Palavra("Stuhl","Cadeira", "Der", 1);
		dicionario[1] = new Palavra("Tafel","Lousa", "Die", 1);
		dicionario[2] = new Palavra("Ball","Bola", "Der", 2);
		dicionario[3] = new Palavra("Mann","Homem", "Der", 2);
		dicionario[4] = new Palavra("Sonne","Sol", "Die", 2);
		dicionario[5] = new Palavra("Frau","Mulher", "Die", 2);
		dicionario[6] = new Palavra("Buch","Livro", "Das", 2);
		dicionario[7] = new Palavra("Wasser","Agua", "Das", 2);
		dicionario[8] = new Palavra("Tisch","Mesa", "Der", 2);
		dicionario[9] = new Palavra("Affe","Macaco", "Der", 2);
		dicionario[10] = new Palavra("Haus","Casa", "Das", 2);
		dicionario[11] = new Palavra("Kopf","Cabeça", "Der", 2);
		dicionario[12] = new Palavra("Blume","Flor", "Die", 2);
		dicionario[13] = new Palavra("Wein","Vinho", "Der", 2);
		dicionario[14] = new Palavra("Vogel","Passaro", "Der", 2);
		dicionario[15] = new Palavra("Katze","Gato", "Die", 2);
		dicionario[16] = new Palavra("Orange","Laranja", "Die", 2);
		dicionario[17] = new Palavra("Liebe","Amor", "Die", 2);
		dicionario[18] = new Palavra("Handy","Celular", "Das", 2);
		dicionario[19] = new Palavra("Bier","Cerveja", "Das", 2);
		dicionario[20] = new Palavra("Eis","Sorvete", "Das", 2);
		dicionario[21] = new Palavra("Geld","Dinheiro", "Das", 2);
		dicionario[22] = new Palavra("Herz","Coração", "Das", 2);
		dicionario[23] = new Palavra("Brot","Pão", "Das", 2);
		dicionario[24] = new Palavra("Bett","Cama", "Das", 2);
		dicionario[25] = new Palavra("Fenster","Janela", "Das", 2);

	}
	
	public Palavra getPalavra(int i) {
		return this.dicionario[i];
	}
	
	public String getDicPalavra(int i) {
		return dicionario[i].getPalavra();
	}
	
	public String getDicTraducao(int i) {
		return dicionario[i].getTraducao();
	}
	
	public String getDicGenero(int i) {
		return dicionario[i].getGenero();
	}

	public void VerificaPalavra(int i) {
		this.dicionario[i].Descricao();
	}
}