import java.util.Scanner;
public class Diagona {
    public static void main(String[] args) {
        int pisos[][] = new int[ 20 ][ 20 ];
        Scanner scanner = new Scanner( System.in );
        int contadory = 0;
        int vuelta = 0;
        int estado = scanner.nextInt();
        int filaInicial = 0;
        int columnaInicial = 0;
        int filaFinal = 0;
        int columnaFinal = 0;

        while ( estado != 9 ){

            if( estado == 1 ){
                System.out.print( "En que direccion quieres? " );
                vuelta = scanner.nextInt();
                if( estado == 1 & vuelta == 0 | estado == 1 & vuelta == 6 ){
                    System.out.print( "En que fila inicia? " );
                    filaInicial = scanner.nextInt() - 1;
                    System.out.print( "En que columna inicia? " );
                    columnaInicial = scanner.nextInt() - 1;
                    System.out.print( "En que columna termina? " );
                    columnaFinal = scanner.nextInt() - 1;
                        for( columnaInicial = columnaInicial; columnaInicial <= columnaFinal; columnaInicial++ ){
                            if( pisos[ columnaInicial ][ filaInicial ] == 0 ){
                                pisos[ columnaInicial ][ filaInicial ]++;
                            }                
                        }
                }
            }
            
            if( estado == 1 & vuelta == 3 | estado == 1 & vuelta == 9 ){
                System.out.print( "En que fila inicia? " );
                filaInicial = scanner.nextInt() - 1;
                System.out.print( "En que columna inicia? " );
                columnaInicial = scanner.nextInt() - 1;
                System.out.print( "En que fila termina? " );
                filaFinal = scanner.nextInt() - 1;
                while( filaInicial <= filaFinal){
                    if( pisos[ columnaInicial ][ filaInicial ] == 0 ){
                        pisos[ columnaInicial ][ filaInicial ]++;
                    }
                    filaInicial++; 
                }
            }

            if( estado == 1 & vuelta == 2 ){
                System.out.print( "En que fila inicia? " );
                filaInicial = scanner.nextInt() - 1;
                System.out.print( "En que columna inicia? " );
                columnaInicial = scanner.nextInt() - 1;
                System.out.print( "En que fila termina? " );
                filaFinal = scanner.nextInt() - 1;
                System.out.print( "En que columna termina? " );
                columnaFinal = scanner.nextInt() - 1;
                while( filaInicial <= filaFinal ){
                    if( pisos[ columnaInicial ][ filaInicial ] == 0 ){
                        pisos[ columnaInicial ][ filaInicial ]++;
                    }  
                    filaInicial++;
                    columnaInicial++;              
                }
            }

            if( estado == 1 & vuelta == 4 ){
                System.out.print( "En que fila inicia? " );
                filaInicial = scanner.nextInt() - 1;
                System.out.print( "En que columna inicia? " );
                columnaInicial = scanner.nextInt() - 1;
                System.out.print( "En que fila termina? " );
                filaFinal = scanner.nextInt() - 1;
                System.out.print( "En que columna termina? " );
                columnaFinal = scanner.nextInt() - 1;
                while( filaInicial >= filaFinal ){
                    if( pisos[ columnaInicial ][ filaInicial ] == 0 ){
                        pisos[ columnaInicial ][ filaInicial ]++;
                    }  
                    filaInicial--;
                    columnaInicial++;              
                }
            }        

            for( int contadorx = 0; contadorx <= 19; contadorx++ ){
                contadory = 0;
                System.out.print( " " );
                for( contadory = 0; contadory <= 19; contadory++ ){
                    if( pisos[ contadory ][ contadorx ] == 1 ){
                        System.out.print( " * " );
                    }else{
                        System.out.print( "   " );
                    }
                }
                System.out.println();
            }
            estado = scanner.nextInt();

            if( estado == 6 ){
                for( int contadorx = 0; contadorx <= 19; contadorx++ ){
                    contadory = 0;
                    System.out.print( " " );
                    for( contadory = 0; contadory <= 19; contadory++ ){
                        System.out.printf( " %d ", pisos[ contadory ][ contadorx ] );
                    }
                    System.out.println();
                }
                estado = scanner.nextInt();
            }


        }

        /*System.out.println( " _________________________________________ ");
        for( int contador = 0; contador <= 20; contador++ ){
            System.out.printf( "%s%42s\n", "|", "|" );
        }
        System.out.println( "|-----------------------------------------|" );
*/
    }
}