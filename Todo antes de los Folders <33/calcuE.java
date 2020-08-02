import java.util.Scanner;
public class calcuE {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );
        
        int contador;
        int a;
        int b;
        int factorial;

        System.out.print( "Escriba hasta que numero: " );
        a = entrada.nextInt();

        factorial = 1 ;
        b = 1 ;
        contador = 1 ;
        double numeroe = 1.0;


        
        while ( contador <= a ){
            factorial = factorial * contador ;
            numeroe  = numeroe + (double) b / (double) factorial;
             contador++;
        }
        System.out.printf( "El valor de \"e\" es: %.4f\n", numeroe );
    }
}