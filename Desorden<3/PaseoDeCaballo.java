import java.util.Scanner;
import java.util.Random;
public class PaseoDeCaballo{
    public static void main(String[] args) {
        int tablero[][] = new int [ 8 ][ 8 ];
        Scanner scanner = new Scanner( System.in );
        Random random = new Random();
        int posicionFilaActual = 0;
        int posicionColActual = 0;
        int contador = 1;
        int caso = 0;

        mostrarTablero( tablero );
        System.out.printf( "%s\n","( Espacio en medio de los numeros,\n1º numero = fila, 2º numero = columna )" );
        System.out.print( "En que Fila iniciar? " );
        posicionFilaActual = scanner.nextInt();
        System.out.print( "En que Columna iniciar? " );
        posicionColActual = scanner.nextInt();

        tablero[ posicionColActual ][ posicionFilaActual ] = contador;
        contador++;

        while( ( posicionColActual + 1 < 8 && posicionColActual + 2 < 8 && posicionFilaActual + 1 < 8 && tablero[ posicionColActual + 1 ][posicionFilaActual]  == 0 && tablero[ posicionColActual + 2 ][ posicionFilaActual ] == 0 && tablero[ posicionColActual + 2 ][ posicionFilaActual + 1 ] == 0 ) ||
        ( posicionColActual + 1 < 8 && posicionColActual + 2 < 8 && posicionFilaActual - 1 >= 0 && tablero[ posicionColActual + 1 ][ posicionFilaActual ] == 0 && tablero[ posicionColActual + 2 ][posicionFilaActual]  == 0 && tablero[ posicionColActual + 2 ][ posicionFilaActual - 1 ] == 0 ) ||
        ( posicionColActual - 1 >= 0 && posicionColActual - 2 >= 0 && posicionFilaActual + 1 < 8 && tablero[ posicionColActual - 1 ][posicionFilaActual]  == 0 && tablero[ posicionColActual - 2 ][ posicionFilaActual ] == 0 && tablero[ posicionColActual - 2 ][ posicionFilaActual + 1 ] == 0 ) ||
        ( posicionColActual - 1 >= 0 && posicionColActual - 2 >= 0 && posicionFilaActual - 1 >= 0 && tablero[ posicionColActual - 1 ][ posicionFilaActual ] == 0 && tablero[ posicionColActual - 2 ][posicionFilaActual]  == 0 && tablero[ posicionColActual - 2 ][ posicionFilaActual - 1 ] == 0 ) ||
        ( posicionFilaActual - 1 >= 0 && posicionFilaActual - 2 >= 0 && posicionColActual + 1 < 8 && tablero[ posicionColActual ][ posicionFilaActual - 1 ] == 0 && tablero[ posicionColActual ][ posicionFilaActual - 2 ] == 0 && tablero[ posicionColActual + 1 ][ posicionFilaActual - 2 ] == 0 ) ||
        ( posicionFilaActual - 1 >= 0 && posicionFilaActual - 2 >= 0 && posicionColActual - 1 >= 0 && tablero[ posicionColActual ][ posicionFilaActual - 1 ] == 0 && tablero[ posicionColActual ][ posicionFilaActual - 2 ] == 0 && tablero[ posicionColActual - 1 ][ posicionFilaActual - 2 ] == 0 ) ||
        ( posicionFilaActual + 1 < 8 && posicionFilaActual + 2 < 8 && posicionColActual + 1 < 8 && tablero[ posicionColActual ][ posicionFilaActual + 1 ] == 0 && tablero[ posicionColActual ][ posicionFilaActual + 2 ] == 0 && tablero[ posicionColActual + 1 ][ posicionFilaActual + 2 ] == 0 ) ||
        ( posicionFilaActual + 1 < 8 && posicionFilaActual + 2 < 8 && posicionColActual - 1 >= 0 && tablero[ posicionColActual ][ posicionFilaActual + 1 ] == 0 && tablero[ posicionColActual ][ posicionFilaActual + 2 ] == 0 && tablero[ posicionColActual - 1 ][ posicionFilaActual + 2 ] == 0 ) ){
            
            caso = random.nextInt( 7 ) + 1; 
            switch( caso ){
                case 1:
                System.out.println( caso );
                if( posicionColActual + 1 < 8 && posicionColActual + 2 < 8 && posicionFilaActual + 1 < 8 && tablero[ posicionColActual + 1 ][posicionFilaActual]  == 0 && tablero[ posicionColActual + 2 ][ posicionFilaActual ] == 0 && tablero[ posicionColActual + 2 ][ posicionFilaActual + 1 ] == 0 ){
                    tablero[ posicionColActual + 1 ][ posicionFilaActual ] = contador;
                    contador++;
                    tablero[ posicionColActual + 2 ][ posicionFilaActual ] = contador;
                    contador++;
                    tablero[ posicionColActual + 2 ][ posicionFilaActual + 1 ] = contador;
                    contador++;
                    posicionColActual += 2;
                    posicionFilaActual += 1;
    
                }    
                break;
                case 2:
                System.out.println( caso );
                if( posicionColActual + 1 < 8 && posicionColActual + 2 < 8 && posicionFilaActual - 1 >= 0 && tablero[ posicionColActual + 1 ][ posicionFilaActual ] == 0 && tablero[ posicionColActual + 2 ][posicionFilaActual]  == 0 && tablero[ posicionColActual + 2 ][ posicionFilaActual - 1 ] == 0 ){
                    tablero[ posicionColActual + 1 ][ posicionFilaActual ] = contador;
                    contador++;
                    tablero[ posicionColActual + 2 ][ posicionFilaActual ] = contador;
                    contador++;
                    tablero[ posicionColActual + 2 ][ posicionFilaActual - 1 ] = contador;
                    contador++;
                    posicionColActual += 2;
                    posicionFilaActual -= 1;
        
                }     
                break;
                case 3:
                System.out.println( caso );
                if( posicionColActual - 1 >= 0 && posicionColActual - 2 >= 0 && posicionFilaActual + 1 < 8 && tablero[ posicionColActual - 1 ][posicionFilaActual]  == 0 && tablero[ posicionColActual - 2 ][ posicionFilaActual ] == 0 && tablero[ posicionColActual - 2 ][ posicionFilaActual + 1 ] == 0 ){
                    tablero[ posicionColActual - 1 ][ posicionFilaActual ] = contador;
                    contador++;
                    tablero[ posicionColActual - 2 ][ posicionFilaActual ] = contador;
                    contador++;
                    tablero[ posicionColActual - 2 ][ posicionFilaActual + 1 ] = contador;
                    contador++;
                    posicionColActual -= 2;
                    posicionFilaActual += 1;
    
                }
    
                break;
                case 4:
                System.out.println( caso );
                if( posicionColActual - 1 >= 0 && posicionColActual - 2 >= 0 && posicionFilaActual - 1 >= 0 && tablero[ posicionColActual - 1 ][ posicionFilaActual ] == 0 && tablero[ posicionColActual - 2 ][ posicionFilaActual ]  == 0 && tablero[ posicionColActual - 2 ][ posicionFilaActual - 1 ] == 0 ){
                    tablero[ posicionColActual - 1 ][ posicionFilaActual ] = contador;
                    contador++;
                    tablero[ posicionColActual - 2 ][ posicionFilaActual ] = contador;
                    contador++;
                    tablero[ posicionColActual - 2 ][ posicionFilaActual - 1 ] = contador;
                    contador++;
                    posicionColActual -= 2;
                    posicionFilaActual -= 1;
    
                }    
                break;
                case 5:
                System.out.println( caso );
                if( posicionFilaActual - 1 >= 0 && posicionFilaActual - 2 >= 0 && posicionColActual + 1 < 8 && tablero[ posicionColActual ][ posicionFilaActual - 1 ] == 0 && tablero[ posicionColActual ][ posicionFilaActual - 2 ] == 0 && tablero[ posicionColActual + 1 ][ posicionFilaActual - 2 ] == 0 ){
                    tablero[ posicionColActual ][ posicionFilaActual - 1 ] = contador;
                    contador++;
                    tablero[ posicionColActual ][ posicionFilaActual - 2] = contador;
                    contador++;
                    tablero[ posicionColActual + 1 ][ posicionFilaActual - 2 ] = contador;
                    contador++;
                    posicionColActual += 1;
                    posicionFilaActual -= 2;
    
                }
    
                break;
                case 6:
                System.out.println( caso );
                if( posicionFilaActual - 1 >= 0 && posicionFilaActual - 2 >= 0 && posicionColActual - 1 >= 0 && tablero[ posicionColActual ][ posicionFilaActual - 1 ] == 0 && tablero[ posicionColActual ][ posicionFilaActual - 2 ] == 0 && tablero[ posicionColActual - 1 ][ posicionFilaActual - 2 ] == 0 ){
                    tablero[ posicionColActual ][ posicionFilaActual - 1 ] = contador;
                    contador++;
                    tablero[ posicionColActual ][ posicionFilaActual - 2 ] = contador ;
                    contador++;
                    tablero[ posicionColActual - 1 ][ posicionFilaActual - 2 ] = contador;
                    contador++;
                    posicionColActual -= 1;
                    posicionFilaActual -= 2;
    
                }    
                break;
                case 7:
                System.out.println( caso );
                if( posicionFilaActual + 1 < 8 && posicionFilaActual + 2 < 8 && posicionColActual + 1 < 8 && tablero[ posicionColActual ][ posicionFilaActual + 1 ] == 0 && tablero[ posicionColActual ][ posicionFilaActual + 2 ] == 0 && tablero[ posicionColActual + 1 ][ posicionFilaActual + 2 ] == 0 ){
                    tablero[ posicionColActual ][ posicionFilaActual + 1 ] = contador;
                    contador++;
                    tablero[ posicionColActual ][ posicionFilaActual + 2] = contador;
                    contador++;
                    tablero[ posicionColActual + 1 ][ posicionFilaActual + 2 ] = contador;
                    contador++;
                    posicionColActual += 1;
                    posicionFilaActual += 2;
    
                }    
                break;
                case 8:
                System.out.println( caso );
                if( posicionFilaActual + 1 < 8 && posicionFilaActual + 2 < 8 && posicionColActual - 1 >= 0 && tablero[ posicionColActual ][ posicionFilaActual + 1 ] == 0 && tablero[ posicionColActual ][ posicionFilaActual + 2 ] == 0 && tablero[ posicionColActual - 1 ][ posicionFilaActual + 2 ] == 0 ){
                    tablero[ posicionColActual ][ posicionFilaActual + 1 ] = contador;
                    contador++;
                    tablero[ posicionColActual ][ posicionFilaActual + 2 ] = contador ;
                    contador++;
                    tablero[ posicionColActual - 1 ][ posicionFilaActual + 2 ] = contador;
                    contador++;
                    posicionColActual -= 1;
                    posicionFilaActual += 2;
    
                }    
                break;
            }
        }
        
        mostrarTablero( tablero );
        
        System.out.printf( "\t       %s\n\t     %s\n\t     %s\n\n", "|------------------------|", "|   YA NO SE PUEDE MAS   |", "|------------------------|" );

    }
    public static void mostrarTablero( int tablero[][] ){
        int columna = 0;
        int fila = 0;
        int contador = 0;

        System.out.printf( "\n        -------------- Columna ------------ >\n\n        0   01   02   03   04   05   06   07  \n\n      |---------------------------------------|\n" );
        for(  fila = 0; fila <= 7; fila++ ){
            columna = 0;
            System.out.print( " |  " + contador + " " );
            for(  columna = 0; columna <= 7; columna++ ){
                System.out.printf( "| %-2d ", tablero[ columna ][ fila ]);
            }
            System.out.printf( "|\n |    |---------------------------------------|\n" );
            contador++;
        }
        System.out.printf( " V\nFila\n\n" );

    }
}