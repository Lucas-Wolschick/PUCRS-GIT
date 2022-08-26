//  Autor: Lucas Silveira Wolschick
//Data: 23/08
import java.util.Scanner;
import java.util.Locale;

public class Exercicio16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner teclado = new Scanner(System.in);

        float horasTrabalhadas;
        float salarioMinimo, horasExtras;
        float salarioFinal,salarioBruto,valorHorasExtras;
        // System.out.println("");
        horasTrabalhadas = teclado.nextFloat();
        // System.out.println("");
        salarioMinimo = teclado.nextFloat();
        // System.out.println("");
        horasExtras = teclado.nextFloat();
        salarioBruto=horasTrabalhadas*(salarioMinimo/8);
        valorHorasExtras= horasExtras*(salarioMinimo/4);

        salarioFinal =salarioBruto+valorHorasExtras;

        System.out.printf("%.4f", (salarioFinal));

    }
}
