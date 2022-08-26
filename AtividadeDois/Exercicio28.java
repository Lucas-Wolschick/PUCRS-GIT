//  Autor: Lucas Silveira Wolschick
//Data: 23/08
import java.util.Scanner;
import java.util.Locale;

public class Exercicio28 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner teclado = new Scanner(System.in);

        float numero,quadrado,cubo;
        //System.out.println("");
        numero = teclado.nextFloat();
        quadrado= numero*numero;
        cubo= numero*numero*numero;
        
    
        //System.out.println("");
        System.out.printf("%.4f\n", (quadrado));
        System.out.printf("%.4f\n", (cubo));
        System.out.printf("%.4f\n", (Math.sqrt(numero)));
        System.out.printf("%.4f\n", (Math.cbrt(numero)));
        


    }
}
