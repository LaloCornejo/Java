public class Cuenta {

    private double saldo;
    
    public Cuenta(double saldoInicial ) {
        //if ( saldoInicial > 0.0 )
            saldo = saldoInicial;
    }

    public void abonar( double monto ) {
        saldo =saldo + monto;
    }

    public void gastar( double gasto ) {
        saldo = saldo - gasto;
    }

    public double obtenerSaldo() {
        return saldo;
    }
}