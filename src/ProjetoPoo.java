/*
 * “STUDY FIGHT” - JOGO DE APRENDIZADO DE IDIOMAS BASEADO EM RPG DE TURNOS.
 *
 *  CLASSE PRINCIPAL DO JOGO ONDE OS PERFIS DE ACESSO SAO CHAMADOS.
 *
 *
 *  @authors:
 *  Erick F da Silva 
 *  Gabriel Araujo
 *
 *
 */


import java.util.Scanner;
import projetopoo.*;

public class ProjetoPoo {
    public static void main(String[] args) throws NumeroInvalidoException {        
        
        // Os herois (alunos) sao guardados aqui.
        Herois herois = new Herois(); 
        
        // O menu inicial para a escolha do perfil de acesso iniciado.
        PerfisDeAcesso acesso = new PerfisDeAcesso();
        // A base com os slots sao passados por parametro.
        acesso.menuDeAcesso(herois);               
    }
}
