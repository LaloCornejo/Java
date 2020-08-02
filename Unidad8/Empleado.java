public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private static int cuenta = 0;

    public Empleado( String nombre, String apellido ){
        primerNombre = nombre;
        apellidoPaterno = apellido;

        cuenta++;
        System.out.printf( "Constructor de Empleado: %s %s; cuenta = %d\n", primerNombre, apellidoPaterno, cuenta );
    }

    protected void finalize(){
        cuenta--;
        System.out.printf( "Finalizador de Empleado: %s %s; cuenta = %d\n", primerNombre, apellidoPaterno, cuenta );
    }
    public String obtenerprimerNombre(){
        return primerNombre;
    }
    public String obtenerapellidoPaterno(){
        return apellidoPaterno;
    }
    public static int obtenerCuenta(){
        return cuenta;
    }
}