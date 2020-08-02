import java.util.Scanner;
public class Hipotenusa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );
        
        double c = 0;
        double hipotenusa = 0;
        double a = 0.0;
        double b = 0.0;

        while(a != -1 ){
            
            System.out.print( "Escribe el valor del lado \"A\": " );
            a = entrada.nextDouble();
    
            System.out.print( "Escribe el valor del lado \"B\": ");
            b = entrada.nextDouble();

            c = Math.pow( a, 2 ) + Math.pow( b, 2 );
            hipotenusa = Math.sqrt( c );

            System.out.printf( "El valor de la hipotenusa es: %.0f\n", hipotenusa );
        }
    }

}