import java.util.Scanner;
public class DTelefono {
    public static void main(String[] args) {
        
        String numero;
        int a;
        int b;
        int c;
        int d;

        Scanner entrada = new Scanner( System.in );
        
        System.out.print( "Escriba el numero a descifrar: ");
        numero = entrada.nextLine();
        String numeroNew = numero.replace( ".","" );

        System.out.println( numeroNew );

        int numere = Integer.parseInt( numeroNew );
        
        a = numere / 1000000;
        b = numere / 10000 - ( a * 100 );
        c = numere / 100 - ( a * 10000) - ( b * 100 );
        d = numere - ( a * 1000000 ) - ( b * 10000 ) - ( c * 100 ) ;

        a = a - 7 ;
        b = b - 7 ;
        c = c - 7 ;
        d = d - 7 ;

        System.out.printf( "El numero decodificado es: %d%d%d%d\n", c, d, a, b );
        
        
    }
}