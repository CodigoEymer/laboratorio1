	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	
	
public class visualizacion extends JPanel
{
		
		public visualizacion()
		{
			SpringLayout layout = new SpringLayout();
			 this.setBorder(BorderFactory.createTitledBorder("Visualización"));
			 
			 JPanel panel = new JPanel();
			 panel.setLayout(layout);
		     JLabel label = new JLabel("Enter Name: ");
		     JTextField textField = new JTextField("", 10);
		     panel.add(label);
		     panel.add(textField);
		     
		     JPanel buttonPanel1 = new JPanel(new FlowLayout());
			 buttonPanel1.add(new JButton("Guardar"));
		     panel.add(buttonPanel1);
		     
		     layout.putConstraint(SpringLayout.WEST, label,25,
			         SpringLayout.WEST, this);
			     layout.putConstraint(SpringLayout.NORTH, label,100,
			         SpringLayout.NORTH, this);
			     layout.putConstraint(SpringLayout.WEST, textField,100,
			         SpringLayout.EAST, label);
			     layout.putConstraint(SpringLayout.NORTH, textField,100,
			         SpringLayout.NORTH, this);
			     layout.putConstraint(SpringLayout.EAST, panel,25,
			         SpringLayout.EAST, textField);
			     layout.putConstraint(SpringLayout.SOUTH, panel,25,
			         SpringLayout.SOUTH, textField);
			     
			this.add(panel);
		}

}
