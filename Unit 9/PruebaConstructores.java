public class PruebaConstructores {
    public static void main(String[] args) {
        
        EmpleadoPorComision4 empleado1 = new EmpleadoPorComision4( "Bob", "Lewis", "333-33-3333", 5000, .04 );

        System.out.println();

        EmpleadoBaseMasComision5 empleado2 = new EmpleadoBaseMasComision5( "Lisa", "Jones", "555-55-5555", 2000, .06, 800 );

        System.out.println();

        EmpleadoBaseMasComision5 empleado3 = new EmpleadoBaseMasComision5( "Mark", "Sands", "888-88-8888", 8000, .15, 2000 );
    }
}