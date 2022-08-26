//  Autor: Lucas Silveira Wolschick
//Data: 23/08
import java.util.Scanner;
import java.util.Locale;

public class Exercicio36 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner teclado = new Scanner(System.in);

        float depositoSaldo, cheque1, cheque2;
        float saldoAtual;
        // System.out.println("");
        depositoSaldo = teclado.nextFloat();
        // System.out.println("");
        cheque1 = teclado.nextFloat();
        // System.out.println("");
        cheque2 = teclado.nextFloat();
        saldoAtual = depositoSaldo - (cheque1 + cheque2 + (((cheque1 * 38) / 10000) + ((cheque2 * 38) / 10000)));
        
        System.out.printf("%.4f\n", (saldoAtual));
        // Duvida sobre aonde entra a % de 0,38...
        // é sobre os cheque ou a entrada na conta ?

    }
}
