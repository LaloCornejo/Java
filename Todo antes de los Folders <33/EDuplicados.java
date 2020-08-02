import java.util.Scanner;
public class EDuplicados {
    public static void main(String[] args) {
     Scanner entrada = new Scanner( System.in );
     int arreglo[] = new int[ 100 ];

     System.out.println();
     System.out.printf( "\tCuantos numeros quieres comparar: " );
     int numeros[] = new int[ entrada.nextInt() ];   

     for( int contador = 0 ; contador != numeros.length ; contador++ ){
        System.out.printf( "Numero %d: ", contador + 1 );
        numeros[ contador ] = entrada.nextInt();
     }

     System.out.println();
     System.out.printf( "Los numeros que no se repiten son:\n");

     for( int contador = 0; contador != numeros.length; contador++ ){
        arreglo[ numeros[ contador ] ]++;
     }

     for( int contador = 0; contador != arreglo.length; contador++ ){
        if( arreglo[ contador ] == 1 )
            System.out.printf( "%10s   %2d  %3s\n", "||", contador, "||" );
     }
     
     System.out.println();

    }
}