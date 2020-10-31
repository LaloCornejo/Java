import java.util.Scanner;
public class almacen {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );

        double precio1 = 2.98;
        double precio2 = 4.50;
        double precio3 = 9.98;
        double precio4 = 4.49;
        double precio5 = 6.87;
        int cantidad1 = 0;
        int cantidad2 = 0;
        int cantidad3 = 0;
        int cantidad4 = 0;
        int cantidad5 = 0;
        int codigo1 = 0;
        int codigo2 = 0;
        int codigo3 = 0;
        int codigo4 = 0;
        int codigo5 = 0;
        int contador = 0;
        double total1;
        double total2;
        double total3;
        double total4;
        double total5;

        while ( contador != 1 ){
            System.out.print( "Escribe el codigo del producto: " );
            codigo1 = entrada.nextInt();

            System.out.print( "Escribe la cantidad del produto: " );
            cantidad1 = entrada.nextInt();
            System.out.println( );

            total1 = cantidad1 * precio1;
            
            System.out.print( "Escribe el codigo del producto: " );
            codigo2 = entrada.nextInt();

            System.out.print( "Escribe la cantidad del produto: " );
            cantidad2 = entrada.nextInt();
            System.out.println( );

            total2 = cantidad2 * precio2;
            
            System.out.print( "Escribe el codigo del producto: " );
            codigo3 = entrada.nextInt();

            System.out.print( "Escribe la cantidad del produto: " );
            cantidad3 = entrada.nextInt();
            System.out.println( );

            total3 = cantidad3 * precio3;
            
            System.out.print( "Escribe el codigo del producto: " );
            codigo4 = entrada.nextInt();

            System.out.print( "Escribe la cantidad del produto: " );
            cantidad4 = entrada.nextInt();
            System.out.println( );

            total4 = cantidad4 * precio4;
            
            System.out.print( "Escribe el codigo del producto: " );
            codigo5 = entrada.nextInt();

            System.out.print( "Escribe la cantidad del produto: " );
            cantidad5 = entrada.nextInt();
            System.out.println( );

            total5 = cantidad5 * precio5;
            
            System.out.printf( "%9s%14s%14s%14s\n", "Codigo", "Cantidad", "Precio", "Total" );
            System.out.println( "-----------------------------------------------------" );
            System.out.printf( "%7d%14d%12s%4.2f%10s%4.2f\n", codigo1, cantidad1, "$", precio1, "$",total1 );
            System.out.printf( "%7d%14d%12s%4.2f%10s%4.2f\n", codigo2, cantidad2, "$", precio2, "$",total2 );
            System.out.printf( "%7d%14d%12s%4.2f%10s%4.2f\n", codigo3, cantidad3, "$", precio3, "$",total3 );
            System.out.printf( "%7d%14d%12s%4.2f%10s%4.2f\n", codigo4, cantidad4, "$", precio4, "$",total4 );
            System.out.printf( "%7d%14d%122s%4.2f%10s%4.2f\n", codigo5, cantidad5, "$", precio5, "$",total5 );
            System.out.println( );

            contador++;

        }    
    }
}