//  Autor: Lucas Silveira Wolschick
//Data: 23/08
import java.util.Scanner;
import java.util.Locale;

public class Exercicio46 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner teclado = new Scanner(System.in);

        float d1, d2, area, energiaTotal;
        d1 = teclado.nextFloat();
        d2 = teclado.nextFloat();
        area=d1*d2;
        energiaTotal= 18*area;
        System.out.printf("%.4f\n", (area));
        System.out.printf("%.4f\n", (energiaTotal));

    }
}
