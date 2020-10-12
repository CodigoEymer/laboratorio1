import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
	
public class GUI 

{
	seleccion_canal SChannel;
	visualizacion Visual;
	active_signals Active;
	JPanel Spanel;
	
		public JFrame mainFrame;;
		
		public static void main(String [] args)
		{
			GUI myLayoutsDemo = new GUI();
		}
		
		public GUI()
		{
			  mainFrame = new JFrame("Diagramación GUI");
			  mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
			  mainFrame.setSize(1024,500);
			  
			  Spanel= new JPanel();
			  Spanel.setLayout(new GridLayout(1, 3));

		      SChannel = new seleccion_canal();
		      Visual = new visualizacion();
		      Active = new active_signals();
		           
		      Spanel.add(SChannel);
		      Spanel.add(Visual);
		      Spanel.add(Active);
		      
		      mainFrame.setVisible(true);
		      mainFrame.add(Spanel);
		      
		}

}
