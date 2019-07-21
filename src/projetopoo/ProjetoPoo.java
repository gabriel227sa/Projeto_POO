/*
 *  O SEGUINTE PROJETO CONSISTE EM UM JOGO...
 *
 *
 *
 *
 *
 *
 *  @author Gabriel Araújo
 *
 *
 *
 */

package projetopoo;

import java.util.Scanner;

public class ProjetoPoo {
    public static void main(String[] args) {        
        
        // Os herois (alunos) são guardados aqui.
        Herois herois = new Herois(); 
        // O menu inicial para a escolha do perfil de acesso é iniciado.
        PerfisDeAcesso acesso = new PerfisDeAcesso();
        // A base com os slots são passado por parâmetro.
        acesso.menuDeAcesso(herois);               
    }
}
