import java.util.Scanner;
public class asteriscos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );

        int a, b, c, d, e;
        //int contador = 0 ;

        System.out.print( "Escribe el primer numero: " );
        a = entrada.nextInt();

        System.out.print( "Escribe el segundo numero: " );
        b = entrada.nextInt();

        System.out.print( "Escribe el tercer numero: " );
        c = entrada.nextInt();

        System.out.print( "Escribe el cuarto numero: " );
        d = entrada.nextInt();

        /*while( contador != a ){
            System.out.print( " * " );
            contador++;
        }
        System.out.println();
        contador = 0;

        while( contador != b ){
            System.out.print( " * " );
            contador++;
        }
        System.out.println();
        contador = 0;

        while( contador != c ){
            System.out.print( " * " );
            contador++;
        }
        System.out.println();
        contador = 0;

        while( contador != d ){
            System.out.print( " * " );
            contador++;
        }
        System.out.println();*/

        for( int contador = 0 ; contador != a ; contador++ ){
            System.out.print( " * " );
        } System.out.println( );

        for( int contador = 0 ; contador != b ; contador++ ){
            System.out.print( " * " );
        } System.out.println( );
        
        for( int contador = 0 ; contador != c ; contador++ ){
            System.out.print( " * " );
        } System.out.println( );
        
        for( int contador = 0 ; contador != d ; contador++ ){
            System.out.print( " * " );
        } System.out.println( );
    }
}