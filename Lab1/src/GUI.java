import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
	
public class GUI 

{
	seleccion_canal SChannel;
	visualizacion Visual;
	active_signals Active;
	seleccion_canal SChannel1;
	
	
	JButton guardar;
	JTextArea textArea;
	
	
		public JFrame mainFrame;;
		
		public static void main(String [] args)
		{
			new GUI();
		}
		 
		public GUI()
		{
			  textArea = new JTextArea();//Es usado para guardar los valores de las señales
			  //JPanel fondo = new JPanel();
			  
			  mainFrame = new JFrame("GUI");
			  mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		      mainFrame.setSize(880,550);

		      SChannel = new seleccion_canal();
		      SChannel.setBounds(0, 65, 200, 370);
		      
		      Visual = new visualizacion(this);
		      Visual.setBounds(200, 0, 500, 500);
		      
		      Active = new active_signals();
		      Active.setBounds(700, 160, 150, 180);
		      
		      


		      //Al parecer, al agregar en la linea 53 el panel Active deja de ser modificable, debido a ser el ultimo
		      //panel agregado, debido a esto se agrega uno mas y se deja invisible.
		      SChannel1 = new seleccion_canal();
		      SChannel1.setBounds(200, 0, 200, 400);
		      SChannel1.setVisible(false);
		      
				/*
				 * fondo.add(SChannel); fondo.add(Visual); fondo.add(Active);
				 * fondo.add(SChannel1);
				 */
		      
		      mainFrame.add(SChannel); 
		      mainFrame.add(Visual);
		      mainFrame.add(Active);
		      mainFrame.add(SChannel1);
		      
		      mainFrame.setVisible(true);  
		      //mainFrame.add(fondo);
		}
		
		
		public void guardarComo() {
			
			double vector[];
			vector =visualizacion.seno();
			FileDialog fd = new FileDialog(mainFrame,"Guardar",FileDialog.SAVE);
			fd.setVisible(true);
			String string= "";
			
			for	(int i=0; i<vector.length-1; i++) {
				string= String.valueOf(vector[i]);
				textArea.append(String.valueOf(i+1)+" "+string+"\n");
			}
			//String.valueOf(Visual.lineal());
			
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
