import java.util.Scanner;
public class Cuadrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );
        
        int contadorx = 0;
        int contadory = 0;
        int x  = 0;
        int y  = 0;

        System.out.println();
        System.out.print( "Escribe el numero de filas y coumnas: " );
        x = entrada.nextInt();
        y = x;

        while( contadory != y ){
            contadorx = 0;
            while( contadorx != x ){
                System.out.print( "* " );
                contadorx++;
            }
            System.out.println();
            contadory++;
            
        }
    }
}