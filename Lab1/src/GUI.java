import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
	
public class GUI 

{
	seleccion_canal SChannel;
	visualizacion Visual;
	active_signals Active;
	
	
		public JFrame mainFrame;;
		
		public static void main(String [] args)
		{
			GUI myLayoutsDemo = new GUI();
		}
		
		public GUI()
		{
			  mainFrame = new JFrame("Diagramaci�n GUI");
			  mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);

		      mainFrame.setSize(1024,500);
		      mainFrame.setLayout(new GridLayout(1, 3));

		      SChannel = new seleccion_canal();
		      Visual = new visualizacion();
		      Active = new active_signals();
		      
		      mainFrame.add(SChannel);
		      mainFrame.add(Visual);
		      mainFrame.add(Active);
		      mainFrame.setVisible(true);  
		}

}
