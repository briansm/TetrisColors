/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetriscolors;

import javax.swing.JFrame;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
/**
 *
 * @author Juan José
 */
public class Ventana  extends JFrame implements ActionListener  {
    Panel panel = new Panel();
   
    
    
    
    
    private JMenuBar menuBarra; // Variable tipo menuBar para Menú superior.
            private JMenu Juego; // variables para los menus 
                    private JMenuItem NuevoJuego;
                    private JMenuItem Individual;
                    private JMenuItem Versus;
                    private JMenuItem Salir;
 
            private JMenu Opciones;
                    private JMenuItem Pausa;
                    private JMenuItem VerRecord;
                    private JMenuItem BorrarRecord;
                   

            private JMenu Ayuda;
                    private JMenuItem AcercaDelJuego;
                    private JMenuItem ayuda;
    
    
    // variables de celdas
                    
    
                    
                    
   
      
    int filas=2;
    int columnas=2;   
   Boton[][] MatrizBotones = new Boton[filas][columnas];
      public void botones(){
      
        for (int fila = 0; fila<filas ; fila++) {
              
              for (int columna = 0; columna < columnas; columna++) {

              MatrizBotones[fila][columna] = new Boton(columna,fila ,200,40);   
              MatrizBotones[fila][columna].cambiarNombre(fila, columna);
              panel.add(MatrizBotones[fila][columna]);
              
              
              
              }   
              
          }
        
        
        
        
       }
      
     
      
      
      
    
    
    
    public Ventana(){
     this.setBounds(0, 0, 800, 750); // tamaño de jframe
        this.setLayout(null);
        this.setResizable(false); // que el cliente no pueda cambiar el pañano al jframe
        
        
        
        
         
        this.getContentPane().add(panel);
        
        
        
        
        this.menuBarra = new JMenuBar();
        this.menuBarra.setBounds(0, 0, 800, 25);
        this.menuBarra.setVisible(true);
        
        this.Juego = new JMenu("Juego");
        this.Opciones = new JMenu("Opciones");
        this.Ayuda = new JMenu("Ayuda ");
                
        
        this.NuevoJuego = new JMenuItem("Nuevo Juego");
        this.Individual = new JMenuItem("Individual");
        this.Versus = new JMenuItem("Versus");
        this.Salir = new JMenuItem("Salir");
        
        this.Pausa = new JMenuItem("Pausa");
        this.VerRecord = new JMenuItem("Ver Record");
        this.BorrarRecord = new JMenuItem("Borrar Record");
        
        this.AcercaDelJuego = new JMenuItem("Acerca del Juego");
        this.ayuda = new JMenuItem("Ayuda");
        
        
          menuBarra.add(Juego);
          Juego.add(NuevoJuego);
          Juego.add(Individual);
          Juego.add(Versus);
          Juego.add(Salir);
          menuBarra.add(Opciones);
          Opciones.add(Pausa);
          Opciones.add(VerRecord);
          Opciones.add(BorrarRecord);
          menuBarra.add(Ayuda);
          Ayuda.add(AcercaDelJuego);
          Ayuda.add(ayuda);
          
          
          
          this.add(menuBarra);
          
                botones();
        
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
