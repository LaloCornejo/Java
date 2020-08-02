import java.util.Scanner;
public class EVMenor {
    public static void main(String[] args) {
        int mayor = 0 ;
        int menor = -99 ;
        int num = 0 ;
        int contador;
        int numContador; 

        Scanner entrada = new Scanner(System.in);
        
        System.out.print( "Escribe cuantos numeros van a ser: " );
        numContador = entrada.nextInt();

        contador = 1;

        do {
            num = entrada.nextInt( );
        if ( num > mayor )
            mayor = num ;
        
         if ( contador == 1 ) {
                menor = num;
        } else {
            if ( num < menor )
                menor = num;
            }   
            contador++;
        }
        while( contador <= numContador );


        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }
}