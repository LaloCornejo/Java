import java.util.Scanner;

public class CTelefono {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner( System.in );
        int numero;
        int a;
        int b;
        int c;
        int d;
        double a2;
        double b2;
        double c2;
        double d2;

        System.out.print( "Escriba el numero a cifrar: " );
        numero = entrada.nextInt();

        a =  numero / 1000 ;
        b =  numero / 100 - ( a * 10 );
        c =  numero / 10 - ( a * 100 ) - ( b * 10 );
        d =  numero - ( a * 1000 ) - ( b * 100 ) - ( c * 10 );

        a2 = ( (double)a + 7 ) / 10;
        b2 = ( (double)b + 7 ) / 10;
        c2 = ( (double)c + 7 ) / 10;
        d2 = ( (double)d + 7 ) / 10;

        System.out.printf( "EL numero cifrado es: %.1f%.1f%.1f%.1f\n", c2, d2, a2, b2 );

    }

}