//  Autor: Lucas Silveira Wolschick
//Data: 23/08
import java.util.Scanner;
import java.util.Locale;

public class Exercicio20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner teclado = new Scanner(System.in);

        float base, altura,area;
        
        
        //System.out.println("");
        base = teclado.nextFloat();
        //System.out.println("");
        altura = teclado.nextFloat();
        area = (base *altura)/2;
        System.out.printf("%.4f", (area));

    }
}
