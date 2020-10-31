import java.util.Scanner;
public class Impares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );
        
        System.out.print( "Hasta que numero: " );

        int limite = entrada.nextInt( );
        int contador = 0;

        while (contador <= limite ){
        switch ( contador % 2 ) {
            case 1:
            System.out.println( contador );
            break;
        }
        contador++;
        }
    }
}