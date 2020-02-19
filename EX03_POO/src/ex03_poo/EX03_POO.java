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
            Funcionario f = new Funcionario();

            System.out.println("Digite o codigo do funcionario: ");
            f.setCodigo(Integer.parseInt(ler.nextLine()));
            System.out.println("Digite o nome do funcionario: ");
            f.setNome(ler.nextLine());
            System.out.println("Digite o RG do funcionario: ");
            f.setRg(ler.nextLine());
            System.out.println("Digite o salario do funcionario: ");
            f.setSalario(ler.nextDouble());            

            System.out.println("Aperte 's' para exibir resultado ou qualquer tecla para sair! ");
            char resp = ler.next().toUpperCase().charAt(0);

            if (resp == 'S') {
                System.out.println(f.toString());
            } else {
                System.out.println("Saindo...");
            }

        } catch (NumberFormatException e) {
            System.out.println("Ocorreu um erro!!!" + e.getMessage());
        }

    }

}
