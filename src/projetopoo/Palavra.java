/*
 * CLASSE QUE DEFINE OS ATRIBUTOS DAS PALAVRAS DO DICIONARIO
 */
package projetopoo;

public class Palavra {
	private String palavra;
	private String traducao;
	private String genero;
	private int dificuldade;
	
        //Contrutor que recebe a palavra, a traducao, o genero e a dificuladade.
	public Palavra(String p, String t, String g, int d){
		this.palavra = p;
		this.traducao = t;
		this.genero = g;
		this.dificuldade = d;
	}
	//metodos get/set dos parametros.
	public String getPalavra() {
		return palavra;
	}
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	public String getTraducao() {
		return traducao;
	}
	public void setTraducao(String traducao) {
		this.traducao = traducao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getDificuldade() {
		return dificuldade;
	}
	public void setDificuldade(int dificuldade) {
		this.dificuldade = dificuldade;
	}
        
	//imprime a descricao.
	public void Descricao() {
		System.out.println(this.getPalavra()+":");
		System.out.println(this.getTraducao());
		System.out.println(this.getGenero());
		System.out.println(this.getDificuldade());
		System.out.println();
	}
	
}
