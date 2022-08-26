//  Autor: Lucas Silveira Wolschick
//Data: 23/08
import java.util.Scanner;
import java.util.Locale;

public class Exercicio42 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner teclado = new Scanner(System.in);
        float tamEscada, altura,calc1;
        double dist;
        tamEscada= teclado.nextFloat();
        altura= teclado.nextFloat();
        calc1=(tamEscada*tamEscada)-(altura*altura);
        dist=Math.sqrt(calc1);

        
        System.out.printf("%.4f",dist );
        // resultado esta diferindo do teste(pdf)
    }
}
