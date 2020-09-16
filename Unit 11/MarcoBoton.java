import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MarcoBoton extends JFrame{
    private JButton botonJButtonSimple;
    private JButton botonJButtonElegante;

    public MarcoBoton(){
        super( "Prueba de botones" );
        setLayout( new FlowLayout() );

        botonJButtonSimple = new JButton( "Boton simple" );
        add( botonJButtonSimple );

        Icon insecto1 = new ImageIcon( getClass().getResource( "insecto.png" ) );
        Icon insecto2 = new ImageIcon( getClass().getResource( "insecto.png" ) );
        botonJButtonElegante = new JButton( "Boton Elegante", insecto1 );
        botonJButtonElegante.setRolloverIcon( insecto2 );
        add( botonJButtonElegante );

        ManejadorBoton manejador = new ManejadorBoton();
        botonJButtonElegante.addActionListener( manejador );
        botonJButtonSimple.addActionListener( manejador );
    }

    private class ManejadorBoton implements ActionListener{
        public void actionPerformed( ActionEvent evento ){
            JOptionPane.showMessageDialog( MarcoBoton.this, String.format( "Usted oprimio: %s", evento.getActionCommand() ) );
        }
    }
}