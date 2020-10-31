public class PruebaEmpleado1 {
    public static void main(String[] args) {
        System.out.println();
        Fecha nacimiento = new Fecha( 7, 24, 1988 );
        Fecha contratacion = new Fecha( 3, 12, 1988 );
        Empleado1 empleado = new Empleado1( "Bob", "Blue", nacimiento, contratacion );

        System.out.println( empleado );
        System.out.println();
    }
}