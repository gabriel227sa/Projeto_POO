/*
 * CONTEM OS ATRIBUTOS DOS PERSONAGENS DO JOGO.
 */

package projetopoo;

//Heranca de monstros. Herois tambem sao monstros por dentro =).
public class Character extends Monstro { 
        //nivel atual do heroi
	int nivel; 
	int maxNivel = 0;
        //Condicao que determina se jogador foi derrotado.
	private static boolean derrota; 
	
        //Construtor padrao que define o nivel e se ocorreu derrota.
	public Character() {
		this.nivel = 1;
		Character.derrota = false;
	}
        
        //metodo get para nivel
	public int getNivel() {
		return nivel;
	}
        
        //metodo set para nivel
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
        //metodo get para derrota
	public static boolean getDerrota() {
		return derrota;
	}

        //define se ocorreu a derrota
	public static void setDerrota(boolean derrota) {
		Character.derrota = derrota;
	}
        
        //retorna o nivel do personagem
	public int getMaxNivel() {
		return maxNivel;
	}
        
        //muda o nivel maximo
	public void setMaxNivel(int maxNivel) {
		this.maxNivel = maxNivel;
	}

	//Da descricao detalhada de heroi	
	@Override
	public void Descricao() {
		System.out.println(this.getNome()+":");
		System.out.println("MaxHP: "+this.getMaxHP());
		System.out.println("ATK: "+this.getATK());
		System.out.println("Nivel: "+this.getNivel());
		System.out.println();
	}
	
        //Verifica o status do jogador.
	@Override
	public void verificaStatus() {
		if (this.getHP() <= 0) {
			Character.setDerrota(true);
		}
	}
	
        //Exibe a pontuacao do jogador.
	public void Score(int score) {
		if (score > maxNivel) {
			maxNivel = score;
		}
	}
	
        //Reset do nivel.
	public void reset() {
		this.HP = MaxHP;
		this.nivel = 1;
	}
	
}
