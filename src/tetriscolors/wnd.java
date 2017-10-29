

package tetriscolors;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

public class wnd {
    //--------Declaracion de variables----------
    JFrame window;
    JPanel panel;
  //----------Create Contructor----------------
    public wnd(){
        createP();
        createW();
    }
    
  //----------Method to create window-----------
    public void createW(){
        window=new JFrame();
        window.setTitle("TetrisColors");
        window.setSize(500,500);
        window.setLayout(new BoxLayout(window.getContentPane(),BoxLayout.Y_AXIS));
        window.add(panel);
        window.setVisible(true);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
    }
   //----------Methhod to create panels------------
     public void createP(){
         panel=new JPanel();
         panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
     
     }
}
