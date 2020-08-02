public class PruabaTiempo2 {
    public static void main(String[] args) {
        Tiempo2 t1 = new Tiempo2();
        Tiempo2 t2 = new Tiempo2( 2 );
        Tiempo2 t3 = new Tiempo2( 21, 34 );
        Tiempo2 t4 = new Tiempo2( 12, 25, 42 );
        Tiempo2 t5 = new Tiempo2( 27,74,99 );
        Tiempo2 t6 = new Tiempo2( t4 );

        System.out.println( "Se construyo con: " );
        System.out.println( "t1: todos los agrumentos predeterminados" );
        System.out.printf( "    %s\n", t1.aStringUniversal() );
        System.out.printf( "    %s\n", t1.toString() );
        System.out.println( "t2: Se especiico hora; minuto y segundo predeterminadaos" );
        System.out.printf( "    %s\n", t2.aStringUniversal() );
        System.out.printf( "    %s\n", t2.toString() );

        System.out.println( "t3: Se especificaron hora y minuto predeterminados" );
        System.out.printf( "    %s\n", t3.aStringUniversal() );
        System.out.printf( "    %s\n", t3.toString() );

        System.out.println( "t4: Se especificaron hora, minuto y segundo" );
        System.out.printf( "    %s\n", t4.aStringUniversal() );
        System.out.printf( "    %s\n", t4.toString() );

        System.out.println( "t5: Se especificaron todos los valores invalidos" );
        System.out.printf( "    %s\n", t5.aStringUniversal() );
        System.out.printf( "    %s\n", t5.toString() );

        System.out.println( "t6. Se especifico el objeto t4 de Timpo2" );
        System.out.printf( "    %s\n", t6.aStringUniversal() );
        System.out.printf( "    %s\n", t6.toString() );
    }
}