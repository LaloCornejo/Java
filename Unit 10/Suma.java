import javax.swing.JOptionPane;

public class Suma {
    public static void main(String[] args) {
        String primerNumero = JOptionPane.showInputDialog( "Introduzca el primer entero" );
        String segundoNumero = JOptionPane.showInputDialog( "Introduzca el segundo entero" );

        int numero1 = Integer.parseInt( primerNumero );
        int numero2 = Integer.parseInt( segundoNumero );

        int suma = numero1 + numero2;

        JOptionPane.showMessageDialog( null, "La suma es "+ suma, "Suma de dos enteros", JOptionPane.INFORMATION_MESSAGE );
    }
}