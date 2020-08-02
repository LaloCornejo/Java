public class Empleado1 {
    private String primerNombre;
    private String apellidoPaterno;
    private Fecha fechaNacimiento;
    private Fecha fechaContratacion;

    public Empleado1( String nombre, String apellido, Fecha fechaDeNacimiento, Fecha fechaDeContratacion ){
        primerNombre = nombre;
        apellidoPaterno = apellido;
        fechaNacimiento = fechaDeNacimiento;
        fechaContratacion = fechaDeContratacion;
    }
    public String toString(){
        return String.format( "%s, %s Contratado: %s Cumpleaños: %s", 
        apellidoPaterno, primerNombre, fechaContratacion, fechaNacimiento );
    }
}