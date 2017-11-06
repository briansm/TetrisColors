
package tetriscolors;



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
/**
 *
 * @author Juan José
 */
public class Boton extends JButton implements ActionListener {
   
  public Boton(int posx, int posy,int ancho,int alto){
    setBounds(posx,posy,ancho,alto);
    addActionListener(this);
 
  }  

  public void cambiarNombre(int x, int y){
    setText((x+1)+","+(y+1));
  
  
  }
  
  
  
  
    @Override
    public void actionPerformed(ActionEvent e) {
      setBackground(Color.BLUE);
    }
}
