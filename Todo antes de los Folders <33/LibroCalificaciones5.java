import java.util.Scanner;

public class LibroCalificaciones5{

    private String nombreDelCurso;

    public LibroCalificaciones5( String nombre ) {
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

    public void determinarPromedioClase( ) {
       
        Scanner entrada = new Scanner( System.in );
        
        int total;
        int contadorCalif;
        int calificacion;
        double promedio;

        total = 0;
        contadorCalif = 1;

        while ( contadorCalif <= 10 ) {
            System.out.print( "Escriba la calificacion: " );
            calificacion = entrada.nextInt( );
            total = total + calificacion ;
            contadorCalif = contadorCalif + 1 ;

        }

        promedio = (double) total / 10;

        System.out.printf( "\nEltotal de las 10 calificaciones es: %d\n", total );
        System.out.printf( "El primedio de la clase es: %.1f\n",promedio );
    }

}