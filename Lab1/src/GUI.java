import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
	
public class GUI 

{
	seleccion_canal SChannel;
	visualizacion Visual;
	active_signals Active;
	JButton guardar;
	JTextArea textArea;
	
		public JFrame mainFrame;;
		
		public static void main(String [] args)
		{
			new GUI();
		}
		
		public GUI()
		{
			textArea = new JTextArea();
			  mainFrame = new JFrame("Diagramación GUI");
			  mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);

		      mainFrame.setSize(1024,400);
		      mainFrame.setLayout(new GridLayout(1, 4));
		      
		      

		      SChannel = new seleccion_canal();
		      Visual = new visualizacion(this);
		      Active = new active_signals();
		      
		      mainFrame.add(SChannel);
		      mainFrame.add(Visual);
		      mainFrame.add(Active);
		      //mainFrame.add(guardar);
		      
		      mainFrame.setVisible(true);  
		}
		
		public void guardarComo() {
			
			double vector[];
			vector =Visual.lineal();
			FileDialog fd = new FileDialog(mainFrame,"Guardar",FileDialog.SAVE);
			fd.setVisible(true);
			String string= "";
			
			for	(int i=0; i<vector.length-1; i++) {
				string= String.valueOf(vector[i]);
				textArea.append(String.valueOf(i+1)+"	"+string+"\n");
				System.out.println(string);
			}
			
			try {
				FileWriter writer =new FileWriter(fd.getDirectory()+ fd.getFile());
				writer.write(textArea.getText());
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

}
