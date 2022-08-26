//  Autor: Lucas Silveira Wolschick
//Data: 23/08
import java.util.Scanner;
import java.util.Locale;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner teclado = new Scanner(System.in);

        float num2, num1;
        float resposta = 0;
       // System.out.println("");
        num1 = teclado.nextFloat();
       // System.out.println("");
        num2 = teclado.nextFloat();
        resposta = ((num1*2) + (num2*3))/5;
        System.out.printf("%.4f", (resposta));

    }
}
