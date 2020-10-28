
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class visualizacion extends JPanel 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	GUI gui;
	plano coordenadas;
	seleccion_canal Sel;
	recepcion rdatos;
	
		public visualizacion(GUI gui) 
		{	
			this.gui = gui;
			JButton Bguardar;
			JButton Bgraficar;
			JButton Baplicar;
			
			 ///Configuracion panel general
			
			 BorderLayout layout = new BorderLayout();
			 layout.setHgap(0);
			 layout.setVgap(10);
			 this.setBorder(BorderFactory.createTitledBorder("Visualización"));
			 this.setLayout(layout);
			 ///Norte
			 JPanel panelnorte= new JPanel();
			 Bguardar = new JButton(" Guardar");
			 Bgraficar = new JButton("Graficar");
			 panelnorte.add(Bguardar);
			 panelnorte.add(Bgraficar);
			 this.add( panelnorte, BorderLayout.NORTH);
			 ///Centro
			 coordenadas = new plano();
			 this.add( coordenadas, BorderLayout.CENTER);
			 ///Sur
		     JPanel panelsur = new JPanel();
		     Baplicar = new JButton(" APLICAR");
		     JLabel label = new JLabel("T muestreo: ");
		     JTextField textField = new JTextField("", 7);
		     panelsur.add(label);
		     panelsur.add(textField);
		     panelsur.add(Baplicar);
		     this.add(panelsur, BorderLayout.SOUTH);
		     
			 JPanel panelNE = new JPanel(new FlowLayout());
			 JPanel panelNW = new JPanel(new FlowLayout());
			 this.add( panelNE, BorderLayout.EAST);
			 this.add(panelNW, BorderLayout.WEST);
			 
			 
			 Bgraficar.addActionListener(new ActionListener() {
			         public void actionPerformed(ActionEvent e) {
			        	 //
			        	 rdatos =new recepcion();
			        	 
			        	 if (seleccion_canal.control==1) {
			        		 coordenadas.graficador(cuadratica());
			        	 }else if (seleccion_canal.control==2) {
			        		 coordenadas.graficador(lineal());
			        	 }else if (seleccion_canal.control==3) {
			        		 coordenadas.graficador(seno());
			        	 }
			         }          
			      });
			 
			 Bguardar.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
                gui.guardarComo();
			          System.out.println("Guardado");
		         }  
		      });
			 
			 
			 Baplicar.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
			          System.out.println("Tiempo de muestreo aplicado");
			          
		         }  
		      });
			 
			}

		static double[] lineal() {

			int longitud = 10;
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

			int longitud = 100;
			
			double[] vector = new double[longitud];
			
			double r = (2*Math.PI)/longitud;
			
			double c = 0;
			for(int i=0;i<longitud;i++)
	        {
				c =c+r;
				vector[i] = Math.sin(c);
	        }
			return vector;
		}



}
