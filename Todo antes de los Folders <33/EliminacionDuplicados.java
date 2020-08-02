import java.util.Scanner;
public class EliminacionDuplicados{
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );

        int arreglo[] = new int[ 5 ] ;

        System.out.println();
        System.out.printf( "\t%s\n","Escribe los numeros que quieras comparar\n" );

        for( int contador = 0 ; contador != arreglo.length ; contador++ ){
            System.out.printf( "Numero %d: ", contador + 1 );
            arreglo[ contador ] = entrada.nextInt();
        }

        System.out.println();

        System.out.printf( "\tLos numeros que no se repiten son\n");

        for( int contador = 0; contador != arreglo.length; contador++ ){
            if( arreglo[ contador ] != arreglo[ 1 ] 
            & arreglo[ contador ] != arreglo[ 2 ] 
            & arreglo[ contador ] != arreglo[ 3 ] 
            & arreglo[ contador ] != arreglo[ 4 ]  ){
                System.out.printf( "\t%d\n", arreglo[ contador ] );
            }
            else if( arreglo[ contador ] != arreglo[ 0 ] 
            & arreglo[ contador ] != arreglo[ 2 ] 
            & arreglo[ contador ] != arreglo[ 3 ] 
            & arreglo[ contador ] != arreglo[ 4 ]  ){
                System.out.printf( "\t%d\n", arreglo[ contador ] );
            }
            else if( arreglo[ contador ] != arreglo[ 0 ] 
            & arreglo[ contador ] != arreglo[ 1 ] 
            & arreglo[ contador ] != arreglo[ 3 ] 
            & arreglo[ contador ] != arreglo[ 4 ]  ){
                System.out.printf( "\t%d\n", arreglo[ contador ] );
            }
            else if( arreglo[ contador ] != arreglo[ 0 ] 
            & arreglo[ contador ] != arreglo[ 1 ] 
            & arreglo[ contador ] != arreglo[ 2 ] 
            & arreglo[ contador ] != arreglo[ 4 ]  ){
                System.out.printf( "\t%d\n", arreglo[ contador ] );
            }
            else if( arreglo[ contador ] != arreglo[ 0 ] 
            & arreglo[ contador ] != arreglo[ 1 ] 
            & arreglo[ contador ] != arreglo[ 2 ] 
            & arreglo[ contador ] != arreglo[ 3 ]  ){
                System.out.printf( "\t%d\n", arreglo[ contador ] );
            }

        }
    }
}