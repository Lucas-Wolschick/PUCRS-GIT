//  Autor: Lucas Silveira Wolschick
//Data: 23/08
import java.util.Scanner;
import java.util.Locale;

public class Exercicio26 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner teclado = new Scanner(System.in);

        int nlados, diagonais;
        
        
        //System.out.println("");
        nlados = teclado.nextInt();
        
        diagonais = (nlados*(nlados -3))/2;
        System.out.println( (diagonais));

    }
}