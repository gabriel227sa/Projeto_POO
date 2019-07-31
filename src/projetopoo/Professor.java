/*
 *
 *
 *
 *
 */

package projetopoo;

import java.util.Scanner;

public class Professor extends PerfisDeAcesso {

    private int escolha;
    Scanner scan = new Scanner(System.in);

    // Construtor da classe, que imprime o menu de opcoes do perfil professor.
    public Professor(Herois herois) {
        do {
            System.out.println("\n           ================================");
            System.out.println("           |     O que deseja fazer?      |");
            System.out.println("           |                              |");
            System.out.println("           |     1 - Adicionar alunos.    |");
            System.out.println("           |     2 - Remover alunos.      |");
            System.out.println("           |     3 - Selecionar idioma.   |");
            System.out.println("           |     4 - Alterar Senha        |");
            System.out.println("           |     5 - Voltar.              |");
            System.out.println("           |     0 - Fechar Programa.     |");
            System.out.printf("           ================================\n>> ");            
            escolha = scan.nextInt();
            switch (escolha) {
                case 1:
                    adicionarAlunos(herois);
                    break;
                case 2:
                    removerAlunos(herois);
                    break;
                case 3:
                    selecionarIdioma(herois);
                    break;
                case 4:
                    mudarSenha(herois);
                    break;
                case 5: {
                    menuDeAcesso(herois);
                    break;
                }
                default:
                    System.out.println("**Escolha uma opcao valida!**");
            }
        } while (escolha != 0);
    }

	// Metodo que adiciona os alunos aos slots de herois.
    public void adicionarAlunos(Herois herois) {
        char continua = 'S';
        //Imprime todos os slots de heroi que estao disponiveis ou nao.
        herois.ListaChar();
        while (continua == 'S') {
            //Cria um perfil de heroi para o aluno.
            herois.seletor();
            System.out.printf("Continuar adicionando? S/N\n>> ");            
            continua = (scan.next()).toUpperCase().charAt(0);
        }
        herois.ListaChar();
    }

    // Metodo que remove os alunos dos slots de herois.
    public void removerAlunos(Herois herois) {
        char continua = 'S';

        herois.ListaChar();
        while (continua == 'S') {
            herois.delete();
            System.out.printf("Continuar removendo? S/N\n>> ");
            continua = (scan.next()).toUpperCase().charAt(0);
        }
        herois.ListaChar();
    }

    // Metodo que seleciona o idioma
    public void selecionarIdioma(Herois herois) {
        
            System.out.println("\n           ================================");
            System.out.println("           |     Escolha o idioma:        |");
            System.out.println("           |                              |");
            System.out.println("           |     1 - Ingles               |");
            System.out.println("           |     2 - Alemao               |");
            System.out.println("           |     3 - Espanhol             |");
            System.out.println("           |     4 - Frances              |");            
            System.out.println("           |     5 - Voltar.              |");
            System.out.println("           |     0 - Fechar Programa.     |");
            System.out.printf("           ================================\n>> ");
            escolha = scan.nextInt();
            switch (escolha) {
                case 1:
                    Dicionario.setLingua("ingles");
                    break;
                case 2:
                	Dicionario.setLingua("alemao");
                    break;
                case 3:
                	Dicionario.setLingua("espanhol");
                    break;
                case 4:
                	Dicionario.setLingua("frances");
                    break;
                case 5: {
                    break;
                }
                default:
                    System.exit(0);
            }
            System.out.println("Idioma configurado para \""+Dicionario.getLingua()+"\".");
        
    }

    // Metodo que remove palavra baseada no idioma escolhido
    //arrumar....
    public void mudarSenha(Herois herois) {
        System.out.println("Digite a nova senha de perfil de acesso de professor:");
        String novaSenha = scan.next();
        acesso = novaSenha;
	System.out.println("Senha alterada com sucesso!");
    }
}
