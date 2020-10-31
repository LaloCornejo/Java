public class PBreak{
    public static void main(String[] args) {
        int cuenta ;

        for ( cuenta = 1 ; cuenta <= 10; cuenta++ ){
            if( cuenta == 5 )
            continue;

            System.out.printf( "%d ", cuenta );
        }

        System.out.printf( "\nSalio del ciclo en la cuenta = %d\n", cuenta );
    }

}