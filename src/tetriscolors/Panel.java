/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetriscolors;

import java.awt.Color;
import javax.swing.JPanel;  
/**
 *
 * @author Juan José
 */
public class Panel  extends JPanel {
    
    public Panel(){
    
     this.setBounds(300, 25, 300, 650);
     this.setBackground(Color.red);
     this.setVisible(true);
     
}
}