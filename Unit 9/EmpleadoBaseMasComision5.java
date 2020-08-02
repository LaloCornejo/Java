public class EmpleadoBaseMasComision5 extends EmpleadoPorComision4 {
    private double salarioBase;
    
    public EmpleadoBaseMasComision5( String nombre, String apellido, String nss, double ventas, double tarifa, double salario ){
        super( nombre, apellido, nss, ventas, tarifa );
        establecerSalarioBase( salario );
    
        System.out.printf( "\nConstructor de EmpleadoBaseMasComision5:\n%s\n", this );
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
        return String.format( "%s %s\n%s: %.2f", "con sueldo base", super.toString(), "sueldo base", obtenerSalarioBase() );
    }
}