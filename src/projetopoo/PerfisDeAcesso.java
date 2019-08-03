/*
 * CLASSE DE PERFIS DE ACESSO, EXIBE O MENU INICIAL.
 */
package projetopoo;

import java.util.Scanner;

public class PerfisDeAcesso {

    // A senha inicial para o sistema.
    protected static String acesso = "PROFESSOR";
    Scanner scan = new Scanner(System.in);
    private int numero;
    private String senha;

    // Metodo que imprime o menu inicial.
    public void menuDeAcesso(Herois herois) throws NumeroInvalidoException {
        System.out.println("\n           =============================================");
        System.out.println("           |     Perfil de Acesso Aluno ou professor?  |");
        System.out.println("           |                                           |");
        System.out.println("           |     1 - Professor.                        |");
        System.out.println("           |     2 - Aluno.                            |");
        System.out.println("           |     0 - Fechar Programa.                  |");
        System.out.printf("           =============================================\n>> ");
        
        numero = NumeroInteiro.RetornaNumeroInteiro();        
                
        // Eh chamado o metodo para o acesso ao perfil de aluno ou professor.
        usuario(herois);
    }

    // Metodo que retorna o numero de acesso escolhido pelo usuario.
    public int retornaNumero() {
        return numero;
    }

    // Metodo que recebe os herois e chama o perfil de acordo com a escolha do usuario.
    public void usuario(Herois herois) throws NumeroInvalidoException {
        if (this.numero == 1) {
            int i = 0;
            do {
                // Eh criado um novo perfil de professor.  
                System.out.println("\n           =============================================");
                System.out.println("           |           **Perfil restrito!**            |");
                System.out.println("           |                                           |");
                System.out.println("           |      Digite a senha para continuar:       |");                
                System.out.printf("           =============================================\n>> ");
                senha = scan.next();
                
                // Para o acesso ao perfil de professor deve-se acertar a senha,
                // Errando 3 vezes o programa eh encerrado.
                if (senha.equals(this.acesso)) {
                    new Professor(herois);
                } else {
                    System.out.println("           |           **SENHA INCORRETA!**            |");
                    i++;
                    if (i == 3) {
                        System.out.printf("*** SENHA INCORRETA DIGITADA MUITAS "
                                + "VEZES ***\n*** Contate o responsavel pelo sistema! ***");
                        System.out.printf("        |           ** PROGRAMA ENCERRADO **        |\n\n>> ");
                        System.exit(0);
                    }
                }
            } while (i < 3);
            
        } else if (this.numero == 2) {
            // Eh criado um novo perfil de aluno.
            new Aluno(herois);
        } else if (this.numero == 0) {
            System.out.printf("        |           ** PROGRAMA ENCERRADO **        |\n\n>> ");
            System.exit(0);
        } else {            
            System.out.println("           |       **Escolha uma opcao valida!**       |");
            menuDeAcesso(herois);
        }
    }
}
