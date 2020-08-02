import java.util.Random;
public class Craps {
    private Random numerosAleatorios = new Random( );

    private enum Estado { CONTINUA, GANO, PERDIDO };

    private final static int DOS_UNO = 2;
    private final static int TRES = 3;
    private final static int SIETE = 7;
    private final static int ONCE = 11;
    private final static int DOCE = 12;

    public void jugar(){
        int miPunto = 0;
        Estado estadoJuego;

        int sumaDeDados = tirarDados();

        switch ( sumaDeDados ){
            case SIETE:
            case ONCE:
                estadoJuego = Estado.GANO;
                break;
            case DOS_UNO:
            case TRES:
            case DOCE:
                estadoJuego = Estado.PERDIDO;
                break;
            default:
                estadoJuego = Estado.CONTINUA;
                miPunto = sumaDeDados;
                System.out.printf( "El punto es %d\n", miPunto );
                break;
        }
        while( estadoJuego == Estado.CONTINUA ){
            sumaDeDados = tirarDados();

            if( sumaDeDados == miPunto )
                estadoJuego = Estado.GANO;
            else 
                if( sumaDeDados == SIETE )
                    estadoJuego = Estado.PERDIDO;
        }

        if( estadoJuego == Estado.GANO )
            System.out.println( "El jugador gana" );
        else 
            System.out.println( "El jugador pierde" );
    }

    public int tirarDados(){
        int dado1 = 1 + numerosAleatorios.nextInt( 6 );
        int dado2 = 1 + numerosAleatorios.nextInt( 6 );

        int suma = dado1 + dado2;

        System.out.printf( "El jugador tiro %d + %d = %d\n",
        dado1, dado2, suma );

        return suma;
    }
}