import java.util.Scanner;
public class Intereses {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );
        double monto;
        double principal = 1000.0;
        double tasa = 0.05;
        int a = entrada.nextInt();

        System.out.printf( "%s%20s\n", "Ano", "Monto en deposito" );

        for ( int ano = 1; ano <= a; ano++ ){
            monto = principal * Math.pow( 1.0 + tasa, ano );

            System.out.printf( "%3d%,20.2f\n", ano, monto );
        }
    }
}