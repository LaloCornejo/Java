public class PruebaIncremento {
    public static void main(String[] args) {
        Incremento valor = new Incremento( 5 );

        System.out.printf( "Antes de Incrementar: %s\n\n", valor );

        for( int i = 1; i <= 3; i++ ){
            valor.sumarIncrementoATotal();
            System.out.printf( "Despues de incrementar %d: %s\n", i, valor );
        }
    }
}