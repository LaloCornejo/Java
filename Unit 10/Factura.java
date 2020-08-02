public class Factura implements PorPagar {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura( String pieza, String descripcion, int cuenta, double precio ){
        numeroPieza = pieza;
        descripcionPieza = descripcion;
        establecerCantidad( cuenta );
        establecerPrecioPorArticulo( precio );
    }

    public void establecerNumeroPieza( String pieza ){
        numeroPieza = pieza;
    }
    public String obtenerNumeroPieza(){
        return numeroPieza;
    }

    public void establecerDescripcionPieza( String descripcion ){
        descripcionPieza = descripcion;
    }
    public String obtenerDescripcionPieza(){
        return descripcionPieza;
    }

    public void establecerCantidad( int cuenta){
        cantidad = ( cantidad < 0 ) ? 0 : cuenta;
    }
    public int obtenerCantidad(){
        return cantidad;
    }

    public void establecerPrecioPorArticulo( double precio ){
        precioPorArticulo = ( precio < 0.0 ) ? 0.0 : precio;
    }
    public double obtenerPrecioPorArticulo(){
        return precioPorArticulo;
    }

    public String toString(){
        return String.format( "%s \n%s: %s (%s) \n%s: %d \n%s: $&,.2f", "Factura", "Numero de Pieza",
        obtenerNumeroPieza(), obtenerDescripcionPieza(), "Cantidad", obtenerCantidad(),
        "Precio por atriculo", obtenerPrecioPorArticulo() );
    }

    public double obtenerMontoPago(){
        return obtenerCantidad() * obtenerPrecioPorArticulo();
    }
}