import java.util.Random;
public class VentasTotales{
    public static void main(String[] args) {
        Random random = new Random();
        int precio1 = 0;
        int precio2 = 0;
        int precio3 = 0;
        int precio4 = 0;
        int precio5 = 0;

        int cantidadtotal1 = 0;
        int cantidadtotal2 = 0;
        int cantidadtotal3 = 0;
        int cantidadtotal4 = 0;
        int cantidadtotal5 = 0;
        int cantidadtotal6 = 0;
        int cantidadtotal7 = 0;
        int cantidadtotal8 = 0;
        int cantidadtotal9 = 0;
        int cantidadtotal10 = 0;
        int cantidadtotal11 = 0;
        int cantidadtotal12 = 0;
        int cantidadtotal13 = 0;
        int cantidadtotal14 = 0;
        int cantidadtotal15 = 0;
        int cantidadtotal16 = 0;
        int cantidadtotal17 = 0;
        int cantidadtotal18 = 0;
        int cantidadtotal19 = 0;
        int cantidadtotal20 = 0;

        System.out.printf( "%s\n|%42s%33s\n%s\n", " __________________________________________________________________________", " Vendedor 1 ", "|",
                                              "|--------------------------------------------------------------------------|" );
        for( int contador = 0; contador <= 30; contador++ ){

            int cantidad1 = 1 + random.nextInt( 19 );
            int cantidad2 = 1 + random.nextInt( 19 );
            int cantidad3 = 1 + random.nextInt( 19 );
            int cantidad4 = 1 + random.nextInt( 19 );
            int cantidad5 = 1 + random.nextInt( 19 );

            int vendedor1[][] = {{ cantidad1, 1 }, { cantidad2, 2 }, { cantidad3, 3 }, { cantidad4, 4 }, { cantidad5, 5 } }; 
            System.out.printf( "| Alemania: %-4d| Argentina: %-4d| Francia: %-4d| Japon: %-4d| Mexico: %-4d| \n"
            , vendedor1[ 0 ][ 0 ], vendedor1[ 1 ][ 0 ], vendedor1[ 2 ][ 0 ], vendedor1[ 3 ][ 0 ], vendedor1[ 4 ][ 0 ] );
            cantidadtotal1 += vendedor1[ 0 ][ 0 ];
            cantidadtotal2 += vendedor1[ 1 ][ 0 ];
            cantidadtotal3 += vendedor1[ 2 ][ 0 ];
            cantidadtotal4 += vendedor1[ 3 ][ 0 ];
            cantidadtotal5 += vendedor1[ 4 ][ 0 ];
            precio1 = vendedor1[ 0 ][ 1 ];
            precio2 = vendedor1[ 1 ][ 1 ];
            precio3 = vendedor1[ 2 ][ 1 ];
            precio4 = vendedor1[ 3 ][ 1 ];
            precio5 = vendedor1[ 4 ][ 1 ];
        }
        System.out.println( "|--------------------------------------------------------------------------|" );
        System.out.printf( "%s\n|%40s%31s\n%s\n", " ______________________________________________________________________", " Vendedor 2 ", "|",
        "|----------------------------------------------------------------------|" );
        for( int contador = 0; contador <= 30; contador++ ){

            int cantidad1 = 1 + random.nextInt( 19 );
            int cantidad2 = 1 + random.nextInt( 19 );
            int cantidad3 = 1 + random.nextInt( 19 );
            int cantidad4 = 1 + random.nextInt( 19 );
            int cantidad5 = 1 + random.nextInt( 19 );

            int vendedor1[][] = {{ cantidad1, 1 }, { cantidad2, 2 }, { cantidad3, 3 }, { cantidad4, 4 }, { cantidad5, 5 } }; 
            System.out.printf( "| China: %-4d| Corea: %-4d| Inglaterra: %-4d| España: %-4d| Suiza: %-4d| \n"
            , vendedor1[ 0 ][ 0 ], vendedor1[ 1 ][ 0 ], vendedor1[ 2 ][ 0 ], vendedor1[ 3 ][ 0 ], vendedor1[ 4 ][ 0 ] );
            cantidadtotal6 += vendedor1[ 0 ][ 0 ];
            cantidadtotal7 += vendedor1[ 1 ][ 0 ];
            cantidadtotal8 += vendedor1[ 2 ][ 0 ];
            cantidadtotal9 += vendedor1[ 3 ][ 0 ];
            cantidadtotal10 += vendedor1[ 4 ][ 0 ];
            precio1 = vendedor1[ 0 ][ 1 ];
            precio2 = vendedor1[ 1 ][ 1 ];
            precio3 = vendedor1[ 2 ][ 1 ];
            precio4 = vendedor1[ 3 ][ 1 ];
            precio5 = vendedor1[ 4 ][ 1 ];
        }
        System.out.println( "|----------------------------------------------------------------------|" );
        System.out.printf( "%s\n|%40s%30s\n%s\n", " _____________________________________________________________________", " Vendedor 3 ", "|",
        "|---------------------------------------------------------------------|" );
        for( int contador = 0; contador <= 30; contador++ ){

            int cantidad1 = 1 + random.nextInt( 19 );
            int cantidad2 = 1 + random.nextInt( 19 );
            int cantidad3 = 1 + random.nextInt( 19 );
            int cantidad4 = 1 + random.nextInt( 19 );
            int cantidad5 = 1 + random.nextInt( 19 );

            int vendedor1[][] = {{ cantidad1, 1 }, { cantidad2, 2 }, { cantidad3, 3 }, { cantidad4, 4 }, { cantidad5, 5 } }; 
            System.out.printf( "| Suecia: %-4d| Brasil: %-4d| Holanda: %-4d| Canada: %-4d| Rusia: %-4d| \n"
            , vendedor1[ 0 ][ 0 ], vendedor1[ 1 ][ 0 ], vendedor1[ 2 ][ 0 ], vendedor1[ 3 ][ 0 ], vendedor1[ 4 ][ 0 ] );
            cantidadtotal11 += vendedor1[ 0 ][ 0 ];
            cantidadtotal12 += vendedor1[ 1 ][ 0 ];
            cantidadtotal13 += vendedor1[ 2 ][ 0 ];
            cantidadtotal14 += vendedor1[ 3 ][ 0 ];
            cantidadtotal15 += vendedor1[ 4 ][ 0 ];
            precio1 = vendedor1[ 0 ][ 1 ];
            precio2 = vendedor1[ 1 ][ 1 ];
            precio3 = vendedor1[ 2 ][ 1 ];
            precio4 = vendedor1[ 3 ][ 1 ];
            precio5 = vendedor1[ 4 ][ 1 ];
        }
        System.out.println( "|---------------------------------------------------------------------|" );
        System.out.printf( "%s\n|%40s%31s\n%s\n", " ______________________________________________________________________", " Vendedor 4 ", "|",
        "|----------------------------------------------------------------------|" );
        for( int contador = 0; contador <= 30; contador++ ){

            int cantidad1 = 1 + random.nextInt( 19 );
            int cantidad2 = 1 + random.nextInt( 19 );
            int cantidad3 = 1 + random.nextInt( 19 );
            int cantidad4 = 1 + random.nextInt( 19 );
            int cantidad5 = 1 + random.nextInt( 19 );

            int vendedor1[][] = {{ cantidad1, 1 }, { cantidad2, 2 }, { cantidad3, 3 }, { cantidad4, 4 }, { cantidad5, 5 } }; 
            System.out.printf( "| Australia: %-4d| Italia: %-4d| Camerun: %-4d| Turkey: %-4d| USA: %-4d| \n"
            , vendedor1[ 0 ][ 0 ], vendedor1[ 1 ][ 0 ], vendedor1[ 2 ][ 0 ], vendedor1[ 3 ][ 0 ], vendedor1[ 4 ][ 0 ] );
            cantidadtotal16 += vendedor1[ 0 ][ 0 ];
            cantidadtotal17 += vendedor1[ 1 ][ 0 ];
            cantidadtotal18 += vendedor1[ 2 ][ 0 ];
            cantidadtotal19 += vendedor1[ 3 ][ 0 ];
            cantidadtotal20 += vendedor1[ 4 ][ 0 ];
            precio1 = vendedor1[ 0 ][ 1 ];
            precio2 = vendedor1[ 1 ][ 1 ];
            precio3 = vendedor1[ 2 ][ 1 ];
            precio4 = vendedor1[ 3 ][ 1 ];
            precio5 = vendedor1[ 4 ][ 1 ];
        }
        System.out.println( "|----------------------------------------------------------------------|" );
        System.out.println();
        System.out.printf( "%15s\n", " Vendedor 1 " );
        System.out.printf( "00: %-5d Total: $%d\n", cantidadtotal1, cantidadtotal1 * precio1 );
        System.out.printf( "01: %-5d Total: $%d\n", cantidadtotal2, cantidadtotal2 * precio2 );
        System.out.printf( "02: %-5d Total: $%d\n", cantidadtotal3, cantidadtotal3 * precio3 );
        System.out.printf( "03: %-5d Total: $%d\n", cantidadtotal4, cantidadtotal4 * precio4 );
        System.out.printf( "04: %-5d Total: $%d\n", cantidadtotal5, cantidadtotal5 * precio5 );
        System.out.printf( "%15s\n", " Vendedor 2 " );
        System.out.printf( "10: %-5d Total: $%d\n", cantidadtotal6, cantidadtotal6 * precio1 );
        System.out.printf( "11: %-5d Total: $%d\n", cantidadtotal7, cantidadtotal7 * precio2 );
        System.out.printf( "12: %-5d Total: $%d\n", cantidadtotal8, cantidadtotal8 * precio3 );
        System.out.printf( "13: %-5d Total: $%d\n", cantidadtotal9, cantidadtotal9 * precio4 );
        System.out.printf( "14: %-5d Total: $%d\n", cantidadtotal10, cantidadtotal10 * precio5 );
        System.out.printf( "%15s\n", " Vendedor 3 " );
        System.out.printf( "20: %-5d Total: $%d\n", cantidadtotal11, cantidadtotal11 * precio1 );
        System.out.printf( "21: %-5d Total: $%d\n", cantidadtotal12, cantidadtotal12 * precio2 );
        System.out.printf( "22: %-5d Total: $%d\n", cantidadtotal13, cantidadtotal13 * precio3 );
        System.out.printf( "23: %-5d Total: $%d\n", cantidadtotal14, cantidadtotal14 * precio4 );
        System.out.printf( "24: %-5d Total: $%d\n", cantidadtotal15, cantidadtotal15 * precio5 );
        System.out.printf( "%15s\n", " Vendedor 4 " );
        System.out.printf( "30: %-5d Total: $%d\n", cantidadtotal16, cantidadtotal16 * precio1 );
        System.out.printf( "31: %-5d Total: $%d\n", cantidadtotal17, cantidadtotal17 * precio2 );
        System.out.printf( "32: %-5d Total: $%d\n", cantidadtotal18, cantidadtotal18 * precio3 );
        System.out.printf( "33: %-5d Total: $%d\n", cantidadtotal19, cantidadtotal19 * precio4 );
        System.out.printf( "34: %-5d Total: $%d\n", cantidadtotal20, cantidadtotal20 * precio5 );
        System.out.println();
    }
}