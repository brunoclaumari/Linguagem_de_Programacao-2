/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01_poo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 082170034
 */
public class EX01_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Jogo game = new Jogo();
        Scanner lendo = new Scanner(System.in);
        

        System.out.println("Digite o código do jogo: ");
        game.setCodigo(Integer.parseInt(lendo.next()));
        lendo.nextLine();

        System.out.println("Digite o nome do jogo: ");
        game.setNome(lendo.nextLine());

        System.out.println("Digite a categoria do jogo: ");
        game.setCategoria(lendo.nextLine());        

        System.out.println("Digite a data de lançamento do jogo: ");
        
        String dig = lendo.next();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = formato.parse(dig);
        game.setData(dt);

        System.out.println(game.toString());

    }

}
