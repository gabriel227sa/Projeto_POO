/*
 * 
 * 
 * 
 */
package projetopoo;

public class Dicionario {

    //26 palavras. Pode-se adicionar um valor maior

    private Palavra[] dicionario = new Palavra[26];

    //Metodo construtor que ja contem palavras pre-definidas
    public Dicionario() {
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

    //Verifica os atributos da palavra contida em um espaco no dicionario
    public void VerificaPalavra(int i) {
        this.dicionario[i].Descricao();
    }
}
