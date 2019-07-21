/*
 *
 *
 *
 */

package projetopoo;

import java.util.Scanner;

public class Aluno extends PerfisDeAcesso {
    // Gera o dicionário com as palavras do jogo.
    Dicionario dicionario = new Dicionario(); 
    Bestiario bestiario = new Bestiario();
    Scanner scannner;
    boolean vaiTerCombate = false;
    private int escolha;
    private String nomeAluno;
    
    public Aluno(Herois herois) {
        this.scan = new Scanner(System.in);
        do {            
            System.out.println("\n           ================================");
            System.out.println("           |     O que deseja fazer?      |");
            System.out.println("           |                              |");
            System.out.println("           |     1 - Jogar.               |");
            System.out.println("           |     2 - Ver Histórico.       |");
            System.out.println("           |     3 - Voltar.              |");
            System.out.println("           |     0 - Fechar Programa.     |");
            System.out.printf("           ================================\n>> ");            
            escolha = scan.nextInt();
            switch (escolha) {
                case 1:
                    jogar(herois);
                    break;
                case 2:
                    historico();
                    break;
                case 3: {
                    menuDeAcesso(herois);
                    break;
                }
                default:
                    System.out.println("**Escolha uma opção válida!**");                  
            }
        } while (escolha != 0);
        
    }
    
    public int jogador(Herois heroi) {
        return heroi.verificaAluno(this.nomeAluno);
    }
    
    public void jogar(Herois herois) {
        System.out.printf("Digite seu nome: \n>> ");        
        nomeAluno = (scan.next()).toLowerCase();
        
        if ((herois.verificaAluno(this.nomeAluno)) == -1) {
            System.out.println("**Aluno não encontrado!");
            menuDeAcesso(herois);
        } else {
            herois.VerificaChar(herois.verificaAluno(this.nomeAluno));
            vaiTerCombate = true;
        }
        combate(herois);
    }
    
    public void combate(Herois herois) {
        if (vaiTerCombate) {
            //Combate
            Character player = herois.Summon((herois.verificaAluno(this.nomeAluno)));
            for (int i = 0; i < 5; i++) { //Cada iteração gera um oponente diferente
                System.out.println(bestiario.getBestNome(i) + " apareceu para o combate!\n"
                        + player.getNome() + " acerte as palavras para derrota-lo");
                Arena A = new Arena(player, bestiario.Summon(i)); //Cria arena com Jogador e Inimigo
                while (true) { //Cada while é um turno

                    //Turno do Jogador
                    Palavra word = dicionario.getPalavra((int) (Math.random() * 26));//Captura palavra randomica do dicionario
                    A.TurnoJogador(word); //Gera ações de jogador

                    if (Monstro.getDerrota() == true) { // Caso Inimigo.HP <= 0
                        System.out.println("Voce venceu!\n");
                        break;
                    }

                    //Turno do Inimigo
                    Palavra word2 = dicionario.getPalavra((int) (Math.random() * 26)); // Captura palavra randomica do dicionario
                    A.TurnoInimigo(word2); // Gera ações do inimigo
                    if (Character.getDerrota() == true) { // Caso Jogador.HP <= 0
                        System.out.println("Voce morreu!");
                        break;
                    }
                }
            }
        }
    }
    
    //Exibe o historico com as melhores pontuações
    public void historico() {
        // Ver um modo de guardar o histórico de melhores jogadores.
    }
}
