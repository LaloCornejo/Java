import java.util.Scanner;
import java.util.Random;
public class PaseoDeCabello2 {
    public static void main(String[] args) {
        int tablero[][] = new int [ 8 ][ 8 ];
        Scanner scanner = new Scanner( System.in );
        int posicionFilaActual = 0;
        int posicionColActual = 0;
        int contador = 1;
        int menor = 0;
        int acc[][] = {{ 2, 3, 4, 4, 4, 4, 3, 2 },
                     { 3, 4, 6, 6, 6, 6, 4, 3 },
                     { 4, 6, 8, 8, 8, 8, 6, 4 }, 
                     { 4, 6, 8, 8, 8, 8, 6, 4 },
                     { 4, 6, 8, 8, 8, 8, 6, 4 },
                     { 4, 6, 8, 8, 8, 8, 6, 4 },
                     { 3, 4, 6, 6, 6, 6, 4, 3 },
                     { 2, 3, 4, 4, 4, 4, 3, 2 }};

                     int a = 0;
                     int b = 0;
                     int c = 0;
                     int d = 0;
                     int e = 0;
                     int f = 0;
                     int g = 0;
                     int h = 0;
        
        mostrarAccesibilidad( acc );

        mostrarTablero( tablero );
        System.out.printf( "%s\n","( Espacio en medio de los numeros,\n1º numero = fila, 2º numero = columna )" );
        System.out.print( "En que Fila iniciar? " );
        posicionFilaActual = scanner.nextInt();
        System.out.print( "En que Columna iniciar? " );
        posicionColActual = scanner.nextInt();

        tablero[ posicionColActual ][ posicionFilaActual ] = contador;
        acc[ posicionColActual ][ posicionFilaActual ] = 9;
        contador++;

        while( posicionColActual - 1 >= 0 && posicionFilaActual - 2 >= 0 && tablero[ posicionColActual - 1 ][ posicionFilaActual - 2 ] == 0 ||
               posicionColActual + 1 < 8 && posicionFilaActual - 2 >= 0 && tablero[ posicionColActual + 1 ][ posicionFilaActual - 2 ] == 0 ||
               posicionColActual + 2 < 8 && posicionFilaActual + 1 < 8 && tablero[ posicionColActual + 2 ][ posicionFilaActual + 1 ] == 0 ||
               posicionColActual - 2 >= 0 && posicionFilaActual + 1 < 8 && tablero[ posicionColActual - 2 ][ posicionFilaActual + 1 ] == 0 ||
               posicionColActual - 1 >= 0 && posicionFilaActual + 2 < 8 && tablero[ posicionColActual - 1 ][ posicionFilaActual + 2 ] == 0 ||
               posicionColActual + 1 < 8 && posicionFilaActual + 2 < 8 && tablero[ posicionColActual + 1 ][ posicionFilaActual + 2 ] == 0 ||
               posicionColActual - 2 >= 0 && posicionFilaActual - 1 >= 0 && tablero[ posicionColActual - 2 ][ posicionFilaActual - 1 ] == 0 ||
               posicionColActual + 2 < 8 && posicionFilaActual - 1 >= 0 && tablero[ posicionColActual + 2 ][ posicionFilaActual - 1 ] == 0 ){

                int FilaA = posicionFilaActual;
                int ColumnaA = posicionColActual;

            
                if( ColumnaA - 1 >= 0 && FilaA - 2 >= 0 ){
                    a = acc[ ColumnaA - 1 ][ FilaA - 2 ];
                }else{
                    a = 9;
                }
                if( ColumnaA - 2 >= 0 && FilaA - 1 >= 0 ){
                 b = acc[ ColumnaA - 2 ][ FilaA - 1 ];
                }else {
                    b = 9;
                }
                if( ColumnaA - 2 >= 0 && FilaA + 1 <= 7){
                 c = acc[ ColumnaA - 2 ][ FilaA + 1 ];
                }else{
                    c = 9;
                }
                if( ColumnaA - 1 >= 0 && FilaA + 2 <= 7 ){
                d = acc[ ColumnaA - 1 ][ FilaA + 2 ];
                }else{
                    d = 9;
                }
                if( ColumnaA + 1 <= 7 && FilaA + 2 <= 7 ){
                e = acc[ ColumnaA + 1 ][ FilaA + 2 ];
                }else{
                    e = 9;
                }
                if( ColumnaA + 2 <= 7 && FilaA + 1 <= 7 ){
                f = acc[ ColumnaA + 2 ][ FilaA + 1 ];
                }else{
                    f = 9;
                }
                if( ColumnaA + 2 <= 7 && FilaA - 1 >= 0 ){
                g = acc[ ColumnaA + 2 ][ FilaA - 1 ];
                }else{
                    g = 9;
                }
                if( ColumnaA + 1 <= 7 && FilaA - 2 >= 0 ){
                h = acc[ ColumnaA + 1 ][ FilaA - 2 ];
                }else{
                    h = 9;
                }

                if( Math.min( a, b ) == a ){
                    menor = 1;
                }else{
                    menor = 2;
                }switch( menor ){
                    case 1:
                    if( Math.min( a, c ) == a){
                        menor = 1;
                    }else{
                        menor = 3;
                    }switch( menor ){
                        case 1:
                        if( Math.min( a, d ) == a){
                            menor = 1;
                        }else{
                            menor = 4;
                        }switch( menor ){
                            case 1:
                            if( Math.min( a, e ) == a ){
                                menor = 1;
                            }else{
                                menor = 5;
                            }switch( menor ){
                                case 1:
                                if( Math.min( a, f ) == a){
                                    menor = 1;
                                }
                                else{
                                    menor = 6;
                                }switch( menor ){
                                    case 1:
                                    if( Math.min( a, g ) == a){
                                        menor = 1;
                                    }else{
                                        menor= 7;
                                    }switch( menor ){
                                        case 1:
                                        if( Math.min( a, h) == a ){
                                            menor = 1;
                                        }else{
                                            menor = 8;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                    case 6:
                                    if( Math.min( f, g ) == f ){
                                        menor = 6;
                                    } else{
                                        menor = 7;
                                    }switch( menor ){
                                        case 6:
                                        if( Math.min( f, h ) == f ){
                                            menor = 6;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 6:
                                            if( Math.min( f, h ) == f ){
                                                menor = 6;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                                case 5:
                                if( Math.min( e, f ) == e ){
                                    menor = 5;
                                }else{
                                    menor = 6;
                                }switch( menor ){
                                    case 5:
                                    if( Math.min( e, g ) == e ){
                                        menor = 5;
                                    }else{
                                        menor = 7;
                                    }switch ( menor ){
                                        case 5:
                                        if( Math.min( e, h ) == e){
                                            menor = 5;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 5:
                                            if( Math.min( e, h) == e ){
                                                menor = 5; 
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                    case 6:
                                    if( Math.min( f, g ) == f ){
                                        menor = 6;
                                    } else{
                                        menor = 7;
                                    }switch( menor ){
                                        case 6:
                                        if( Math.min( f, h ) == f ){
                                            menor = 6;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 6:
                                            if( Math.min( f, h ) == f ){
                                                menor = 6;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                            case 4:
                            if( Math.min( d, e ) == d ){
                                menor = 4;
                            }else{
                                menor = 5;
                            }switch( menor ){
                                case 4:
                                if( Math.min( d, f ) == d ){
                                    menor = 4;
                                }else{
                                    menor = 6;
                                }switch( menor ){
                                    case 4:
                                    if( Math.min( d, g ) == d ){
                                        menor = 4;
                                    }else{
                                        menor = 7;
                                    }switch( menor ){
                                        case 4:
                                        if( Math.min( d, h ) == d ){
                                            menor = 4;
                                        }else {
                                            menor = 8;
                                        }switch( menor ){
                                            case 4:
                                            if( Math.min( d, h ) == d){
                                                menor = 4;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                    case 6:
                                    if( Math.min( f, g ) == f ){
                                        menor = 6;
                                    } else{
                                        menor = 7;
                                    }switch( menor ){
                                        case 6:
                                        if( Math.min( f, h ) == f ){
                                            menor = 6;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 6:
                                            if( Math.min( f, h ) == f ){
                                                menor = 6;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                                case 5:
                                if( Math.min( e, f ) == e ){
                                    menor = 5;
                                }else{
                                    menor = 6;
                                }switch( menor ){
                                    case 5:
                                    if( Math.min( e, g ) == e ){
                                        menor = 5;
                                    }else{
                                        menor = 7;
                                    }switch ( menor ){
                                        case 5:
                                        if( Math.min( e, h ) == e){
                                            menor = 5;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 5:
                                            if( Math.min( e, h) == e ){
                                                menor = 5; 
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                    case 6:
                                    if( Math.min( f, g ) == f ){
                                        menor = 6;
                                    } else{
                                        menor = 7;
                                    }switch( menor ){
                                        case 6:
                                        if( Math.min( f, h ) == f ){
                                            menor = 6;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 6:
                                            if( Math.min( f, h ) == f ){
                                                menor = 6;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        break;
                        case 3:
                        if( Math.min( c, d ) == c ){
                            menor = 3;
                        }else{
                            menor = 4;
                        }switch( menor ){
                            case 3:
                            if( Math.min( c, e ) == c ){
                                menor = 3;
                            }else{
                                menor = 5;
                            }switch( menor){
                                case 3:
                                if( Math.min( c , f ) == c ){
                                    menor = 3;
                                }else{
                                    menor = 6;
                                }switch( menor ){
                                    case 3:
                                    if( Math.min( c, g ) == c ){
                                        menor = 3;
                                    }else{
                                        menor = 7;
                                    }switch( menor ){
                                        case 3:
                                        if( Math.min( c, h ) == c ){
                                            menor = 3;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 3:
                                            if( Math. min( c, h ) == c ){
                                                menor = 3; 
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                    case 6:
                                    if( Math.min( f, g ) == f ){
                                        menor = 6;
                                    } else{
                                        menor = 7;
                                    }switch( menor ){
                                        case 6:
                                        if( Math.min( f, h ) == f ){
                                            menor = 6;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 6:
                                            if( Math.min( f, h ) == f ){
                                                menor = 6;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                                case 5:
                                if( Math.min( e, f ) == e ){
                                    menor = 5;
                                }else{
                                    menor = 6;
                                }switch( menor ){
                                    case 5:
                                    if( Math.min( e, g ) == e ){
                                        menor = 5;
                                    }else{
                                        menor = 7;
                                    }switch ( menor ){
                                        case 5:
                                        if( Math.min( e, h ) == e){
                                            menor = 5;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 5:
                                            if( Math.min( e, h) == e ){
                                                menor = 5; 
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                    case 6:
                                    if( Math.min( f, g ) == f ){
                                        menor = 6;
                                    } else{
                                        menor = 7;
                                    }switch( menor ){
                                        case 6:
                                        if( Math.min( f, h ) == f ){
                                            menor = 6;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 6:
                                            if( Math.min( f, h ) == f ){
                                                menor = 6;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                            case 4:
                            if( Math.min( d, e ) == d ){
                                menor = 4;
                            }else{
                                menor = 5;
                            }switch( menor ){
                                case 4:
                                if( Math.min( d, f ) == d ){
                                    menor = 4;
                                }else{
                                    menor = 6;
                                }switch( menor ){
                                    case 4:
                                    if( Math.min( d, g ) == d ){
                                        menor = 4;
                                    }else{
                                        menor = 7;
                                    }switch( menor ){
                                        case 4:
                                        if( Math.min( d, h ) == d ){
                                            menor = 4;
                                        }else {
                                            menor = 8;
                                        }switch( menor ){
                                            case 4:
                                            if( Math.min( d, h ) == d){
                                                menor = 4;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                    case 6:
                                    if( Math.min( f, g ) == f ){
                                        menor = 6;
                                    } else{
                                        menor = 7;
                                    }switch( menor ){
                                        case 6:
                                        if( Math.min( f, h ) == f ){
                                            menor = 6;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 6:
                                            if( Math.min( f, h ) == f ){
                                                menor = 6;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                                case 5:
                                if( Math.min( e, f ) == e ){
                                    menor = 5;
                                }else{
                                    menor = 6;
                                }switch( menor ){
                                    case 5:
                                    if( Math.min( e, g ) == e ){
                                        menor = 5;
                                    }else{
                                        menor = 7;
                                    }switch ( menor ){
                                        case 5:
                                        if( Math.min( e, h ) == e){
                                            menor = 5;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 5:
                                            if( Math.min( e, h) == e ){
                                                menor = 5; 
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                    case 6:
                                    if( Math.min( f, g ) == f ){
                                        menor = 6;
                                    } else{
                                        menor = 7;
                                    }switch( menor ){
                                        case 6:
                                        if( Math.min( f, h ) == f ){
                                            menor = 6;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 6:
                                            if( Math.min( f, h ) == f ){
                                                menor = 6;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    } 
                    break;
                    case 2:
                    if( Math.min( b, c ) == b ){
                        menor = 2;
                    }else{
                        menor = 3;
                    }switch( menor ){
                        case 2:
                        if( Math.min( b, d  ) == b ){
                            menor = 2;
                        }else{
                            menor = 4;
                        }switch( menor ){
                            case 2:
                            if( Math. min( b, e ) == b ){
                                menor = 2;
                            }else{
                                menor = 5;
                            }switch( menor ){
                                case 2:
                                if( Math.min( d, f ) == d ){
                                    menor = 2;
                                }else{
                                    menor= 6;
                                }switch( menor ){
                                    case 2:
                                    if( Math.min( b, g ) == b ){
                                        menor = 2;
                                    }else{
                                        menor = 7;
                                    }switch( menor ){
                                        case 2:
                                        if( Math.min( b, h ) == b ){
                                            menor = 2;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 2:
                                            if( Math.min( b, h ) == b ){
                                                menor = 2;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                    case 6:
                                    if( Math.min( f, g ) == f ){
                                        menor = 6;
                                    } else{
                                        menor = 7;
                                    }switch( menor ){
                                        case 6:
                                        if( Math.min( f, h ) == f ){
                                            menor = 6;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 6:
                                            if( Math.min( f, h ) == f ){
                                                menor = 6;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                                case 5:
                                if( Math.min( e, f ) == e ){
                                    menor = 5;
                                }else{
                                    menor = 6;
                                }switch( menor ){
                                    case 5:
                                    if( Math.min( e, g ) == e ){
                                        menor = 5;
                                    }else{
                                        menor = 7;
                                    }switch ( menor ){
                                        case 5:
                                        if( Math.min( e, h ) == e){
                                            menor = 5;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 5:
                                            if( Math.min( e, h) == e ){
                                                menor = 5; 
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                    case 6:
                                    if( Math.min( f, g ) == f ){
                                        menor = 6;
                                    } else{
                                        menor = 7;
                                    }switch( menor ){
                                        case 6:
                                        if( Math.min( f, h ) == f ){
                                            menor = 6;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 6:
                                            if( Math.min( f, h ) == f ){
                                                menor = 6;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                            case 4:
                            if( Math.min( d, e ) == d ){
                                menor = 4;
                            }else{
                                menor = 5;
                            }switch( menor ){
                                case 4:
                                if( Math.min( d, f ) == d ){
                                    menor = 4;
                                }else{
                                    menor = 6;
                                }switch( menor ){
                                    case 4:
                                    if( Math.min( d, g ) == d ){
                                        menor = 4;
                                    }else{
                                        menor = 7;
                                    }switch( menor ){
                                        case 4:
                                        if( Math.min( d, h ) == d ){
                                            menor = 4;
                                        }else {
                                            menor = 8;
                                        }switch( menor ){
                                            case 4:
                                            if( Math.min( d, h ) == d){
                                                menor = 4;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                    case 6:
                                    if( Math.min( f, g ) == f ){
                                        menor = 6;
                                    } else{
                                        menor = 7;
                                    }switch( menor ){
                                        case 6:
                                        if( Math.min( f, h ) == f ){
                                            menor = 6;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 6:
                                            if( Math.min( f, h ) == f ){
                                                menor = 6;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                                case 5:
                                if( Math.min( e, f ) == e ){
                                    menor = 5;
                                }else{
                                    menor = 6;
                                }switch( menor ){
                                    case 5:
                                    if( Math.min( e, g ) == e ){
                                        menor = 5;
                                    }else{
                                        menor = 7;
                                    }switch ( menor ){
                                        case 5:
                                        if( Math.min( e, h ) == e){
                                            menor = 5;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 5:
                                            if( Math.min( e, h) == e ){
                                                menor = 5; 
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                    case 6:
                                    if( Math.min( f, g ) == f ){
                                        menor = 6;
                                    } else{
                                        menor = 7;
                                    }switch( menor ){
                                        case 6:
                                        if( Math.min( f, h ) == f ){
                                            menor = 6;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 6:
                                            if( Math.min( f, h ) == f ){
                                                menor = 6;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        break;
                        case 3:
                        if( Math.min( c, d ) == c ){
                            menor = 3;
                        }else{
                            menor = 4;
                        }switch( menor ){
                            case 3:
                            if( Math.min( c, e ) == c ){
                                menor = 3;
                            }else{
                                menor = 5;
                            }switch( menor){
                                case 3:
                                if( Math.min( c , f ) == c ){
                                    menor = 3;
                                }else{
                                    menor = 6;
                                }switch( menor ){
                                    case 3:
                                    if( Math.min( c, g ) == c ){
                                        menor = 3;
                                    }else{
                                        menor = 7;
                                    }switch( menor ){
                                        case 3:
                                        if( Math.min( c, h ) == c ){
                                            menor = 3;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 3:
                                            if( Math. min( c, h ) == c ){
                                                menor = 3; 
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                    case 6:
                                    if( Math.min( f, g ) == f ){
                                        menor = 6;
                                    } else{
                                        menor = 7;
                                    }switch( menor ){
                                        case 6:
                                        if( Math.min( f, h ) == f ){
                                            menor = 6;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 6:
                                            if( Math.min( f, h ) == f ){
                                                menor = 6;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                                case 5:
                                if( Math.min( e, f ) == e ){
                                    menor = 5;
                                }else{
                                    menor = 6;
                                }switch( menor ){
                                    case 5:
                                    if( Math.min( e, g ) == e ){
                                        menor = 5;
                                    }else{
                                        menor = 7;
                                    }switch ( menor ){
                                        case 5:
                                        if( Math.min( e, h ) == e){
                                            menor = 5;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 5:
                                            if( Math.min( e, h) == e ){
                                                menor = 5; 
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                    case 6:
                                    if( Math.min( f, g ) == f ){
                                        menor = 6;
                                    } else{
                                        menor = 7;
                                    }switch( menor ){
                                        case 6:
                                        if( Math.min( f, h ) == f ){
                                            menor = 6;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 6:
                                            if( Math.min( f, h ) == f ){
                                                menor = 6;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                            case 4:
                            if( Math.min( d, e ) == d ){
                                menor = 4;
                            }else{
                                menor = 5;
                            }switch( menor ){
                                case 4:
                                if( Math.min( d, f ) == d ){
                                    menor = 4;
                                }else{
                                    menor = 6;
                                }switch( menor ){
                                    case 4:
                                    if( Math.min( d, g ) == d ){
                                        menor = 4;
                                    }else{
                                        menor = 7;
                                    }switch( menor ){
                                        case 4:
                                        if( Math.min( d, h ) == d ){
                                            menor = 4;
                                        }else {
                                            menor = 8;
                                        }switch( menor ){
                                            case 4:
                                            if( Math.min( d, h ) == d){
                                                menor = 4;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                    case 6:
                                    if( Math.min( f, g ) == f ){
                                        menor = 6;
                                    } else{
                                        menor = 7;
                                    }switch( menor ){
                                        case 6:
                                        if( Math.min( f, h ) == f ){
                                            menor = 6;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 6:
                                            if( Math.min( f, h ) == f ){
                                                menor = 6;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                                case 5:
                                if( Math.min( e, f ) == e ){
                                    menor = 5;
                                }else{
                                    menor = 6;
                                }switch( menor ){
                                    case 5:
                                    if( Math.min( e, g ) == e ){
                                        menor = 5;
                                    }else{
                                        menor = 7;
                                    }switch ( menor ){
                                        case 5:
                                        if( Math.min( e, h ) == e){
                                            menor = 5;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 5:
                                            if( Math.min( e, h) == e ){
                                                menor = 5; 
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                    case 6:
                                    if( Math.min( f, g ) == f ){
                                        menor = 6;
                                    } else{
                                        menor = 7;
                                    }switch( menor ){
                                        case 6:
                                        if( Math.min( f, h ) == f ){
                                            menor = 6;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 6:
                                            if( Math.min( f, h ) == f ){
                                                menor = 6;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                        case 7:
                                        if( Math.min( g, h ) == g ){
                                            menor = 7;
                                        }else{
                                            menor = 8;
                                        }switch( menor ){
                                            case 7:
                                            if( Math.min( g, h) == g ){
                                                menor = 7;
                                            }else{
                                                menor = 8;
                                            }
                                            break;
                                            case 8:
                                            menor = 8;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    } 
                    break;
                }
        
            switch( menor ){
                case 1:
                if( posicionColActual - 1 >= 0 && posicionFilaActual - 2 >= 0 && tablero[ posicionColActual - 1 ][ posicionFilaActual - 2 ] == 0 ){
                    tablero[ posicionColActual - 1 ][ posicionFilaActual - 2 ] = contador;
                    acc[ posicionColActual - 1 ][ posicionFilaActual - 2 ] = 9;
                    contador++;
                    posicionColActual -= 1;
                    posicionFilaActual -= 2;
                }
                break;
                case 8:
                if( posicionColActual + 1 < 8 && posicionFilaActual - 2 >= 0 && tablero[ posicionColActual + 1 ][ posicionFilaActual - 2 ] == 0 ){
                   tablero[ posicionColActual + 1 ][ posicionFilaActual - 2 ] = contador;
                   acc[ posicionColActual + 1 ][ posicionFilaActual - 2 ] = 9;
                   contador++; 
                   posicionColActual += 1;
                   posicionFilaActual -= 2;
                }
                break;
                case 6:
                if( posicionColActual + 2 < 8 && posicionFilaActual + 1 < 8 && tablero[ posicionColActual + 2 ][ posicionFilaActual + 1 ] == 0 ){
                    tablero[ posicionColActual + 2 ][ posicionFilaActual + 1 ] = contador;
                    acc[ posicionColActual + 2 ][ posicionFilaActual + 1 ] = 9;
                    contador++;
                    posicionColActual += 2;
                    posicionFilaActual += 1;
                }
                break;
                case 3:
                if( posicionColActual - 2 >= 0 && posicionFilaActual + 1 < 8 && tablero[ posicionColActual - 2 ][ posicionFilaActual + 1 ] == 0 ){
                    tablero[ posicionColActual - 2 ][ posicionFilaActual + 1 ] = contador;
                    acc[ posicionColActual - 2 ][ posicionFilaActual + 1 ] = 9;
                    contador++;
                    posicionColActual -= 2;
                    posicionFilaActual += 1;
                }
                break;
                case 4:
                if( posicionColActual - 1 >= 0 && posicionFilaActual + 2 < 8 && tablero[ posicionColActual - 1 ][ posicionFilaActual + 2 ] == 0 ){
                    tablero[ posicionColActual - 1 ][ posicionFilaActual + 2 ] = contador;
                    acc[ posicionColActual - 1 ][ posicionFilaActual + 2 ] = 9;
                    contador++;
                    posicionColActual -= 1;
                    posicionFilaActual +=2;
                }
                break;
                case 5:
                if( posicionColActual + 1 < 8 && posicionFilaActual + 2 < 8 && tablero[ posicionColActual + 1 ][ posicionFilaActual + 2 ] == 0 ){
                    tablero[ posicionColActual + 1 ][ posicionFilaActual + 2 ] = contador;
                    acc[ posicionColActual + 1 ][ posicionFilaActual + 2 ] = 9;
                    contador++;
                    posicionColActual += 1;
                    posicionFilaActual += 2;
                }
                break;
                case 2:
                if( posicionColActual - 2 >= 0 && posicionFilaActual - 1 >= 0 && tablero[ posicionColActual - 2 ][ posicionFilaActual - 1 ] == 0 ){
                    tablero[ posicionColActual - 2 ][ posicionFilaActual - 1 ] = contador;
                    acc[ posicionColActual - 2 ][ posicionFilaActual - 1 ] = 9;
                    contador++;
                    posicionColActual -= 2;
                    posicionFilaActual -= 1;
                }
                break;
                case 7:
                if( posicionColActual + 2 < 8 && posicionFilaActual - 1 >= 0 && tablero[ posicionColActual + 2 ][ posicionFilaActual - 1 ] == 0 ){
                    tablero[ posicionColActual + 2 ][ posicionFilaActual - 1 ] = contador;
                    acc[ posicionColActual + 2 ][ posicionFilaActual - 1 ] = 9;
                    contador++;
                    posicionColActual += 2;
                    posicionFilaActual -= 1;
                }
                break;
            }
        }
        
        mostrarTablero( tablero );
        mostrarAccesibilidad( acc );
        
        System.out.printf( "\t     %s\n\t     %s\n\t     %s\n\n", "|------------------------|", "|   YA NO SE PUEDE MAS   |", "|------------------------|" );


    }
    public static void mostrarAccesibilidad(  int acc[][] ){

        System.out.printf( "\n\t%s\n", "|-------------------------------|" );
        for( int fila1 = 0; fila1 <= 7; fila1++ ){
            System.out.printf( "\t|" );
            for( int columna1 = 0; columna1 <= 7; columna1++){
                System.out.printf(" %d |", acc[ columna1 ][ fila1 ] );
            }
            System.out.printf( "\n\t|-------------------------------|\n" );
        }
        System.out.println();
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
                if( tablero[ columna ][ fila ] != 0 ){
                    System.out.printf( "| %-2d ", tablero[ columna ][ fila ]);
                }else{
                    System.out.printf( "|    " );
                }
            }
            System.out.printf( "|\n |    |---------------------------------------|\n" );
            contador++;
        }
        System.out.printf( " V\nFila\n\n" );
    }
}