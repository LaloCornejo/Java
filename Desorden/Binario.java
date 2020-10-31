import java.util.Scanner;

public class Binario {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in );
        
        int resultado;
        int numero;
        int a;
        int b;
        int c;
        int d;

        System.out.print( "Escribe tu numero Binario (max 4 digitos): " );
        numero = entrada.nextInt();

        a = numero / 1000;
        b = numero / 100 - ( a * 10 );
        c = numero / 10 - ( a * 100 ) - ( b * 10 );
        d = numero - ( a * 1000 ) - ( b * 100 ) - ( c * 10 );

        System.out.printf( "%d\t%d\t%d\t%d\n", a, b, c, d );

        resultado = ( a * 8 ) + ( b * 4 ) + ( c * 2 ) + ( d * 1 );
        System.out.printf( "El resutado en decimal es: %d\n", resultado );
    }

}