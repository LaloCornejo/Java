import java.util.Scanner;
public class Avion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int primera[] = new int[ 6 ];
        int economica[] = new int[ 6 ];    

        for( int lugares = 12; lugares!= 0; ){
            System.out.printf( "\n%39s\n%40s\n", "Bienvenido al Aeropuerto de Lalo", "----------------------------------" );
            System.out.printf( "%29s\n\n", "Asientos libres" );
            System.out.printf( "%27s\n", "Primera:" );
            for( int contador = 0; contador != primera.length ; ++contador ){
                if( primera[ contador ] == 0 ){
                    System.out.printf( "%13s", "|" );
                    System.out.printf( " %d ", contador + 1 );
                    System.out.printf( "|" );
                    if( contador % 2 != 0 )
                        System.out.println();
                }else{
                    System.out.printf( "%13s", "|" );
                    System.out.printf( " %s ", "X" );
                    System.out.printf( "|" );
                    if( contador % 2 != 0 )
                        System.out.println();
                }
            }
    
            System.out.printf( "%28s\n", "Economica:" );
    
            for( int contador = 0; contador != economica.length ; ++contador ){
                if( economica[ contador ] == 0 ){
                    System.out.printf( "%13s", "|" );
                    System.out.printf( " %d ", contador + 7 );
                    System.out.printf( "|" );
                    if( contador % 2 != 0 )
                        System.out.println();
                }else{
                    System.out.printf( "%13s", "|" );
                    System.out.printf( " %s ", "X" );
                    System.out.printf( "|" );
                    if( contador % 2 != 0 )
                        System.out.println();
                }
            }     
            
            System.out.printf( "\n%s\n%s", "1 = Primera | 2 = Economica " , "En que clase quiere estar: " );
            int clase = scanner.nextInt();

            if( clase == 1 ){
                for( int contador = 0; contador != primera.length ; ++contador ){
                    if( primera[ contador ] == 0 ){
                        System.out.printf( "%13s", "|" );
                        System.out.printf( " %d ", contador + 1 );
                        System.out.printf( "|" );
                        if( contador % 2 != 0 )
                            System.out.println();
                    }else{
                        System.out.printf( "%13s", "|" );
                        System.out.printf( " %s ", "X" );
                        System.out.printf( "|" );
                        if( contador % 2 != 0 )
                            System.out.println();
                    }
                }

                System.out.printf( "\nQue asiento quiere: " );
                int asiento = scanner.nextInt() - 1;
                if( primera[ asiento ] == 0 ){
                    primera[ asiento ]++;
                    lugares--;
                    System.out.printf( "%50s\n|%40s%24s\n%s%64s\n%s%25s%21s%d%17s\n%s%64s\n%s\n\n", " _______________________________________________________________",
                                                                                                                    "Aeropuerto de Lalo",                       "|",
                                                                                                "|",                                                            "|",
                                                                                                "|",             "Clase: Primera",     "Asiento: ",asiento + 1, "|",
                                                                                                "|",                                                            "|",
                                                                                                "|_______________________________________________________________|");

                }else
                System.out.printf( "\n%41s\n%5s%37s\n%42s\n%42s\n\n%s\n", "____________________________________","|", "|", "| ERES TONTO O QUE?, HAZLO DE NUEVO. |",
                "|____________________________________|", "--------------------------------------------------" );
            }
            if( clase == 2 ){
                for( int contador = 0; contador != economica.length ; ++contador ){
                    if( economica[ contador ] == 0 ){
                        System.out.printf( "%13s", "|" );
                        System.out.printf( " %d ", contador + 7 );
                        System.out.printf( "|" );
                        if( contador % 2 != 0 )
                            System.out.println();
                    }else{
                        System.out.printf( "%13s", "|" );
                        System.out.printf( " %s ", "X" );
                        System.out.printf( "|" );
                        if( contador % 2 != 0 )
                            System.out.println();
                    }
                }     

                System.out.printf( "\nQue asiento quiere: " );
                int asiento = scanner.nextInt() - 7;
                if( economica[ asiento ] == 0 ){
                    economica[ asiento ]++;
                    lugares--;
                    System.out.printf( "%50s\n|%40s%24s\n%s%64s\n%s%25s%21s%d%16s\n%s%64s\n%s\n\n", " _______________________________________________________________",
                                                                                                                        "Aeropuerto de Lalo",                       "|",
                                                                                                    "|",                                                            "|",
                                                                                                    "|",             "Clase: Economica",     "Asiento: ",asiento + 7, "|",
                                                                                                    "|",                                                            "|",
                                                                                                    "|_______________________________________________________________|");

                }else
                System.out.printf( "\n%41s\n%5s%37s\n%42s\n%42s\n\n%s\n", "____________________________________","|", "|", "| ERES TONTO O QUE?, HAZLO DE NUEVO. |",
                "|____________________________________|", "--------------------------------------------------" );
            }
        }

        System.out.printf( "\n%29s\n\n", "Asientos libres" );
        System.out.printf( "%27s\n", "Primera:" );
        for( int contador = 0; contador != primera.length ; ++contador ){
            if( primera[ contador ] == 0 ){
                System.out.printf( "%13s", "|" );
                System.out.printf( " %d ", contador + 1 );
                System.out.printf( "|" );
                if( contador % 2 != 0 )
                    System.out.println();
            }else{
                System.out.printf( "%13s", "|" );
                System.out.printf( " %s ", "X" );
                System.out.printf( "|" );
                if( contador % 2 != 0 )
                    System.out.println();
            }
        }

        System.out.printf( "%28s\n", "Economica:" );

        for( int contador = 0; contador != economica.length ; ++contador ){
            if( economica[ contador ] == 0 ){
                System.out.printf( "%13s", "|" );
                System.out.printf( " %d ", contador + 7 );
                System.out.printf( "|" );
                if( contador % 2 != 0 )
                    System.out.println();
            }else{
                System.out.printf( "%13s", "|" );
                System.out.printf( " %s ", "X" );
                System.out.printf( "|" );
                if( contador % 2 != 0 )
                    System.out.println();
            }
        }     

        System.out.printf( "%13s___________________\n%13s%20s\n%13s%20s\n%13s%16s%4s\n%13s%20s\n%13s___________________%s\n", " ", "|", "|", "|", "|", "|", " AVION LLENO ", "|", "|", "|", "|", "|" );
    }
}   