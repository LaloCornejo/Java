import java.util.Scanner;
public class TrianguloR {
    public static void main(String[] args) {

        Scanner entrada = new Scanner( System.in );

        double a;
        double b;
        double c;

        System.out.print( "Escriba \"a\" del triangulo: ");
        a = entrada.nextDouble();

        System.out.print( "Escriba \"b\" del triangulo: ");
        b = entrada.nextDouble();

        System.out.print( "Escriba \"c\" del triangulo: ");
        c = entrada.nextDouble();

        /*if ( c > b && c > a ){
            System.out.println( "En efecto es un triangulo rectangulo");
        }else{
            System.out.println( "Este no es un triangulo rectangulo");
        }*/

        if (( a * a ) + ( b * b ) == ( c * c )){
            System.out.println( "En efecto es un triangulo rectangulo");
        }else{
            System.out.println( "Este no es un triangulo rectangulo");
        }
    }
}