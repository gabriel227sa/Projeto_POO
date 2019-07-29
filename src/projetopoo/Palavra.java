
package projetopoo;

public class Palavra {
	private String palavra;
	private String traducao;
	private String genero;
	private int dificuldade;
	
	public Palavra(String p, String t, String g, int d){
		this.palavra = p;
		this.traducao = t;
		this.genero = g;
		this.dificuldade = d;
	}
	
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
	
	public void Descricao() {
		System.out.println(this.getPalavra()+":");
		System.out.println(this.getTraducao());
		System.out.println(this.getGenero());
		System.out.println(this.getDificuldade());
		System.out.println();
	}
	
}
