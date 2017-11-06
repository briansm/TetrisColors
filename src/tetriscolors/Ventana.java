
package tetriscolors;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class Ventana  extends JFrame implements ActionListener  {
   //---------------Declaracion de variables----------------- 
            Panel panel = new Panel();
            private JMenuBar menuBarra; // Variable tipo menuBar para Menú superior.
            private JLabel Nombre;
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
      //----------Crear objetos----------------------
        this.setBounds(0, 0, 800, 750); // tamaño de jframe
        this.setLayout(null);
        this.setResizable(false); // que el cliente no pueda cambiar el pañano al jframe 
        this.getContentPane().add(panel);// Agrega Panel al JFrame
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
        this.Nombre=new JLabel();
        this.Nombre.setBounds(100,100 ,50 ,50 );
        this.Nombre.setVisible(true);
        //----------Agregar Componentes----------
          this.add(Nombre);
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
         //----------------------------------------
        //---------Metodos----------------------
          botones();
        //--------------------------------------------  
        //------------Activar menus--------------
          AcercaDelJuego.addActionListener(this);
          NuevoJuego.addActionListener(this);
        //-------------------------------------------  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       //------Funciones del menu--------------
         if(e.getSource()==AcercaDelJuego){
           
            try {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"Acerca de.pdf");
                System.out.println("Funciona");
            }catch (IOException eaaa) {
                eaaa.printStackTrace();
            }
       
         }else if(e.getSource()==NuevoJuego){
          this.Nombre.setText(JOptionPane.showInputDialog("Cual es tu Nombre"));
          panel.setVisible(true);
         }
    }
 
}
