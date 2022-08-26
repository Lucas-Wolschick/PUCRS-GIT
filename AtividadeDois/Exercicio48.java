//  Autor: Lucas Silveira Wolschick
//Data: 23/08
import java.util.Scanner;
import java.util.Locale;

public class Exercicio48 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner teclado = new Scanner(System.in);
        
     double min, hora;
        hora= teclado.nextDouble();

        min = (Math.floor(hora)*60)+((hora-Math.floor(hora))*100);
        System.out.println(min);

        //pegar o num arredonda para baixo *60 pega o num e o num menos o arredondado por   baixo soma
        
       
        

    }
}
