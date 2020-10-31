import java.util.Scanner;

public class LibroCalificaciones6{

    private String nombreDelCurso;

    public LibroCalificaciones6( String nombre ) {
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

        System.out.print( "Escrba calificacion 0 -1 para terminar: " );
        calificacion = entrada.nextInt( );

        while ( calificacion != -1 ) {
            total = total + calificacion ;
            contadorCalif = contadorCalif + 1 ;
            System.out.print( "Escrba calificacion 0 -1 para terminar: " );
            calificacion = entrada.nextInt( );

        }

        if (contadorCalif != 0 ){
            promedio = (double) total / contadorCalif ;

            System.out.printf( "\nEltotal de las %d calificaciones es: %d\n",contadorCalif, total );
            System.out.printf( "El primedio de la clase es: %.1f\n",promedio );
        }
        else{
            System.out.println( "No se introdujeron calificaciones" );

        }
        
    }

}