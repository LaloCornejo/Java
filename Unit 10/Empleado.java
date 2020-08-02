public abstract class Empleado implements PorPagar {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;

    public Empleado( String nombre, String apellido, String nss ){
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
    }

    public void establecerPrimerNombre( String nombre ){
        primerNombre = nombre;
    }
    public String obtenerPrimerNombre(){
        return primerNombre;
    }

    public void establecerApellidoPaterno( String apellido ){
        apellidoPaterno = apellido;
    }
    public String obtenerApellidoPaterno(){
        return apellidoPaterno;
    }

    public void establecerNumeroSeguroSocial( String nss ){
        numeroSeguroSocial = nss;
    }
    public String obtenerNumeroSeguroSocial(){
        return numeroSeguroSocial;
    }

    public String toString(){
        return String.format( "%s %s:\nNumero de Seguro Social: %s", obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial() );
    }

    public abstract double ingresos();
}
