public class PruebaCalificaciones4 {

    public static void main(String[] args) {
        
        LibroCalificaciones4 libroCalificaciones1 = new LibroCalificaciones4( "CS101 Introduccion a la programacion en Java" );
        LibroCalificaciones4 libroCalificaciones2 = new LibroCalificaciones4( "Estructuras de datos en Java" );

        
        System.out.printf( "El nombre del curso de libroCalificaciones1 es: %s\n", libroCalificaciones1.obtenerNombreDelCurso());
        
        System.out.printf( "El nombre del curso de libroCalificaciones2 es: %s\n", libroCalificaciones2.obtenerNombreDelCurso());
        
    }

}