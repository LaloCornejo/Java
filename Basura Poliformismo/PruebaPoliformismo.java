public class PruebaPoliformismo{
    public static void main(String[] args) {
        EmpleadoPorComision3 empleadoPorComision = new EmpleadoPorComision3( "Sue", "Jones", "222-22-2222", 10000, .06 );

        EmpleadoBaseMasComision4 empleadoBaseMasComision = new EmpleadoBaseMasComision4( "Bob", "Lewis", "333-33-3333", 5000, .04, 300 );

        System.out.printf( "%s %s:\n\n%s\n\n", "Llamada a toString de EmpleadoPorComision3 con referencia de superclase", "a un objeto de la superclase", empleadoPorComision.toString() );

        System.out.printf( "%s %s:\n\n%s\n\n", "Llamada a toString de EmpleadoBaseMAsComision4 con referencia de superclase", "de subclase a un objeto de la subclase", empleadoBaseMasComision.toString() );

        System.out.printf( "%s %s:\n\n%s\n\n", "Llamada a tostring de EmpleadoBaseMasComision4 con referencia de la superclase", "a un objeto de la subclase", empleadoBaseMasComision.toString() );
    }
}