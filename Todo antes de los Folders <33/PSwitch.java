import java.util.Scanner;

public class PSwitch{

    private String nombreDelCurso;
    private int total;
    private int contadorCalif;
    private int aCuenta;
    private int bCuenta;
    private int cCuenta;
    private int dCuenta;
    private int fCuenta;

    public PSwitch( String nombre ) {
        nombreDelCurso = nombre;
        
    }
    
    public void establecerNobreDelCurso( String nombre ) {
        nombreDelCurso = nombre;

    }
    
    public String  obtenerNombreDelCurso() {
        return nombreDelCurso;

    }

    public void mostrarMensaje() {
        System.out.printf( "Bienvenido a el Libro de calificaciones para %s.\n", obtenerNombreDelCurso() );
    
    }

    public void introducirCalif( ) {
       
        Scanner entrada = new Scanner( System.in );
        
        int calificacion;

        while (entrada.hasNext() ){
            calificacion = entrada.nextInt();
            total += calificacion;
            ++contadorCalif;
        
            incrementarContadorCaliLetra( calificacion );
        }
    }
    public void incrementarContadorCaliLetra( int calificacion ){
        switch (calificacion / 10 ){
            case 9:
            case 10:
                ++aCuenta;
                break;
            case 8:
                ++bCuenta;
                break;
            case 7:
                ++cCuenta;
                break;
            case 6:
                ++dCuenta;
                break;
            default:
                ++fCuenta;
                break;
        }
    }

    public void mostrarReporteCalif(){
        System.out.println( "\nReporte de calificaciones: " );

        if ( contadorCalif != 0 ){
            double promedio = ( double ) total / contadorCalif;

            System.out.printf( "El promedio de la calse es: %.2f\n", promedio );
            System.out.printf( "%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n", 
            "No se te olvide esta cadena", "A: ", aCuenta, "B: ", bCuenta, "C: ", cCuenta, "D: ", dCuenta,
            "F: ", fCuenta );
        }
        else
        System.out.println( "No se introbujeron calificaciones." );
    }

}