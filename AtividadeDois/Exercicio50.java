//  Autor: Lucas Silveira Wolschick
//Data: 23/08
import java.util.Scanner;
import java.util.Locale;

public class Exercicio50 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner teclado = new Scanner(System.in);

        double custo, valorIngresso, valorArrecadado;
        int numIngresso;
        numIngresso = 0;
        valorArrecadado = 0;
        int x=0;
        

        custo = teclado.nextDouble();
        valorIngresso = teclado.nextDouble();
        for (int y; valorArrecadado < custo; numIngresso++) {
            valorArrecadado = numIngresso * valorIngresso;
           
        }
        System.out.println(numIngresso-1);

    }
}