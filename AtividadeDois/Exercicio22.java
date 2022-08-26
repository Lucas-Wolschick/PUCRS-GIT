//  Autor: Lucas Silveira Wolschick
//Data: 23/08
import java.util.Scanner;
import java.util.Locale;


public class Exercicio22 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner teclado = new Scanner(System.in);
        
        float raio;
        float  circunferencia;
        float area,volume;
        //System.out.println("");
        raio = teclado.nextFloat();
        circunferencia = Float.parseFloat(Double.toString(Math.PI)) *(raio*2);
        System.out.printf("%.4f\n", (circunferencia));
        area= Float.parseFloat(Double.toString(Math.PI)) *(raio*raio);
        System.out.printf("%.4f\n", (area));
        volume= ((4* Float.parseFloat(Double.toString(Math.PI)))/3)*raio*raio*raio;
        System.out.printf("%.4f\n", (volume));

    }
}
