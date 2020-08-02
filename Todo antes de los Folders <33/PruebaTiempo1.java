public class PruebaTiempo1 {
    public static void main(String[] args) {
        Tiempo1 tiempo = new Tiempo1();

        System.out.print( "La hora universal inicial es: " );
        System.out.println( tiempo.aStringUniversal() );
        System.out.print( "La hora estandar inicial es: " );
        System.out.println( tiempo.toString() );
        System.out.println( );

        tiempo.establecertiempo( 15, 45, 1  );
        System.out.print( "La hora universal despues de establecerTiempo es: " );
        System.out.println( tiempo.aStringUniversal() );
        System.out.print( "La hora estandar despues de establecerTiempo es: " );
        System.out.println( tiempo.toString() );
        System.out.println();
        
        tiempo.establecertiempo( 99, 99, 99 );
        System.out.println( "Despues de intentar ajustes invalidos: " );
        System.out.print( "Hora universal: " );
        System.out.println( tiempo.aStringUniversal() );
        System.out.print( "Hora estandar: " );
        System.out.print( tiempo.toString() );
    }
}