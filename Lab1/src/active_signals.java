	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	
	
public class active_signals extends JPanel
{

		JLabel statusLabel;
		
		public active_signals()
		{
			final JPanel panel = new JPanel();
		    this.setSize(300,300);
		    this.setBorder(BorderFactory.createTitledBorder("Activación de señales"));
		    
		    statusLabel = new JLabel("",JLabel.CENTER);
		
		    CardLayout layout = new CardLayout();
		    layout.setHgap(10);
		    layout.setVgap(10);
		    panel.setLayout(layout);        
		
		    JPanel buttonPanel1 = new JPanel(new FlowLayout());
		    buttonPanel1.setLayout(new BoxLayout(buttonPanel1, BoxLayout.Y_AXIS));
		
		    buttonPanel1.add(new JButton("Canal 1"));
		    buttonPanel1.add(new JButton("Canal 2"));
		    buttonPanel1.add(new JButton("Canal 3"));
		    buttonPanel1.add(new JButton("Canal 4"));
		    
		    panel.add(buttonPanel1);
		    
			this.add(panel);
		}

}