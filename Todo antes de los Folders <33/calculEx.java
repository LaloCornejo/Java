import java.util.Scanner;
public class calculEx {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );
        
        int contador;
        int a;
        int x;
        int factorial;

        System.out.print( "Escriba hasta que numero: " );
        a = entrada.nextInt();

        factorial = 1 ;
        contador = 1 ;
        double numeroe = 1.0;
        x = 1; 
        
        while ( contador <= a ){
             x = x * a ;
             System.out.println( x );
             factorial = factorial * contador ;
             numeroe  = numeroe + x / (double) factorial;
             contador++;
        }
        System.out.printf( "El valor de \"e\" es: %.4f\n", numeroe );
    }
}