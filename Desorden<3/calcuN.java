import java.util.Scanner;
public class calcuN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );

        int n;
        int factorial;

        System.out.print( "Escriba \"n\": " );
        n = entrada.nextInt();

        factorial = 1 ;

        if ( n == 0 );{
            System.out.println( "1" );
        }
        while ( n != 0 ){
            factorial = factorial * n ;
            n--;
        }
        System.out.println( factorial );
    }
}