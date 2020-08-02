public class EmpleadoBaseMasComision_1 extends EmpleadoPorComision_1{
    private double salarioBase;

    public EmpleadoBaseMasComision_1( String nombre, String apellido, String nss, double ventas, double tarifa, double salario ){
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
        return obtenerSalarioBase() + super.ingresos();
    }

    public String toString(){
        return String.format( "%s %s; %s: $%,.2f", "Como salario base", super.toString(), "Salario base", obtenerSalarioBase() );
    }
}