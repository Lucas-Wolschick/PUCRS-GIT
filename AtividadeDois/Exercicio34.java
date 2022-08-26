//  Autor: Lucas Silveira Wolschick
//Data: 23/08
import java.util.Scanner;
import java.util.Locale;

public class Exercicio34 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner teclado = new Scanner(System.in);

        float precoDeFabrica, percentualDeLucro, percentualDeImposto;
        float lucroDistrubuidor, impostos, valorfinal;
        // System.out.println("");
        precoDeFabrica = teclado.nextFloat();
        // System.out.println("");
        percentualDeLucro = teclado.nextFloat();
        // System.out.println("");
        percentualDeImposto = teclado.nextFloat();
        lucroDistrubuidor = precoDeFabrica * (percentualDeLucro / 100);
        impostos = precoDeFabrica * (percentualDeImposto / 100);
        valorfinal = precoDeFabrica + impostos + lucroDistrubuidor;
        System.out.printf("%.4f\n", (lucroDistrubuidor));
        System.out.printf("%.4f\n", (impostos));
        System.out.printf("%.4f\n", (valorfinal));

    }
}
