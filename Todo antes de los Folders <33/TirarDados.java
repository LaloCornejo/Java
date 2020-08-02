import java.util.Random;
public class TirarDados {
    public static void main(String[] args) {
        Random random = new Random();
        int total = 0;
        int arregloTotal[] = new int[ 11 ];

        System.out.printf( "\tBienvenido a Tirar Dados\n" );
        System.out.printf( "%35s\n","------------------------------" );

        for( int contador = 0; contador != 36000; contador++ ){
            total = 0;
            int dado1 = 1 + random.nextInt( 6 );
            int dado2 = 1 + random.nextInt( 6 );
            total = dado1 + dado2;
            switch( total ){
                case 2:
                arregloTotal[ 0 ]++;
                break;
                case 3:
                arregloTotal[ 1 ]++;
                break;
                case 4:
                arregloTotal[ 2 ]++;
                break;
                case 5:
                arregloTotal[ 3 ]++;
                break;
                case 6:
                arregloTotal[ 4 ]++;
                break;
                case 7:
                arregloTotal[ 5 ]++;
                break;
                case 8:
                arregloTotal[ 6 ]++;
                break;
                case 9:
                arregloTotal[ 7 ]++;
                break;
                case 10:
                arregloTotal[ 8 ]++;
                break;
                case 11:
                arregloTotal[ 9 ]++;
                break;
                case 12:
                arregloTotal[ 10 ]++;
                break;

            }
        }
        System.out.printf( "%34s \n", "Frecuencia de suma de dados" );
        for( int contador = 0; contador != arregloTotal.length; contador++){
            System.out.printf( "Suma = %d: %d\n", contador + 2, arregloTotal[ contador ] );
        }
    }
}