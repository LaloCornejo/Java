public class LibroCalificaciones4{

    private String nombreDelCurso;

    public LibroCalificaciones4( String nombre ) {
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

}