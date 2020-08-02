import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in);
        
        int numero1;
        int numero2;
        int resultado;

        System.out.print("Escribe el primer numero entero: ");
        numero1 = entrada.nextInt();

        System.out.print("Escribe el segundo numero entero: ");
        numero2 = entrada.nextInt();

        resultado = numero1 + numero2 ;
        System.out.printf("El resultado es: %d\n", resultado);

    }
}
