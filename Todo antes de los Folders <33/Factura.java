public class Factura{

    private String numero;
    private String descripcion;
    private int cantidad;
    private double precio;

    public Factura (String a, String b, int c, double d ){

        numero = a ;
        descripcion = b ;
        cantidad = ( c >= 0 ) ? c : 0 ;
        precio = ( d >= 0 ) ? d : 0.0 ;

    }

    public void setNumeroPieza ( String numero ) {
        numero = numero ;

    }

    public String getNumeroPieza ( ) {
        return numero ;
    }
    
    public void setDescripcion ( String descripcion ) {
        descripcion = descripcion ;

    }

    public String getDescripcion ( ) {
        return descripcion ;
    }
    
    public void setCantidad ( int cantidad ) {
        if(cantidad < 0 ) {
            cantidad = 0 ;
        } else {
            cantidad = cantidad ;
        } 

    }

    public int getCantidad ( ) {
        return cantidad ;
    }
    
    public void setPrecio ( Double precio ) {
        if(precio < 0.0 ) {
            precio = 0.0 ;
        } else {
            precio = precio ;
        } 
    }

    public double getPrecio ( ) {
        return precio ;
    }

    public double obtenerMontoFactura(){
        return cantidad * precio ;
    }
}