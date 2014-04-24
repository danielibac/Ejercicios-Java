import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class EjemploInternalFrame extends WindowAdapter{
	 public static void main(String[] args){
		 InternalFrame frame= new InternalFrame();
		 frame.setVisible(true);
	 }
  public void WindowClosing(WindowEvent e){
	  System.exit(0);
  }
 }