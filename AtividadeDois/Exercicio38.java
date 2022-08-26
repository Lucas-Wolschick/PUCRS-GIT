//  Autor: Lucas Silveira Wolschick
//Data: 23/08
import java.util.Scanner;
import java.util.Locale;

public class Exercicio38 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner teclado = new Scanner(System.in);

        float cat1, cat2, semihipo;
        double  hipotenusa;

        // System.out.println("");
        cat1 = teclado.nextInt();
        // System.out.println("");
        cat2 = teclado.nextInt();
        semihipo=(cat1*cat1)+(cat2*cat2);
        hipotenusa=Math.sqrt(semihipo);


        
        System.out.printf("%.4f", hipotenusa);

    }
}
