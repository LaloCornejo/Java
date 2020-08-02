import java.util.Scanner;

public class PFecha {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in );

        String mes;
        String dia;
        String año;

        System.out.println( "Escriba el mes: " );
        mes = entrada.nextLine();

        System.out.println( "Escriba el dia: " );
        dia = entrada.nextLine();

        System.out.println( "Escribe el Año: " );
        año = entrada.nextLine();

        Fecha miFecha = new Fecha( mes, dia, año );

        System.out.printf( "La fecha es: \n%s\n", miFecha.mostrarFecha() );
    }

}