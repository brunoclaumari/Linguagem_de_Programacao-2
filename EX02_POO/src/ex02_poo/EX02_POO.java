
package ex02_poo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 082170034
 */
public class EX02_POO {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        int cont = 0;
        char resp;
        ArrayList<Jogo> games = new ArrayList<>();

        try {
            do {
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

                games.add(game);

                cont++;
                System.out.println("Deseja continuar o cadastro? S/N");
                resp = lendo.next().toUpperCase().charAt(0);

            } while (cont < 10 && resp != 'N');

            games.forEach(System.out::println);

        } catch (NumberFormatException | ParseException e) {

            System.out.println(e.getMessage());

        }

    }
}
