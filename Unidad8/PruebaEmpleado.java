public class PruebaEmpleado {
    public static void main(String[] args) {
        System.out.printf( "Empleados antes de iniciar: %d\n", Empleado.obtenerCuenta() );

        Empleado e1 = new Empleado( "Susan", "Baker" );
        Empleado e2 = new Empleado( "Bob", "Blue" );

        System.out.println( "\nEmpleados despues de inicialr: " );
        System.out.printf( "mediante e1.obtenerCuenta(): %d\n", e1.obtenerCuenta() );
        System.out.printf( "mediante e2.obtenerCuenta(): %d\n", e2.obtenerCuenta() );
        System.out.printf( "mediante Empleado.obtenerCuenta(): %d\n", Empleado.obtenerCuenta() );

        System.out.printf( "\nEmpleado 1: %s %s\nEmplaedo2: %s %s\n\n", 
        e1.obtenerprimerNombre(), e1.obtenerapellidoPaterno(),
        e2.obtenerprimerNombre(), e2.obtenerapellidoPaterno() );

        e1 = null;
        e2 = null;

        System.gc();

        System.out.printf( "\nEmpleados despues de System.gc(): %d\n", Empleado.obtenerCuenta() );
    }
}