/*
 * 
 */
package projetopoo;

import java.util.Scanner;

public class PerfisDeAcesso {

    Scanner scan = new Scanner(System.in);
    private int numero;
    private String senha;

    // Metodo que imprime o menu inicial.
    public void menuDeAcesso(Herois herois) {
        System.out.println("\n           =============================================");
        System.out.println("           |     Perfil de Acesso Aluno ou professor?  |");
        System.out.println("           |                                           |");
        System.out.println("           |     1 - Professor.                        |");
        System.out.println("           |     2 - Aluno.                            |");
        System.out.println("           |     0 - Fechar Programa.                  |");
        System.out.printf("           =============================================\n>> ");
        numero = scan.nextInt();
        // Eh chamado o metodo para o acesso ao perfil de aluno ou professor.
        usuario(herois);
    }

    // Metodo que retorna o numero de acesso escolhido pelo usuario.
    public int retornaNumero() {
        return numero;
    }

    // Metodo que recebe os herois e chama o perfil de acordo com a escolha do usuario.
    public void usuario(Herois herois) {
        if (this.numero == 1) {
            // Eh criado um novo perfil de professor.            
            System.out.printf("**Perfil restrito! Digite a senha para continuar :\n>> ");
            senha = scan.next();
            //Para o acesso ao perfil de professor deve-se acertar a senha.
            if (senha.equals("PROFESSOR")) {
                new Professor(herois);
            } else {
                System.out.println("**Escolha uma opÃ§Ã£o vÃ¡lida!**");
                menuDeAcesso(herois);
            }
        } else if (this.numero == 2) {
            // Eh criado um novo perfil de aluno.
            new Aluno(herois);
        } else if (this.numero == 0) {
            System.exit(0);
        } else {
            System.out.println("**Escolha uma opÃ§Ã£o vÃ¡lida!**");
            menuDeAcesso(herois);
        }
    }
}
