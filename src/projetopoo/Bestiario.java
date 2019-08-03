/*
 * CRIA OS MONSTROS ALEATORIAMENTE, E DEFINE QUAIS ESTARAO NA PARTIDA.
 */

package projetopoo;

public class Bestiario {
	private Monstro[] bestiario = new Monstro[5]; //Espaco para 5 monstros. Pode conter mais
	
	//Matriz de nomes de monstros.
	//Sera gerado um monstro por linha, definido aleatoriamente dentre os disponiveis nas colunas
	//Monstros da esquerda para a direita e de cima para baixo sao mais fortes.
	//Semelhante a um Roguelike.
	//Exemplo: Sera invocado um Orc OU um Goblin OU um bruxo na primeira rodada.
	private String[][] nomes = {{"Orc", "Goblin", "Bruxo"},
						{"Niffth","Dragao","Medusa"},
						{"Serpente","Zumbi","High Tech Dracula"},
						{"Dragao Branco", "Dragao Vermelho", "Dragao Macabro"},
						{"Espirito Perdido", "Pudim de Passas", "The Rosetta"}
						};
	
	//Construtor Bestiario, ira definir os monstros da partida.
	//Cada partida sera um monstro diferente com atributos diferentes, gerados aleatoriamente
	public Bestiario() {
		int j;
		for (int i = 0;i<5;i++) {
			Monstro monstro = new Monstro();
			j = (int)((Math.random()*3)+1); //Fator de Aleatoriedade, de 1 a 3. Qto maior, mais forte o inimigo
			monstro.setNome(nomes[i][j-1]); //Define os nomes de acordo com o fator de Aleatoriedade
			monstro.setHP((15*j)+(i*20)); //HP = MaxHP
			monstro.setMaxHP((15*j)+(i*20));
			monstro.setATK((3*j)+(i*3)); //Ataque do monstro, definido por j
			this.bestiario[i] = monstro; // Add monstro gerado ao bestiario
		}
	}
	
	//Metodo que descreve o monstro contido no bestiario
	public void VerificaMonstro(int i) {
		this.bestiario[i].Descricao();
	}
	
	//Invoca o monstro para uso (combate, etc.)
	public Monstro Summon(int i) {
		return bestiario[i];
	}
	
	//Retorna somente o nome do inimigo
	public String getBestNome(int i) {
		return bestiario[i].nome;
	}
}
