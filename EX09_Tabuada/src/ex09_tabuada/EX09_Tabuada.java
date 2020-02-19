/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex09_tabuada;

import java.util.Scanner;


/**
 *
 * @author BRUNOSILVA
 */
public class EX09_Tabuada {

    private static void mostraTabuada(int numero) {
        System.out.println("Tabuada do " + numero);
        for (int n = 1; n <= 10; n++) {
            System.out.println(numero + "x" + n + "=" + numero * n);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args ) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite um numero para calcular a tabuada");
            mostraTabuada(sc.nextInt());
        } catch (Exception e) {
            System.out.println("Valor inválido!!" + e.getMessage());
        }

    }

}
