import java.util.Scanner;

public class Ejercicio{

public static void main(String[] args) {

    Scanner entrada = new Scanner( System.in );

    int numero1;
    int numero2;
    int numero3;
    int resultado;
    int resultado2;
    int resultado3;
    int resultado4;
    int resultado5;
    int mayor;
    int menor;

    System.out.print("Escriba el primer numero: ");
    numero1 = entrada.nextInt();

    System.out.print("Escriba el segundo numero: ");
    numero2 = entrada.nextInt();

    System.out.print("Escriba el tercer numero: ");
    numero3 = entrada.nextInt();

    resultado = numero1 + numero2 + numero3 ;
    System.out.printf("El resultado de la suma es: %d\n", resultado);

    resultado2 = (numero1 + numero2 + numero3) / 3 ;
    System.out.printf("El promedio es: %d\n", resultado2);

    resultado3 = numero1 * numero2 * numero3 ;
    System.out.printf("El el producto es: %d\n", resultado3);

    mayor = 0;
    menor = 0;

    if ( numero1 > numero2 )
        mayor = numero1 ;

    if ( numero2 > numero1 )
        mayor = numero2 ;

    if ( mayor > numero3 )
        mayor = mayor ;
    
    if ( numero3 > mayor )
         mayor = numero3 ;
    
    System.out.printf( "EL numero mayor es: %d\n", mayor );

    if ( numero1 < numero2 )
        menor = numero1 ;

    if ( numero2 < numero1 )
        menor = numero2 ;

    if ( menor < numero3 )
        menor = menor ;

    if ( numero3 < menor )
        menor = numero3 ;

    System.out.printf( "El numero menor es: %d\n", menor );

    




}
}