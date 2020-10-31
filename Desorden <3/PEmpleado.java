import java.util.Scanner;

public class PEmpleado {

    public static void main(String[] args) {
        

        Scanner entrada = new Scanner( System.in );

        String nombre;
        String apellido;
        double salario;

        System.out.println( "Escribe el nombre del primer empleado: " );
        nombre = entrada.nextLine();

        System.out.println( "Escribe Apellido del primer empleado: " );
        apellido = entrada.nextLine();

        System.out.println( "Escribe el salario del primer empleado: " );
        salario = entrada.nextDouble();

        Empleado Empleado1 = new Empleado( nombre, apellido, salario ) ;

        nombre = entrada.nextLine();
        System.out.println( "Escribe el nombre del segundo empleado: " );
        nombre = entrada.nextLine();

        System.out.println( "Escribe Apellido del segundo empleado: " );
        apellido = entrada.nextLine();

        System.out.println( "Escribe el salario del segundo empleado: " );
        salario = entrada.nextDouble();

        Empleado Empleado2 = new Empleado( nombre, apellido, salario ) ;

        System.out.println( "\t\tPerfil de el Empleado 1" );
        System.out.println( "Nombre \t Apellido \t Salario \t Salario + Bonus \t Salario Anual \t Salrio Anual Bonus" );
        System.out.printf( "%s\t %s\t\t %.2f\t\t %.2f\t %.2f\t %.2f\n\n",
        Empleado1.getNombre(), Empleado1.getApellido(), Empleado1.getSalario(),
        Empleado1.get10(), Empleado1.getAnual(), Empleado1.get10() * 12 );

        System.out.println( "\t\tPerfil de el Empleado 2" );
        System.out.println( "Nombre \t Apellido \t Salario \t Salario + Bonus \t Salario Anual \t Salrio Anual Bonus" );
        System.out.printf( "%s\t %s\t\t %.2f\t\t %.2f\t %.2f\t %.2f\n\n",
        Empleado2.getNombre(), Empleado2.getApellido(), Empleado2.getSalario(),
        Empleado2.get10(), Empleado2.getAnual(), Empleado2.get10() * 12 );

    }
}