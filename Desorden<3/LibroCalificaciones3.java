public class LibroCalificaciones3{

    private String nombreDelCurso;

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