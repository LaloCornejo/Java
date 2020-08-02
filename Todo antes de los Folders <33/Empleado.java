public class Empleado {

    private String nombre;
    private String apellido;
    private double salario;

    public Empleado (String a, String b, double c ) {

        nombre = a ;
        apellido = b ;
        salario = ( c >= 0 ) ? c : 0.0 ;

    }

    public void setNombre ( String setNombre ) {
        nombre = setNombre ;
    }

    public String getNombre ( ) {
        return nombre ;
    }
    
    public void setApellido ( String setApellido ) {
        apellido = setApellido ;
    }

    public String getApellido ( ) {
        return apellido ;
    }

    public void setSalario ( Double setSalario ) {
        salario = setSalario ;
    }

    public double getSalario ( ) {
        return salario ;
    }

    public double getAnual () {
        return salario * 12 ;
    }

    public double get10() {
        return salario + ( salario / 100 * 10 ) ;
    }
}