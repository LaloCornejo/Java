import java.util.Scanner;

public class PruebaCalificaciones3{

    public static void main(String[] args) {

        Scanner entrada = new Scanner( System.in );

        LibroCalificaciones3 miLibroCalificaciones = new LibroCalificaciones3();
    
        System.out.printf( "El nombre inicial del curso es: %s\n\n", miLibroCalificaciones.obtenerNombreDelCurso() );

        System.out.println( "Escriba el nombre del curso:" );
        String elNombre = entrada.nextLine();
        miLibroCalificaciones.establecerNobreDelCurso( elNombre );
        System.out.println();
        
        miLibroCalificaciones.mostrarMensaje(  );
        
    }        
}