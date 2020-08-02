import com.deitel.jhtp7.cap08.Tiempo1;
public class PruebaPaqueteTiempo1 {
    public static void main(String[] args) {
        Tiempo1 tiempo = new Tiempo1();

        System.out.print( "La hora Universal es: " );
        System.out.println( tiempo.aStringUniversal() );
        System.out.print( "La hora estandar inicial es: " );
        System.out.println( tiempo.toString() );
        System.out.println();

        tiempo.establecerTiempo( 13, 27, 6 );
        System.out.print( "La hora Universal despues de establecerTiempo es: " );
        System.out.println( tiempo.aStringUniversal() );
        System.out.print( "La hora etandar despues de establecerTiempo es: " );
        System.out.println( tiempo.toString() );
        System.out.println();

        tiempo.establecerTiempo( 99, 99, 99 );
        System.out.println( "Despues de intentar ajustes invalidos: " );
        System.out.print( "Hora Universal: " );
        System.out.println( tiempo.aStringUniversal() );
        System.out.print( "Hora estandar: " );
        System.out.println( tiempo.toString() );
    }
}