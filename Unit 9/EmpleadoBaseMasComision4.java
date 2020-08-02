public class EmpleadoBaseMasComision4 extends EmpleadoPorComision3{
    private double salarioBase;

    public EmpleadoBaseMasComision4( String nombre, String apellido, String nss, double ventas, double tarifa, double salario ){
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
        return obtenerSalarioBase() + super.ingrsos();
    }

    public String toString(){
        return String.format( "%s %s\n%s: %.2f", "Con sueldo base", super.toString(), "Sueldo base", obtenerSalarioBase() );
    }
}