public class EmpleadoBaseMasComision3 extends EmpleadoPorComision2 {
    
    private double salarioBase;

    public EmpleadoBaseMasComision3( String nombre, String apellido, String nss, double ventas, double tarifa, double salario ){
        super( nombre, apellido, nss, ventas, tarifa );
        establecerSalarioBase( salario );
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
        return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f", "Empleado por comision con salario base",
        primerNombre, apellidoPaterno, "Numero del Seguro Social", numeroSeguroSocial, "Ventas brutas", ventasBrutas,
        "tarifa comision", tarifaComision, "Salario base", salarioBase );
    }
}