package ex03_poo;

import java.util.Scanner;

/**
 *
 * @author BRUNOSILVA
 */
public class EX03_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Scanner ler = new Scanner(System.in);
            Funcionario f=new Funcionario();
            
            System.out.println("Digite o codigo do funcionario: ");
            f.setCodigo(ler.nextInt());
            System.out.println("Digite o nome do funcionario: ");
            f.setNome(ler.next());
            System.out.println("Digite o RG do funcionario: ");
            
            
            

        } catch (Exception e) {
            System.out.println("Ocorreu um erro!!!" + e.getMessage());
        }

    }

}
