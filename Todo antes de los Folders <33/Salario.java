import java.util.Scanner;

public class Salario {

    public void determinaSalario( ) {
        Scanner entrada = new Scanner( System.in );

        double total;
        double ingresos;
        int contador;
        double sueldo;

        total = 0 ;
        contador = 1 ;

        System.out.print( "Escriba el valor de las cosas vendidas: $");
        ingresos = entrada.nextDouble();

        while ( ingresos != -1 ) {
            total = total + ingresos ;
            contador += 1 ;
            System.out.print( "Escriba el valor de las cosas vendidas: $");
            ingresos = entrada.nextDouble();
        }
        if ( contador != 0 ){
            sueldo = 200 + ( total * .09 ) ;

            System.out.printf( "El sueldo es: $%.2f\n", sueldo );
        }
        else {
            System.out.println( "No hay datos." );
        }
    }
}