public class PruebaLibroDCalificaciones {
    public static void main(String[] args) {
        int arregloCalif[] = { 78, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

        LibroDCalificaciones miLibroDCalificaciones = 
        new LibroDCalificaciones("CS101 Introuccion a la programacion en Java", arregloCalif);
        miLibroDCalificaciones.mostrarMensaje();
        miLibroDCalificaciones.procesarCalificaciones();
    }
}