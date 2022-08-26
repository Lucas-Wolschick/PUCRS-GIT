//  Autor: Lucas Silveira Wolschick
//Data: 23/08
import java.util.Scanner;
import java.util.Locale;

public class Exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner teclado = new Scanner(System.in);
        
        float  num1 ;
        float resposta ;
       // System.out.println("");
        num1 = teclado.nextFloat();
       
       num1=num1*90/100;
        
        resposta =  (num1) ;
        System.out.printf("%.4f", (resposta));

    }
}
