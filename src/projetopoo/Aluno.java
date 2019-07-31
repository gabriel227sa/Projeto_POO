/*
 *
 *
 *
 */
package projetopoo;

import java.util.Scanner;

public class Aluno extends PerfisDeAcesso {
    // Gera o dicionario com as palavras do jogo.

    Scanner scannner;
    boolean vaiTerCombate = false;
    private int escolha;
    private int rodada;
    private String nomeAluno;
    private boolean fimDeJogo = false;

    public Aluno(Herois herois) {
        this.scan = new Scanner(System.in);
        do {
            System.out.println("\n           ================================");
            System.out.println("           |     O que deseja fazer?      |");
            System.out.println("           |                              |");
            System.out.println("           |     1 - Jogar.               |");
            System.out.println("           |     2 - Ver Historico.       |");
            System.out.println("           |     3 - Voltar.              |");
            System.out.println("           |     0 - Fechar Programa.     |");
            System.out.printf("           ================================\n>> ");
            escolha = NumeroInteiro.RetornaNumeroInteiro(); 
            switch (escolha) {
                case 1:
                    jogar(herois);
                    break;
                case 2:
                    herois.showScores();
                    break;
                case 3: 
                    menuDeAcesso(herois);
                    break;                
                case 0: 
                    System.out.printf("        |           ** PROGRAMA ENCERRADO **        |\n\n>> ");
                    break;                
                default:
                    System.out.println("           |       **Escolha uma opcao valida!**       |");
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
            System.out.println("           |          **Aluno nao encontrado!**        |");
            System.out.println("");
            menuDeAcesso(herois);
        } else {
            herois.VerificaChar(herois.verificaAluno(this.nomeAluno));
            vaiTerCombate = true;
        }
        combate(herois);
    }

    public void combate(Herois herois) {
        if (vaiTerCombate) {

            //Gera as palavras e os monstros no combate
            Dicionario dicionario = new Dicionario();
            Bestiario bestiario = new Bestiario();

            //Combate
            Character player = herois.Summon((herois.verificaAluno(this.nomeAluno)));
            for (int i = 0; i < 5; i++) { //Cada iteracao gera um oponente diferente
                rodada = i + 1;
                System.out.println("\n[Nivel " + rodada + "]" + "\n");
                System.out.println(bestiario.getBestNome(i) + " apareceu para o combate!\n"
                        + player.getNome() + " acerte as palavras para derrota-lo");
                Arena arena = new Arena(player, bestiario.Summon(i)); //Cria arena com Jogador e Inimigo
                while (true) { //Cada while eh um turno

                    //Turno do Jogador
                    Palavra word = dicionario.getPalavra((int) (Math.random() * 26));//Captura palavra randomica do dicionario
                    arena.TurnoJogador(word); //Gera ataques de jogador

                    if (Monstro.getDerrota() == true) { // Caso Inimigo.HP <= 0
                        System.out.println("Voce venceu!\n" + bestiario.getBestNome(i) + " foi derrotado!");
                        break;
                    }

                    //Turno do Inimigo
                    Palavra word2 = dicionario.getPalavra((int) (Math.random() * 26)); // Captura palavra randomica do dicionario
                    arena.TurnoInimigo(word2); // Gera ataques do inimigo
                    if (Character.getDerrota() == true) { // Caso Jogador.HP <= 0
                        System.out.println("Voce morreu! :(");
                        fimDeJogo = true;
                        break;

                    }
                }

                if (fimDeJogo) {
                    break;
                }
                if (i >= 4) {
                    rodada++;
                    System.out.println("Parabens! Voce finalizou o ultimo nivel!\n");
                    break;
                }

                System.out.println("Deseja continuar jogando? 1 - Sim , 2 - Nao");
                System.out.printf(">> ");
                escolha = NumeroInteiro.RetornaNumeroInteiro();
                System.out.println();
                if (escolha == 2) {
                    break;
                }

            }

            System.out.println("\n           ================================");
            System.out.println("           |                                |");
            System.out.println("           |     Fim de Jogo!               |");
            System.out.println("           |                                |");
            System.out.println("           |     Parabens!                  |");
            System.out.println("           |     Voce chegou no nivel " + rodada + "     |");
            System.out.println("           |                                |");
            System.out.println("           ================================\n ");

            this.fimDeJogo = false;
            Character.setDerrota(false);
            Monstro.setDerrota(false);
            player.Score(rodada);
            herois.showScores();

            player.reset();
        }
    }
}
