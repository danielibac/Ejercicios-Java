import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class InternalFrame extends JFrame implements ActionListener {
	JDesktopPane desktop;
    static int numDeInternos=0;
    static final int xOffset=20;
    static final int yOffset=20;
    
    public InternalFrame(){
     super("Ejemplo de Internal Frames");
     Dimension tamPantalla=Toolkit.getDefaultToolkit().getScreenSize();
     setBounds(100,100,tamPantalla.width-200,tamPantalla.height-200);
     desktop= new JDesktopPane();
     crearFrame();
     setContentPane(desktop);
     
     JMenuBar menuBar= new JMenuBar();
     JMenu menu= new JMenu("Archivo");
     JMenuItem menuItem= new JMenuItem("Nuevo");
     
     //añadimos item al menu y el menu a la barra
     menu.add(menuItem);
     menuBar.add(menu);
     setJMenuBar(menuBar);
     
     //controlamos la elección por el usuario de la opción "Nuevo"
     menuItem.addActionListener(this);
     
      }
    
     protected void crearFrame(){
       JInternalFrame frame= new JInternalFrame("Archivo #"+(++numDeInternos),
    	true, //resizable
    	true, //cerrable
    	true, //maximizable
    	true); //iconificable
    	
       // hay que establecer siempre el tamaño
       frame.setSize(290,290);
       
       //hay que establecer siempre la localización
       
       frame.setLocation(xOffset*numDeInternos,yOffset*numDeInternos);
       try{
    	frame.setSelected(true); //Activamos el actual frame
        }
       catch(java.beans.PropertyVetoException e){System.out.println("Error cometido");}
       
       desktop.add(frame);
       /* al no especificar un segundo argumento al metodo add, se esta indicando
       que el frame se incluya en la capa por defecto, esto es DEFAULT_LAYER */
       frame.setVisible(true);
      }
      public void actionPerformed(ActionEvent e){
    	crearFrame();  
       }
      }
 
      
       
       
    	 
    	 
     

