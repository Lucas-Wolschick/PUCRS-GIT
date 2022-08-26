//  Autor: Lucas Silveira Wolschick
//Data: 23/08
import java.util.Scanner;
import java.util.Locale;

public class Exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner teclado = new Scanner(System.in);

        float percentual,salario;
        float valorDoAumento ;
        float  novoSalario;
        // System.out.println("");
        salario = teclado.nextFloat();
        // System.out.println("");
        percentual = teclado.nextFloat();
        valorDoAumento = (salario*percentual)/100;
        novoSalario= salario+valorDoAumento;
        System.out.printf("%.4f\n", (valorDoAumento));
        System.out.printf("%.4f", (novoSalario));

    }
}
