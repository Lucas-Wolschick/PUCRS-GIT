//  Autor: Lucas Silveira Wolschick
//Data: 23/08
import java.util.Scanner;
import java.util.Locale;

public class Exercicio12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner teclado = new Scanner(System.in);

        float valorDeVendas,salario;
        float comissao ;
        float  salarioFinal;
        // System.out.println("");
        salario = teclado.nextFloat();
        // System.out.println("");
        valorDeVendas = teclado.nextFloat();
        comissao = (valorDeVendas*4)/100;
        salarioFinal= salario+comissao;
        System.out.printf("%.4f\n", (comissao));
        System.out.printf("%.4f", (salarioFinal));

    }
}
