import java.util.Scanner;

public class Coronavirus {
    public static void main(String[] args) {
    Scanner entrada = new Scanner( System.in );

    int Sintomas;
    int a, b, c, d, e, f, g, h, i, j ;
    
    a = 0;
    b = 0;
    c = 0;
    d = 0;
    e = 0;
    f = 0;
    g = 0;
    h = 0;
    i = 0;
    j = 0;
    Sintomas = 0;
    System.out.printf( "\n%17s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n", "SINTOMAS ", "---------------------------", " 1.Tos seca", " 2.Estornudos", " 3.Tos", " 4.Moco", " 5.Secrecion nasal", " 6.Dolor de cuerpo", " 7.Debilidad", " 8.Fiebre leve", " 9.Fiebre alta", " 10.Dificultad para respirar" );
    System.out.println( "Escriba cuales son sus sintomas: " );
    
        while( entrada.hasNext() ){
            Sintomas = entrada.nextInt( );

            switch( Sintomas ){
                case 1:
                a++;
                break;
                case 2:
                b++;
                break;
                case 3:
                c++;
                break;
                case 4:
                d++;
                break;
                case 5:
                e++;
                break;
                case 6:
                f++;
                break;
                case 7:
                g++;
                break;
                case 8:
                h++;
                break;
                case 9:
                i++;
                break;
                case 10:
                j++;
                break;
            }
        }

        System.out.print( "Segun tus sintomas es probable que tengas: " );

        if( a == 1 & b == 1 & j == 0 ){
            System.out.println( "Contaminacion de aire. ");
        }
        
        if( c == 1 & d == 1 & b == 1 & e == 1 & h == 0 ){
            System.out.println( "Resfriado comun. ");
        }

        if( c == 1 & d == 1 & b == 1 & e == 1 & f == 1 & g == 1 & h == 1 ){
            System.out.println( "Gripe. ");
        }

        if( a == 1 & b == 1 & f == 1 & g == 1 & i == 1 & j == 1 ){
            System.out.println( "CORONAVIRUS. ");
        }

    }
}