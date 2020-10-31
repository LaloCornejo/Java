import java.util.Scanner;
public class Estacionamiento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );

        int horas = 0;
        double total = 0.0;
        double minimo = 2.0;
        double extra = 0.5;

        while( horas != -1 ){
            System.out.print( "Escriba el numero de horas: " );
            horas = entrada.nextInt();

            switch( horas ){
                default:
                    total = minimo;
                    break;
                case 4:
                    total = minimo + extra;
                    break;
                case 5:
                    total = minimo + ( extra * 2 );
                    break;
                case 6:
                    total = minimo + ( extra * 3 );
                    break;
                case 7:
                    total = minimo + ( extra * 4 );
                    break;
                case 8:
                    total = minimo + ( extra * 5 );
                    break;
                case 9:
                    total = minimo + ( extra * 6 );
                    break;
                case 10:
                    total = minimo + ( extra * 7 );
                    break;
                case 11:
                    total = minimo + ( extra * 8 );
                    break;
                case 12:
                    total = minimo + ( extra * 9 );
                    break;
                case 13:
                    total = minimo + ( extra * 10 );
                    break;
                case 14:
                    total = minimo + ( extra * 11 );
                    break;
                case 15:
                    total = minimo + ( extra * 12 );
                    break;
                case 16:
                    total = minimo + ( extra * 13 );
                    break;
                case 17:
                    total = minimo + ( extra * 14 );
                    break;
                case 18:
                    total = minimo + ( extra * 15 );
                    break;
                case 19:
                    total = minimo + ( extra * 16 );
                    break;
                case 20:
                    total = minimo + ( extra * 17 );
                    break;
                case 21:
                    total = minimo + ( extra * 18 );
                    break;
                case 22:
                    total = minimo + ( extra * 19 );
                    break;
                case 23:
                    total = minimo + ( extra * 20 );
                    break;
                case 24:
                    total = minimo + ( extra * 20 );
                    break;
            }
            if( horas != -1 ){
                System.out.println( "El total a pagar es: $" + total );
            }else
            System.out.println();
        }
    }
}