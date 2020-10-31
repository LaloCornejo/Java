import java.util.Scanner;

public class PFactura {
    public static void main(String[] args) {
    
        
        Scanner entrada = new Scanner( System.in );

        String numero;
        String descripcion;
        int cantidad;
        double precio;


        System.out.println( "Escribir codigo del pructo: " );
        numero = entrada.nextLine( );

        System.out.println( "Escribir descripcion del pructo: " );
        descripcion = entrada.nextLine( );
        
        System.out.println( "Escribir cantidad del pructo: " );
        cantidad = entrada.nextInt( );
        
        System.out.println( "Escribir precio del pructo: " );
        precio = entrada.nextDouble( );

        Factura miFactura = new Factura( numero, descripcion, cantidad, precio );

        System.out.printf( " Codigo: \t%s\n ", miFactura.getNumeroPieza() );
        System.out.printf( "Descripcion: \t%s\n ", miFactura.getDescripcion() );
        System.out.printf( "Cantidad: \t%d\n ", miFactura.getCantidad() );
        System.out.printf( "Precio: \t%.2f\n ", miFactura.getPrecio() );

        System.out.printf( "Total: \t%.2f\n", miFactura.obtenerMontoFactura() );
    }
}