import java.util.Scanner;
public class rombo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );

        System.out.print( "Escribe de cuantos rombos los quieres hacer(Tienen que ser un numero impar): " );
        int rombos = entrada.nextInt();

        System.out.println( );

        int espacios = rombos / 2 ;
        int espacios2 = ( rombos / 2 ) + 1 ;
        int asterisco = 1;

        for( int a = 1; a <= rombos ; a++ ){

            for( int b = 1; b<= espacios ; b++)
                System.out.print( "  " );
            
            for( int c = 1 ; c<= asterisco ; c++)
                System.out.print( "* " );

            System.out.println( );

            espacios = ( a < espacios2 ) ? espacios - 1 : espacios + 1;
            asterisco = ( a < espacios2 ) ? asterisco + 2 : asterisco - 2;
        }
        System.out.println( );
    }
}