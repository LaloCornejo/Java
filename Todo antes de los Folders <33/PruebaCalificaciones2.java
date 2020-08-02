import java.util.Scanner;

public class PruebaCalificaciones2{

    public static void main(String[] args) {

        Scanner entrada = new Scanner( System.in );

        LibroCalificaciones2 miLibroCalificaciones = new LibroCalificaciones2();

        System.out.println( "Escriba el nombre del curso:" );
        String nombreDelCurso = entrada.nextLine();
        System.out.println();
        
        miLibroCalificaciones.mostrarMensaje( nombreDelCurso );
        
    }        
}