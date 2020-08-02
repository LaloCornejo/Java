public class EmpleadoPorComision_1 extends Empleado {
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision_1( String nombre, String apellido, String nss, double ventas, double tarifa ){
        super( nombre, apellido, nss );
        establecerVentasBrutas( ventas );
        establecerTarifaComision( tarifa );
    }

    public void establecerTarifaComision( double tarifa ){
        tarifaComision = ( tarifa > 0.0 && tarifa < 1.0) ? tarifa : 0.0;
    }

    public double obtenerTarifaComision(){
        return tarifaComision;
    }

    public void establecerVentasBrutas( double ventas ){
        ventasBrutas = ( ventas < 0.0 ) ? 0.0 : ventas ;
    }

    public double obtenerVentasBrutas(){
        return ventasBrutas;
    }

    public double ingresos(){
        return obtenerTarifaComision() * obtenerVentasBrutas();
    }

    public String toString(){
        return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f", "Empleado por comision", super.toString(), "Ventas brutas", obtenerVentasBrutas(), "Tarifa de comision", obtenerTarifaComision() );
    }
}