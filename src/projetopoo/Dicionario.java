/*
 * 
 * 
 * 
 */
package projetopoo;

public class Dicionario {

    //26 palavras. Pode-se adicionar um valor maior
	private static String lingua = "alemao";

    private Palavra[] dicionario = new Palavra[26];

    //Metodo construtor que ja contem palavras pre-definidas
    public Dicionario() {
    	switch(lingua) {
    		case "ingles":
    			dicionario[0] = new Palavra("chair", "cadeira", "The", 1);
    	        dicionario[1] = new Palavra("blackboard", "lousa", "The", 1);
    	        dicionario[2] = new Palavra("ball", "bola", "The", 2);
    	        dicionario[3] = new Palavra("man", "homem", "The", 2);
    	        dicionario[4] = new Palavra("sun", "sol", "The", 2);
    	        dicionario[5] = new Palavra("woman", "mulher", "The", 2);
    	        dicionario[6] = new Palavra("book", "livro", "The", 2);
    	        dicionario[7] = new Palavra("water", "agua", "The", 2);
    	        dicionario[8] = new Palavra("table", "mesa", "The", 2);
    	        dicionario[9] = new Palavra("monkey", "macaco", "The", 2);
    	        dicionario[10] = new Palavra("house", "casa", "The", 2);
    	        dicionario[11] = new Palavra("painting", "quadro", "The", 2);
    	        dicionario[12] = new Palavra("flower", "flor", "The", 2);
    	        dicionario[13] = new Palavra("wine", "vinho", "The", 2);
    	        dicionario[14] = new Palavra("bird", "passaro", "The", 2);
    	        dicionario[15] = new Palavra("cat", "gato", "The", 2);
    	        dicionario[16] = new Palavra("orange", "laranja", "The", 2);
    	        dicionario[17] = new Palavra("Love", "amor", "The", 2);
    	        dicionario[18] = new Palavra("cellphone", "celular", "The", 2);
    	        dicionario[19] = new Palavra("beer", "cerveja", "The", 2);
    	        dicionario[20] = new Palavra("ice cream", "sorvete", "The", 2);
    	        dicionario[21] = new Palavra("money", "dinheiro", "The", 2);
    	        dicionario[22] = new Palavra("music", "musica", "The", 2);
    	        dicionario[23] = new Palavra("shoes", "sapatos", "The", 2);
    	        dicionario[24] = new Palavra("bed", "cama", "The", 2);
    	        dicionario[25] = new Palavra("window", "janela", "The", 2);
    	        break;
    		case "alemao":
    			dicionario[0] = new Palavra("Stuhl", "cadeira", "Der", 1);
    	        dicionario[1] = new Palavra("Tafel", "lousa", "Die", 1);
    	        dicionario[2] = new Palavra("Ball", "bola", "Der", 2);
    	        dicionario[3] = new Palavra("Mann", "homem", "Der", 2);
    	        dicionario[4] = new Palavra("Sonne", "sol", "Die", 2);
    	        dicionario[5] = new Palavra("Frau", "mulher", "Die", 2);
    	        dicionario[6] = new Palavra("Buch", "livro", "Das", 2);
    	        dicionario[7] = new Palavra("Wasser", "agua", "Das", 2);
    	        dicionario[8] = new Palavra("Tisch", "mesa", "Der", 2);
    	        dicionario[9] = new Palavra("Affe", "macaco", "Der", 2);
    	        dicionario[10] = new Palavra("Haus", "casa", "Das", 2);
    	        dicionario[11] = new Palavra("Bild", "quadro", "Das", 2);
    	        dicionario[12] = new Palavra("Blume", "flor", "Die", 2);
    	        dicionario[13] = new Palavra("Wein", "vinho", "Der", 2);
    	        dicionario[14] = new Palavra("Vogel", "passaro", "Der", 2);
    	        dicionario[15] = new Palavra("Katze", "gato", "Die", 2);
    	        dicionario[16] = new Palavra("Orange", "laranja", "Die", 2);
    	        dicionario[17] = new Palavra("Liebe", "amor", "Die", 2);
    	        dicionario[18] = new Palavra("Handy", "celular", "Das", 2);
    	        dicionario[19] = new Palavra("Bier", "cerveja", "Das", 2);
    	        dicionario[20] = new Palavra("Eis", "sorvete", "Das", 2);
    	        dicionario[21] = new Palavra("Geld", "dinheiro", "Das", 2);
    	        dicionario[22] = new Palavra("Musik", "musica", "Die", 2);
    	        dicionario[23] = new Palavra("Schuhe", "sapatos", "Die", 2);
    	        dicionario[24] = new Palavra("Bett", "cama", "Das", 2);
    	        dicionario[25] = new Palavra("Fenster", "janela", "Das", 2);
    	        break;
    		case "frances":
    			dicionario[0] = new Palavra("chaise", "cadeira", "la", 1);
    	        dicionario[1] = new Palavra("tableau noir", "lousa", "le", 1);
    	        dicionario[2] = new Palavra("balle", "bola", "la", 2);
    	        dicionario[3] = new Palavra("homme", "homem", "le", 2);
    	        dicionario[4] = new Palavra("soleil", "sol", "le", 2);
    	        dicionario[5] = new Palavra("femme", "mulher", "la", 2);
    	        dicionario[6] = new Palavra("livre", "livro", "le", 2);
    	        dicionario[7] = new Palavra("eau", "agua", "l'", 2);
    	        dicionario[8] = new Palavra("table", "mesa", "la", 2);
    	        dicionario[9] = new Palavra("singe", "macaco", "le", 2);
    	        dicionario[10] = new Palavra("maison", "casa", "la", 2);
    	        dicionario[11] = new Palavra("cadre", "quadro", "le", 2);
    	        dicionario[12] = new Palavra("fleur", "flor", "la", 2);
    	        dicionario[13] = new Palavra("vin", "vinho", "le", 2);
    	        dicionario[14] = new Palavra("oiseau", "passaro", "l'", 2);
    	        dicionario[15] = new Palavra("chat", "gato", "le", 2);
    	        dicionario[16] = new Palavra("orange", "laranja", "l'", 2);
    	        dicionario[17] = new Palavra("amour", "amor", "l'", 2);
    	        dicionario[18] = new Palavra("cellulaire", "celular", "le", 2);
    	        dicionario[19] = new Palavra("bière", "cerveja", "la", 2);
    	        dicionario[20] = new Palavra("glace", "sorvete", "la", 2);
    	        dicionario[21] = new Palavra("argent", "dinheiro", "l'", 2);
    	        dicionario[22] = new Palavra("musique", "musica", "la", 2);
    	        dicionario[23] = new Palavra("chaussures", "sapatos", "les", 2);
    	        dicionario[24] = new Palavra("lit", "cama", "le", 2);
    	        dicionario[25] = new Palavra("Fenetre", "janela", "la", 2);
    	        break;
    		case "espanhol":
    			dicionario[0] = new Palavra("silla", "cadeira", "la", 1);
    	        dicionario[1] = new Palavra("pizarra", "lousa", "la", 1);
    	        dicionario[2] = new Palavra("pelota", "bola", "la", 2);
    	        dicionario[3] = new Palavra("hombre", "homem", "el", 2);
    	        dicionario[4] = new Palavra("sol", "sol", "el", 2);
    	        dicionario[5] = new Palavra("mujer", "mulher", "la", 2);
    	        dicionario[6] = new Palavra("libro", "livro", "el", 2);
    	        dicionario[7] = new Palavra("agua", "agua", "el", 2);
    	        dicionario[8] = new Palavra("mesa", "mesa", "la", 2);
    	        dicionario[9] = new Palavra("mono", "macaco", "el", 2);
    	        dicionario[10] = new Palavra("casa", "casa", "la", 2);
    	        dicionario[11] = new Palavra("cuadro", "quadro", "el", 2);
    	        dicionario[12] = new Palavra("flor", "flor", "la", 2);
    	        dicionario[13] = new Palavra("vino", "vinho", "el", 2);
    	        dicionario[14] = new Palavra("pajaro", "passaro", "el", 2);
    	        dicionario[15] = new Palavra("gato", "gato", "el", 2);
    	        dicionario[16] = new Palavra("naranja", "laranja", "la", 2);
    	        dicionario[17] = new Palavra("amor", "amor", "el", 2);
    	        dicionario[18] = new Palavra("celular", "celular", "el", 2);
    	        dicionario[19] = new Palavra("cerveza", "cerveja", "la", 2);
    	        dicionario[20] = new Palavra("hielo", "sorvete", "el", 2);
    	        dicionario[21] = new Palavra("dinero", "dinheiro", "el", 2);
    	        dicionario[22] = new Palavra("musica", "musica", "la", 2);
    	        dicionario[23] = new Palavra("zapatos", "sapatos", "los", 2);
    	        dicionario[24] = new Palavra("cama", "cama", "la", 2);
    	        dicionario[25] = new Palavra("ventana", "janela", "la", 2);
    	        break;
    	    default:
    	    	System.out.println("Dicionario nao criado");
    	    	break;
    	    	
    	}

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

    public static String getLingua() {
		return lingua;
	}

	public static void setLingua(String lingua) {
		Dicionario.lingua = lingua;
	}

	//Verifica os atributos da palavra contida em um espaco no dicionario
    public void VerificaPalavra(int i) {
        this.dicionario[i].Descricao();
    }
}
