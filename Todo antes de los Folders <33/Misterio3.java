public class Misterio3 {
                                
 public static void main( String args[] ) {
 int fila = 10;
 int columna;

 while ( fila >= 1 ) {

columna = 1;
    while ( columna <= 10 )
    {
System.out.print( fila % 2 == 1 ? "<" : ">" );
      ++columna;
    } 
--fila;
System.out.println(); } 
  } 
} 