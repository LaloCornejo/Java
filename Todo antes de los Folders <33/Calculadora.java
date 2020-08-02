import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in);
        
        int numero1;
        int numero2;
        int resultado;
        int resultado2;
        int resultado3;
        int resultado4;

        System.out.print("Escribe el primer numero entero: ");
        numero1 = entrada.nextInt();

        System.out.print("Escribe el segundo numero entero: ");
        numero2 = entrada.nextInt();

        resultado = numero1 + numero2 ;
        System.out.printf("El resultado de la suma es: %d\n", resultado);
        
        resultado2 = numero1 - numero2 ;
        System.out.printf("El resultado de la resta es: %d\n", resultado2);
        
        resultado3 = numero1 * numero2 ;
        System.out.printf("El resultado de la multiplicacion es: %d\n", resultado3);
        
        resultado4 = numero1 / numero2 ;
        System.out.printf("El resultado de la division es: %d\n", resultado4);

    }
}
