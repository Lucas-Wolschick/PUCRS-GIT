//  Autor: Lucas Silveira Wolschick
//Data: 23/08
import java.util.Scanner;
import java.util.Locale;

public class Exercicio32 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner teclado = new Scanner(System.in);

        int anoNasc, anoAtual;

        // System.out.println("");
        anoNasc = teclado.nextInt();
        // System.out.println("");
        anoAtual = teclado.nextInt();

        System.out.println(anoAtual-anoNasc);
        System.out.println(2050-anoNasc);

    }
}
