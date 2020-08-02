import java.util.Scanner;
public class Accesibilidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int menor = 0;
        int acc[][] = {{ 2, 3, 4, 4, 4, 4, 3, 2 },
                     { 3, 4, 6, 6, 6, 6, 4, 3 },
                     { 4, 6, 8, 8, 8, 8, 6, 4 }, 
                     { 4, 6, 8, 8, 8, 8, 6, 4 },
                     { 4, 6, 8, 8, 8, 8, 6, 4 },
                     { 4, 6, 8, 8, 8, 8, 6, 4 },
                     { 3, 4, 6, 6, 6, 6, 4, 3 },
                     { 2, 3, 4, 4, 4, 4, 3, 2 }};

        
        mostrarAccesibilidad( acc );
        System.out.print( "Columna: " );
        int ColumnaA = scanner.nextInt() - 1;
        System.out.print( "Fila: " );
        int FilaA = scanner.nextInt() - 1;

        int a = 0;
        if( ColumnaA - 1 >= 0 && FilaA - 2 >= 0 ){
            a = acc[ ColumnaA - 1 ][ FilaA - 2 ];
        }else{
            a = 9;
        }
        int b = 0;
        if( ColumnaA - 2 >= 0 && FilaA - 1 >= 0 ){
         b = acc[ ColumnaA - 2 ][ FilaA - 1 ];
        }else {
            b = 9;
        }
        int c = 0;
        if( ColumnaA - 2 >= 0 && FilaA + 1 <= 7){
         c = acc[ ColumnaA - 2 ][ FilaA + 1 ];
        }else{
            c = 9;
        }
        int d = 0;
        if( ColumnaA - 1 >= 0 && FilaA + 2 <= 7 ){
        d = acc[ ColumnaA - 1 ][ FilaA + 2 ];
        }else{
            d = 9;
        }
        int e = 0;
        if( ColumnaA + 1 <= 7 && FilaA + 2 <= 7 ){
        e = acc[ ColumnaA + 1 ][ FilaA + 2 ];
        }else{
            e = 9;
        }
        int f = 0;
        if( ColumnaA + 2 <= 7 && FilaA + 1 <= 7 ){
        f = acc[ ColumnaA + 2 ][ FilaA + 1 ];
        }else{
            f = 9;
        }
        int g = 0;
        if( ColumnaA + 2 <= 7 && FilaA - 1 >= 0 ){
        g = acc[ ColumnaA + 2 ][ FilaA - 1 ];
        }else{
            g = 9;
        }
        int h = 0;
        if( ColumnaA + 1 <= 7 && FilaA - 2 >= 0 ){
        h = acc[ ColumnaA + 1 ][ FilaA - 2 ];
        }else{
            h = 9;
        }
        int pst = acc[ ColumnaA ][ FilaA ];

        mostrarAccesibilidad( acc );

        System.out.printf( "El valor de la posicion actual es: %d \n\n", pst );

        System.out.printf("\t %d\t%d\n\t%d \t %d\n\t     %d\n\t%d \t %d\n\t %d\t%d\n\n",
         a,  h,
        b,    g,
          pst,
        c,    f,
         d,  e );

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
        System.out.printf( "\n%d\n\n", menor );
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
}