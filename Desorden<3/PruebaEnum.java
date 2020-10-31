import java.util.EnumSet;

public class PruebaEnum {
    public static void main(String[] args) {
        System.out.println( "\nTodos los libros:\n" );

        for( Libro libro : Libro.values() )
            System.out.printf( "%-10s%-45s%s\n", libro , libro.obtenerTitulo(), libro.obtenerAnioCopyright() );

        System.out.println( "\nMostrar un rango de constantes Enum: \n" );

        for( Libro libro : EnumSet.range( Libro.JHTP6, Libro.VHTP2 ) )
            System.out.printf( "%-10s%-45s%s\n", libro, libro.obtenerTitulo(), libro.obtenerAnioCopyright() );
        
        System.out.println();
    }
}