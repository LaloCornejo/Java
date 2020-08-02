public class Incremento {

    private int total = 0;
    private final int INCREMENTO;

    public Incremento( int valorIncremento ){
        INCREMENTO = valorIncremento;
    }

    public void sumarIncrementoATotal(){
        total += INCREMENTO;
    }

    public String toString(){
        return String.format( " total = %d", total );
    }
}