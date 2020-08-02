public class EmpleadoAsalariado extends Empleado{
    
    private double salarioSemanal;

    public EmpleadoAsalariado( String nombre, String apellido, String nss, double salario ){
        super( nombre, apellido, nss );
        establecerSalarioSemanal( salario );
    }

    public void establecerSalarioSemanal( double salario ){
        salarioSemanal = salario < 0.0 ? 0.0 : salario;
    }

    public double obtenerSalarioSemanal(){
        return salarioSemanal;
    }

    public double obtenerMontoPago(){
        return obtenerSalarioSemanal();
    }

    public String toString(){
        return String.format( "Empleado asalariado: %s\n%s: $%,.2f", super.toString(), "Salario semanal", obtenerSalarioSemanal() );
    }
}