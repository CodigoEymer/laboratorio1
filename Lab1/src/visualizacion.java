	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	import java.io.BufferedWriter;
	import java.io.FileWriter;
import java.io.IOException;
public class visualizacion extends JPanel 
{
	GUI gui;
	plano coordenadas;
		public visualizacion(GUI gui) 
		{
			this.gui = gui;
			JButton Bguardar;
			JButton Baplicar;
			
			//FlowLayout layout = new FlowLayout();
			 this.setBorder(BorderFactory.createTitledBorder("Visualización"));
			 this.setSize(200, 200);
			 

			 BorderLayout layout = new BorderLayout();
			 //layout.setHgap(10);
			 //layout.setVgap(8);
			 this.setLayout(layout);
			 
			 
			 this.setLayout(new BorderLayout());

			 //panel.setSize(150, 300);

			 
			
			 
			 coordenadas = new plano();
			 //panel.add(coordenadas);
			 this.add( coordenadas, BorderLayout.CENTER);


		     JPanel buttonPanel1 = new JPanel(new FlowLayout());
		     Bguardar = new JButton(" GUARDAR");
		     Baplicar = new JButton(" APLICAR");
		     
		     
		     JLabel label = new JLabel("T muestreo: ");
		     JTextField textField = new JTextField("", 7);
		     buttonPanel1.add(label);
		     buttonPanel1.add(textField);
		     buttonPanel1.add(Baplicar);
		     
		        //JButton start = new JButton("Aplicar");
		        //start.addActionListener(this);
		        //start.setText("Aplicar");
		        //buttonPanel1.add(start);

		     this.add(buttonPanel1, BorderLayout.SOUTH);
			 //panel.add(Bguardar);
			 this.add( Bguardar, BorderLayout.NORTH);
		     //panel.add(buttonPanel1);   
			 
			 JPanel panelNE = new JPanel(new FlowLayout());
			 JPanel panelNW = new JPanel(new FlowLayout());
			 this.add( panelNE, BorderLayout.EAST);
			 this.add(panelNW, BorderLayout.WEST);
			 
			 
			 Bguardar.addActionListener(new ActionListener() {
			         public void actionPerformed(ActionEvent e) {
			        	 gui.guardarComo();
			        	 System.out.println("Guardado");
			         }          
			      });
			 
			 Baplicar.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		        	 coordenadas.graficador(getGraphics(), lineal());
		         }          
		      });
			 
			 
			}
		
		
		
		static double[] lineal() {

			int longitud = 100;
			double m = 1;
			double b = 0;
			double[] vector = new double[longitud];		
			
			for(int i=0;i<longitud;i++)
	        {
				vector[i] = m*i+b;
	        }
			return vector;
			//double[] arrayx = {1,2,2,2,2,3};
		}
		
		static double[] cuadratica() {

			int longitud = 10;
			double a = 1;
			double b = 2;
			double c = 4;
			
			double[] vector = new double[longitud];		
			
			for(int i=0;i<longitud;i++)
	        {
				vector[i] =((double)Math.pow(i,2)*a)+i*b+c;
	        }
			return vector;
		}
		
		static double[] seno() {

			int longitud = 1000;
			
			double[] vector = new double[longitud];
			
			double r = (Math.PI)/longitud;
			
			double j = 0;
			for(int i=0;i<longitud;i++)
	        {
				j = j + r;
				vector[i] = Math.sin(j);
	        }
			return vector;
		}



}
