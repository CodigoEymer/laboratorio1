	import java.awt.*;
	import javax.swing.*;
	
	
	public class active_signals extends JPanel
	{

			/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		//JPanel panel1;
		
		public active_signals()
		{
			JPanel panel1 = new JPanel();
		    this.setBorder(BorderFactory.createTitledBorder("Activación de señales"));
		    
		    
		    BorderLayout layout2 = new BorderLayout();
		    panel1.setLayout(layout2);        
		
		    //final JPanel panelsel = new JPanel();
		    
			
		    panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
			  
		    panel1.add(new JCheckBox("Canal 1")); 
		    panel1.add(new JCheckBox("Canal 2"));
		    panel1.add(new JCheckBox("Canal 3")); 
		    panel1.add(new JCheckBox("Canal 4"));
			  
			JPanel buttonPanel1 = new JPanel(new FlowLayout()); 
			panel1.add(new JButton("Aplicar"));
			  
			 
			//panelsel.add(buttonPanel1);
			
		    //panel.add(panelsel);
		    
			this.add(panel1,BorderLayout.CENTER);
			
		}
			
	}
