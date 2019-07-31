/*
 * IMPRIME UMA MENSAGEM DE ERRO CASO OCORRA A EXCECAO.
 */
package projetopoo;

public class NumeroInvalidoException extends Exception{
    public NumeroInvalidoException() {
        System.out.println("           |       **Escolha uma opcao valida!**       |");
    }    
}
