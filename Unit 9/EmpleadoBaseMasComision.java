public class EmpleadoBaseMasComision {
    
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;
    private double salarioBase;

    public EmpleadoBaseMasComision( String nombre, String apellido, String nss, double ventas, double tarifa, double salario ){
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
        establecerVentasBrutas( ventas );
        establecerTarifaComision( tarifa );
        establecerSalarioBase( salario );
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

    public void establecerSalarioBase( double salario ){
        salarioBase = ( salario < 0.0 ) ? 0.0 : salario;
    }
    public double obtenerSalarioBase(){
        return salarioBase;
    }

    public double ingresos(){
        return salarioBase + ( tarifaComision * ventasBrutas );
    }
    public String toString(){
        return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s %.2f\n%s: %.2f\n", "empleado por comision con sueldo base", primerNombre, apellidoPaterno, "Numero de Seguro Social", numeroSeguroSocial, "ventas brutas", ventasBrutas,
        "tarifas de comision", tarifaComision, "salario base", salarioBase );
    }
}