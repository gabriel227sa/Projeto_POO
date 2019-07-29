/*
 *  O SEGUINTE PROJETO CONSISTE EM UM JOGO...
 *
 *
 *
 *
 *
 *
 *  @authors:
 *  Erick F da Silva 
 *  Gabriel Araujo
 *
 *
 *
 */

package projetopoo;

import java.util.Scanner;

public class ProjetoPoo {
    public static void main(String[] args) {        
        
        // Os herois (alunos) sao guardados aqui.
        Herois herois = new Herois(); 
        // O menu inicial para a escolha do perfil de acesso iniciado.
        PerfisDeAcesso acesso = new PerfisDeAcesso();
        // A base com os slots sÃ£o passado por parÃ¢metro.
        acesso.menuDeAcesso(herois);               
    }
}
