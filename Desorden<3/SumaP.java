
public class SumaP {
    public static void main(String[] args) {
        int total = 0;
        
        for ( int numero = 2; numero <= 50 ; numero+= 2 )
        total += numero;

        System.out.printf( "La suma es: %d\n", total );
    }
}