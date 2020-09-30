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
			
			    final JPanel panelsel = new JPanel();
			    panelsel.setLayout(new BoxLayout(panelsel, BoxLayout.Y_AXIS));
			    
				panelsel.add(new JCheckBox("Canal 1"));
				panelsel.add(new JCheckBox("Canal 2"));
				panelsel.add(new JCheckBox("Canal 3"));
				panelsel.add(new JCheckBox("Canal 4"));
				
				JPanel buttonPanel1 = new JPanel(new FlowLayout());
				buttonPanel1.add(new JButton("Aplicar"));
			    
				panelsel.add(buttonPanel1);
				
			    panel.add(panelsel);
			    
				this.add(panel);
			}

	}
