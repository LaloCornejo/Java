import java.util.Scanner;
public class PruebaTiempo2a {
    public static void main(String[] args) {
    int hora = 9;
    int minuto = 30; 
    int segundo = 29;

    Tiempo2a t1 = new Tiempo2a( hora, minuto, segundo );

    Scanner horaa = new Scanner( System.in );
    Scanner minutoa = new Scanner( System.in );
    Scanner segundoa = new Scanner( System.in );

    System.out.println( "\n\tLa hora es:\n\t-----------" );
    System.out.printf( "\t%s\n", t1.aStringUniversal() );
    System.out.printf( "\t%s\n\t%s\n\n", t1.toString(), "-----------" );
    int a = 1;
    int b = 1;
    int c = 1;

    while( a != 0 | b != 0 || c != 0 ){
        System.out.print( "Cuantas horas quieres arreglar: " );
        a = horaa.nextInt();
        System.out.print( "Cuantas minutos quieres arreglar: " );
        b = minutoa.nextInt();
        System.out.print( "Cuantas segundos quieres arreglar: " );
        c = segundoa.nextInt();

        hora += a;
        if( minuto + b >= 60 ){
            hora += 1;
            minuto = minuto + b - 60 ;
        }else{
            minuto += b;
        }
        if( segundo + c >= 60 ){
            if( minuto + 1 >= 60 ){
                hora += 1;
                minuto = 0;
            }else{
                minuto += 1;
            }
            segundo = segundo + c - 60 ;
        }else{
            segundo += c;
        }
        if( hora == 24 ){
            hora = 0;
        }
    
        t1 = new Tiempo2a( hora, minuto, segundo );

        System.out.println( "\n\tLa hora es:\n\t-----------" );
        System.out.printf( "\t%s\n", t1.aStringUniversal() );
        System.out.printf( "\t%s\n\t%s\n\n", t1.toString(), "-----------" );
    
    }
 }
}