	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	
	
public class visualizacion extends JPanel implements ActionListener 
{
	plano coordenadas;
		public visualizacion() 
		{
			
			JButton Bguardar;
			//FlowLayout layout = new FlowLayout();
			 this.setBorder(BorderFactory.createTitledBorder("Visualización"));
			 this.setSize(200, 200);
			 

			 BorderLayout layout = new BorderLayout();
			 layout.setHgap(10);
			 layout.setVgap(8);
			 this.setLayout(layout);
			 
			 
			 this.setLayout(new BorderLayout());

			 //panel.setSize(150, 300);

			 
			
			 
			 coordenadas = new plano();
			 //panel.add(coordenadas);
			 this.add( coordenadas, BorderLayout.CENTER);


		     JPanel buttonPanel1 = new JPanel(new FlowLayout());
		     Bguardar = new JButton(" GUARDAR");
		     
		     JLabel label = new JLabel("F muestreo: ");
		     JTextField textField = new JTextField("", 7);
		     buttonPanel1.add(label);
		     buttonPanel1.add(textField);
		     
		        JButton start = new JButton("Aplicar");
		        start.addActionListener(this);
		        //start.setText("Aplicar");
		        buttonPanel1.add(start);

		     this.add(buttonPanel1, BorderLayout.SOUTH);
			 //panel.add(Bguardar);
			 this.add( Bguardar, BorderLayout.NORTH);
		     //panel.add(buttonPanel1);   
			 
			 JPanel panelNE = new JPanel(new FlowLayout());
			 JPanel panelNW = new JPanel(new FlowLayout());
			 this.add( panelNE, BorderLayout.EAST);
			 this.add(panelNW, BorderLayout.WEST);

			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}

}
