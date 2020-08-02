import java.util.Scanner;

public class PatronWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );
        int patron = 0;

        while ( patron != -1 ) {
            patron = entrada.nextInt( );
            figura( patron );
        }
        
    }

    public static void figura( int patron ) {
        
        int contador;
        int contadora;
        String asteriscos = " * " ;
        String asterisco = " * " ;
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        contador = 0;

        if( a == patron ){
            System.out.printf( "%16s \"A\"\n", "Patron");
            while (contador != 10 ){
                System.out.print( asteriscos );
                asteriscos += asterisco;
                System.out.println( );
                contador++;
            }
        }

        if( b == patron ){
            System.out.printf( "%16s \"B\"\n", "Patron");
            contadora = 10;
            while (contadora > 0 ){
                contador = 0;
                while (contador != contadora ){
                    System.out.print( asteriscos );
                    contador++;
                }
            System.out.println( );
            contadora--;
            }
        }

        if( c == patron ){
            System.out.printf( "%16s \"C\"\n", "Patron");
            contadora = 10;
            while (contadora >= 1 ){
                contador = 1;
                asteriscos = asterisco;
                while (contador != contadora ){
                    asteriscos += asterisco;
                    contador++;
                }
                System.out.printf( "%30s", asteriscos );
                System.out.println( );
                contadora--;
            }

        }

        if( d == patron ){
            System.out.printf( "%16s \"D\"\n", "Patron");
            contador = 0 ;
            while (contador != 10 ){
                System.out.printf( "%30s", asteriscos );
                asteriscos += asterisco;
                System.out.println( );
                contador++;
            }

        }
    }
}