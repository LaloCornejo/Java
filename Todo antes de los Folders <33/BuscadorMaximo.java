import java.util.Scanner;
public class BuscadorMaximo {

    public void DeterminarMaximo(){
        Scanner entrada = new Scanner( System.in );

        System.out.print( "Escriba 3 valores de punto flotamte, separaods por espacios; " );
        double numero1 = entrada.nextDouble( );
        double numero2 = entrada.nextDouble( );
        double numero3 = entrada.nextDouble( );

        double resultado = maximo( numero1, numero2, numero3 );

        System.out.println( "El valor maximo es: " + resultado );
    }


    public double maximo ( double x, double y, double z ){
        double valorMaximo = x;

        if( y > valorMaximo )
        valorMaximo = y;

        if( z > valorMaximo )
        valorMaximo = z;

        return valorMaximo;
    }
}