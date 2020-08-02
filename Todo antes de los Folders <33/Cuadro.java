import java.util.Scanner;
public class Cuadro {
    
    public void mostrarCuadro( ){
        Scanner entrada = new Scanner( System.in );

        int contador1;
        int contador2;
        int x;
        int y;

        contador1 = 0 ;
        contador2 = 2 ;

        System.out.print( "X: " );
        x = entrada.nextInt( );

        System.out.print( "Y: " );
        y = entrada.nextInt( );


        while ( contador1 != x ){
            System.out.print( " * " );
            contador1++;
        }
        System.out.println("");


        while ( contador2 != y ) {
            System.out.print( " * " );
            contador1 = 2;
            while (contador1 != x ){
                    System.out.print( "   " );
                    contador1++;
                }
            System.out.println( " * " );
            contador2++;
        }

        contador1 = 0;

        while ( contador1 != x ){
            System.out.print( " * " );
            contador1 = contador1 + 1 ;
        }
        System.out.println( " " );
    }
}