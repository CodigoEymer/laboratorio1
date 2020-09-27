	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	
	
public class seleccion_canal extends JPanel
{

		JLabel statusLabel;
		
		public seleccion_canal()
		{
			final JPanel panel = new JPanel();
		    this.setSize(300,300);
		    this.setBorder(BorderFactory.createTitledBorder("Selección de canal"));
		    
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
		    buttonPanel1.add(new JButton("Canal 5"));
		    buttonPanel1.add(new JButton("Canal 6"));
		    buttonPanel1.add(new JButton("Canal 7"));
		    buttonPanel1.add(new JButton("Canal 8"));
		    
		    
		    JPanel buttonPanel2 = new JPanel(new FlowLayout());
		    buttonPanel2.setLayout(new BoxLayout(buttonPanel2, BoxLayout.Y_AXIS));
		    
		    buttonPanel2.add(new JButton("Canal 1"));
		    buttonPanel2.add(new JButton("Canal 2"));
		    buttonPanel2.add(new JButton("Canal 3"));
		    buttonPanel2.add(new JButton("Canal 4"));
			/*
			 * JPanel textBoxPanel = new JPanel(new FlowLayout());
			 * 
			 * textBoxPanel.add(new JLabel("Name:")); textBoxPanel.add(new JTextField(20));
			 */
		
		    panel.add("Análogo", buttonPanel1);
		    panel.add("Digital", buttonPanel2);
		    
		    final DefaultComboBoxModel panelName = new DefaultComboBoxModel();
		
		    panelName.addElement("Análogo");
		    panelName.addElement("Digital");
		    
		    final JComboBox listCombo = new JComboBox(panelName);    
		    listCombo.setSelectedIndex(0);
		
		    JScrollPane listComboScrollPane = new JScrollPane(listCombo);    
		
		    JButton showButton = new JButton("Show");
		
		    showButton.addActionListener(new ActionListener() {
		       public void actionPerformed(ActionEvent e) { 
		          String data = "";
		          if (listCombo.getSelectedIndex() != -1) {  
		             CardLayout cardLayout = (CardLayout)(panel.getLayout());
		             cardLayout.show(panel,(String)listCombo.getItemAt(listCombo.getSelectedIndex()));	               
		          }              
		          statusLabel.setText(data);
		       }
		    }); 
			  
		    this.add(listComboScrollPane);
		    this.add(showButton);
			this.add(panel);
		}

}
