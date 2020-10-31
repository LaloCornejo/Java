import java.util.Scanner;

public class Polinomio {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in);
        
        int a;
        int b;
        int c;
        int x;
        int resultado;

        System.out.print("Escribe el valor de \"a\": ");
        a = entrada.nextInt();

        System.out.print("Escribe el valor de \"b\": ");
        b = entrada.nextInt();

        System.out.print("Escribe el valor de \"c\": ");
        c = entrada.nextInt();
        
        System.out.print("Escribe le valor de \"x\": ");
        x = entrada.nextInt();
        
        resultado =  a * (x * x) + b * x + c;
        System.out.printf("El resultado  de y = ax2 + bx +c es: %d\n", resultado);

    }
}
