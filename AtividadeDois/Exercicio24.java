//  Autor: Lucas Silveira Wolschick
//Data: 23/08
import java.util.Scanner;
import java.util.Locale;

public class Exercicio24 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner teclado = new Scanner(System.in);

        float lado,area;
        
        
        //System.out.println("");
        lado = teclado.nextFloat();
        area = (lado*lado);
        System.out.printf("%.4f", (area));

    }
}
