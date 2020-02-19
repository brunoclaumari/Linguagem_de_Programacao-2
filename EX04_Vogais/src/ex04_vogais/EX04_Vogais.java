/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

        4.	Vogais
        Faça um programa que tenha uma método void que recebe um nome 
        e o objetivo do método é escrever no vídeo 
        apenas as vogais deste nome.

 */
package ex04_vogais;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author BRUNOSILVA
 */
public class EX04_Vogais {

    public static ArrayList<String> vogais = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u"));

    public static void temVogal(String palavra) {
        String aux = "";
        for (int i = 0; i < palavra.length(); i++) {
            
            char carac= palavra.charAt(i);
            if (vogais.contains(Character.toString(carac).toLowerCase())) {
                aux += palavra.charAt(i);
            }
        }
        if (aux.length() == 0) {
            System.out.println("Não existe vogal nesta palavra!! ");
        } else {
            System.out.println("As vogais da palavra são: " + aux);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite alguma palavra: ");
        String dig = sc.nextLine();
        
        temVogal(dig);

    }

}
