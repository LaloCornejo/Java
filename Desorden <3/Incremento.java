public class Incremento{
    public static void main(String[] args) {
        int c;

        c = 5;

        System.out.println( "Postincremento" );
        System.out.println( c ) ;
        System.out.println( c++ ) ;
        System.out.println( c ) ;

        c = 5;

        System.out.println( "Preincremento" );
        System.out.println( c ) ;
        System.out.println( ++c ) ;
        System.out.println( c ) ;
       
        c = 5;
       
        System.out.println( "Postdecremento" );
        System.out.println( c ) ;
        System.out.println( c-- ) ;
        System.out.println( c ) ;

        c = 5;
        
        System.out.println( "Predecremento" );
        System.out.println( c ) ;
        System.out.println( --c ) ;
        System.out.println( c ) ;
    }
}