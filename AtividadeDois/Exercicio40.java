//  Autor: Lucas Silveira Wolschick
//Data: 23/08
import java.util.Scanner;
import java.util.Locale;

public class Exercicio40 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner teclado = new Scanner(System.in);

        float angulo, altura, comprimento,radiano;
        
        
        // System.out.println("");
        angulo = teclado.nextInt();
        // System.out.println("");
        altura = teclado.nextInt();
        radiano=angulo*(Float.parseFloat(Double.toString(Math.PI))/180);
        comprimento= altura/radiano;


        
        System.out.printf("%.4f", comprimento);
        // resultado esta diferindo do teste(pdf)
    }
}
