//  Autor: Lucas Silveira Wolschick
//Data: 23/08
import java.util.Scanner;
import java.util.Locale;

public class Exercicio18 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner teclado = new Scanner(System.in);

        float pesoKg, pesoGm;

        // System.out.println("");
        pesoKg = teclado.nextFloat();
        pesoGm = pesoKg * 1000;

        System.out.printf("%.4f", (pesoGm));

    }
}
