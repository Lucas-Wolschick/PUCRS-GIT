//  Autor: Lucas Silveira Wolschick
//Data: 23/08
import java.util.Scanner;
import java.util.Locale;

public class Exercicio14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner teclado = new Scanner(System.in);

        float conta1, salario;
        float  conta2;
        float salarioFinal;
        // System.out.println("");
        salario = teclado.nextFloat();
        // System.out.println("");
        conta1 = teclado.nextFloat();
        // System.out.println("");
        conta2 = teclado.nextFloat();

        salarioFinal = (salario - conta1 - conta2) - (((conta1 * 2) / 100) + ((conta2 * 2) / 100));

        System.out.printf("%.4f", (salarioFinal));

    }
}
