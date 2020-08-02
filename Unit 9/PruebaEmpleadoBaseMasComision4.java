public class PruebaEmpleadoBaseMasComision4 {
    public static void main(String[] args) {
        EmpleadoBaseMasComision4 empleado = new EmpleadoBaseMasComision4( "Bob", "Lewis", "333-33-3333", 5000, .04, 300 );

        System.out.println( "\nInformacion del empleado obtenida por los metodos establecer: \n" );
        System.out.printf( "%s %s\n", "El primer nombre", empleado.obtenerPrimerNombre() );
        System.out.printf( "%s %s\n", "El apellido paternos es", empleado.obtenerApellidoPaterno() );
        System.out.printf( "%s %s\n", "El numero delSeguro Social es", empleado.obtenerNumeroSeguroSocial() );
        System.out.printf( "%s %.2f\n", "Las ventas brutas son", empleado.obtenerVentasBrutas() );
        System.out.printf( "%s %.2f\n", "La tafifa de comision es", empleado.obtenerTarifaComision() );
        System.out.printf( "%s %.2f\n", "El salario base es", empleado.obtenerSalarioBase() );

        empleado.establecerSalarioBase( 1000 );

        System.out.printf( "\n%s:\n\n%s\n", "Informacion actualizada del empleado, obtenida por toString", empleado.toString() );
;    }
}