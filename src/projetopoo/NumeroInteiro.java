/*
 * CLASSE QUE DEVOLVE UM INTEIRO ESCOLHIDO PELO USUARIO, CASO NAO SEJA UM
 * NUMERO INTEIRO A EXCECAO EH TRATADA.
 */

package projetopoo;

import java.util.Scanner;

public class NumeroInteiro{
    Scanner sc = new Scanner(System.in);
    
    //Contrutor que retorna a funcao RetornaNumeroInteiro.
    public NumeroInteiro() {
        RetornaNumeroInteiro();
    }
    
    // O metodo le a entrada do usuario, caso seja valida retorna o numero inteiro.
    //caso contrario trata a excecao, fecha o programa apos 3 tentativas.
    public static int RetornaNumeroInteiro() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            try {
                return sc.nextInt();
            } catch (Exception e) {
                sc.next();                
                System.out.printf("           |           ** Digite um numero! **         |\n>> ");
                i++;
            }
        }        
        System.out.printf("        |           ** PROGRAMA ENCERRADO **        |\n\n>> ");
        System.exit(0);        
        return 0;
    }
}
