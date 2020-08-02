import java.util.Scanner;

public class Suma2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in);
        
        int numero1;
        int numero2;
        int numero3;
        int resultado;
        int resultado2;

        System.out.print("Escribe el primer numero : ");
        numero1 = entrada.nextInt();

        System.out.print("Escribe el segundo numero : ");
        numero2 = entrada.nextInt();

        System.out.print("Escribe el tercer numero: ");
        numero3 = entrada.nextInt();

        resultado = numero1 * (numero2 + numero3) ;
        System.out.printf("El resultado es: %d\n", resultado);

        resultado2 = (numero1 + numero2) * numero3;
        System.out.printf("El resultado 2 es: %d\n ", resultado2);


    }
}
