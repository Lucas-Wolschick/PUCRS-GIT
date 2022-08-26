//  Autor: Lucas Silveira Wolschick
//Data: 23/08
import java.util.Scanner;
import java.util.Locale;

public class Exercicio44 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner teclado = new Scanner(System.in);

        float reais, dolar, euros, libra;
        float rdolar, reuro, rlibra;

        // System.out.println("");
        reais = teclado.nextFloat();
        dolar = 3.07f;
        euros = 3.30f;
        libra = 3.79f;
        rdolar = reais / dolar;
        reuro = reais / euros;
        rlibra = reais / libra;
        System.out.printf("%.4f\n", (rdolar));
        System.out.printf("%.4f\n", (reuro));
        System.out.printf("%.4f\n", (rlibra));

    }
}