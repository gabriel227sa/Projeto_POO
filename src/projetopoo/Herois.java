/*
 * A classe a seguir possui os herois...
 * 
 * 
 * 
 * 
 * 
 * 
 */
package projetopoo;

import java.util.Scanner;

public class Herois {

    //Vetor permite guardar 9 herois na classe

    Character[] herois = new Character[9];
    Scanner scanner = new Scanner(System.in);

    //Metodo para criacao do personagem
    public void CriaChar(int i) {
        Character hero = new Character();
        System.out.printf("Qual o nome do aluno:\n>> ");
        String nome = (scanner.next()).toLowerCase(); // Usuario define nome do heroi
        hero.nome = nome;
        hero.HP = 50;
        hero.MaxHP = 50;
        hero.ATK = (int) (Math.random() * 5) + 10; // ataque inicial randomico de 10 a 14
        this.herois[i] = hero;
    }

	//Metodo que inicia o seletor de slots de heroi (como se fosse um "Load Game).
    //Caso Slot escolhido seja nulo, chama metodo para criar personagem
    public Character seletor() {
        System.out.printf("Qual slot deseja selecionar?\n>> ");
        //Usuario introduz numero de slot
        int selecao = scanner.nextInt();
        if(selecao < 0 || selecao > 8){
            System.out.println("Slot nÃ£o disponÃ­vel!");
            System.exit(0);
        }
        if (this.herois[selecao] == null) {
            this.CriaChar(selecao);
            return herois[selecao];
        } else{
            System.out.printf("Slot preenchido! Selecione outro!\n");
            return herois[selecao];
        }        
    }

    //  Metodo que recebe o nome do aluno e retorna a posiÃ§Ã£o no slot de 
    //herois, caso nÃ£o esteja no vetor retorna -1.
    public int verificaAluno(String aluno) {
        int verifica = -1;
        for (int i = 0; i < 9; i++) {
            if ((herois[i].getNome()).equals(aluno)) {
                verifica = i;
                break;
            }
        }
        return verifica;
    }

    // Metodo que deleta um aluno.
    public void delete() {
        System.out.printf("Qual slot deseja selecionar?\n>> ");
        //Usuario introduz numero de slot
        int selecao = scanner.nextInt();
        if(selecao < 0 || selecao > 8){
            System.out.printf("**Slot nÃ£o disponÃ­vel!");
            delete();
        }
        else if (this.herois[selecao] != null) {
            this.herois[selecao] = null;
        }
    }

    //Retorna a descricao do personagem
    public void VerificaChar(int i) {
        this.herois[i].Descricao();
    }

    //Convoca o heroi (combate, etc.)
    public Character Summon(int i) {
        return herois[i];
    }

    //Exibe os slots vazios e contendo personagens salvos
    public void ListaChar() {
        for (int i = 0; i < 9; i++) {
            if (herois[i] != null) {
                System.out.println("Slot " + i + ": " + herois[i].getNome());
            } else {
                System.out.println("Slot " + i + ": Vazio");
            }
        }
    }
    public void showScores() {
    	System.out.println("****RECORDES****");
    	for (int i = 0; i < 9; i++) {
            if (herois[i] != null) {
                System.out.println("| "+herois[i].getNome()+" -> Nivel "+herois[i].getMaxNivel());
            }
        }
    }
}
