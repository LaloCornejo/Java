import java.util.Scanner;

public class Separar{

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in );
        
        int numero;
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;
        int numeros;

        System.out.print( "Escriba el numero de 5 digitos: " );
        numero = entrada.nextInt();



        numero1 = numero / 10000 ;
        numero2 = numero / 1000 - numero1 * 10 ;
        numero3 = numero / 100 - numero1 * 100 - numero2 * 10 ;
        numero4 = numero / 10 - numero1 * 1000 - numero2 * 100 - numero3 * 10 ;
        numero5 = numero - numero1 * 10000 - numero2 * 1000 - numero3 * 100 - numero4 * 10 ;
       


        System.out.printf( "%d\t %d\t %d\t %d\t %d\n ", numero1, numero2,numero3,numero4,numero5 );




    }

}