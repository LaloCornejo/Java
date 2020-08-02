public class EmpleadoPorComision2 {
    
    protected String primerNombre;
    protected String apellidoPaterno;
    protected String numeroSeguroSocial;
    protected double ventasBrutas;
    protected double tarifaComision;

    public EmpleadoPorComision2( String nombre, String apellido, String nss, double ventas, double tarifa ){
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
        establecerVentasBrutas( ventas );
        establecerTarifaComision( tarifa );
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

    public void establecerVentasBrutas( double ventas ){
        ventasBrutas = ( ventas < 0.0 ) ? 0.0 : ventas;
    }
    public double obtenerVentasBrutas(){
        return ventasBrutas;
    }

    public void establecerTarifaComision( double tarifa ){
        tarifaComision = ( tarifa > 0.0 && tarifa < 1.0 ) ? tarifa : 0.0;
    }
    public double obtenerTarifaComision(){
        return tarifaComision;
    }

    public double ingresos(){
        return tarifa * ventasBrutas;
    }

    public String toString(){
        return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f", "empleado por comision", primerNombre, apellidoPaterno,
        "numero del seguro social", numeroSeguroSocial, "ventas brutas", ventasBrutas, "tarifa de comision", tarifaComision );
    }
}