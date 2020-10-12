	import java.awt.*;
	import java.awt.Graphics;
	import java.awt.event.*;
	import javax.swing.*;
	import java.awt.Color;
	
public class seleccion_canal extends JPanel
{

		JLabel statusLabel;
		JPanel uno;
		plano Plane;
		visualizacion Visual;
		
		public seleccion_canal()
		{
			Visual = new visualizacion();
			
			final JPanel panel = new JPanel();
		    this.setSize(300,300);
		    this.setBorder(BorderFactory.createTitledBorder("Selección de canal"));
		    
		    statusLabel = new JLabel("Seleccione un canal.",JLabel.CENTER);
		    
		    uno = new JPanel();
		    uno.setLayout(new GridLayout(2 , 2));
		      
		    CardLayout layout = new CardLayout();
		    layout.setHgap(10);
		    layout.setVgap(10);
		    panel.setLayout(layout);        
		
		    JPanel buttonPanel1 = new JPanel(new FlowLayout());
		    buttonPanel1.setLayout(new BoxLayout(buttonPanel1, BoxLayout.Y_AXIS));
		    
		    JPanel buttonPanel2 = new JPanel(new FlowLayout());
		    buttonPanel2.setLayout(new BoxLayout(buttonPanel2, BoxLayout.Y_AXIS));
		
	    
		    final DefaultComboBoxModel panelName = new DefaultComboBoxModel();
		
		    panelName.addElement("Análogo");
		    panelName.addElement("Digital");
		    
		    final JComboBox listCombo = new JComboBox(panelName);
		    
		    listCombo.setSelectedIndex(0);
		
		    JScrollPane listComboScrollPane = new JScrollPane(listCombo);    
		
		    listCombo.addActionListener(new ActionListener() {
		       public void actionPerformed(ActionEvent e) { 
		          String data = "Seleccione un canal.";
		          if (listCombo.getSelectedIndex() != -1) {  
		             CardLayout cardLayout = (CardLayout)(panel.getLayout());
		             cardLayout.show(panel,(String)listCombo.getItemAt(listCombo.getSelectedIndex()));	               
		          }              
		          statusLabel.setText(data);
		          
 
		       }
		    }); 
		    
		    //Graphics g = Plane.getGraphics();
		    ///////////////////////////
		    //buttonPanel1.add(listCombo);
		    JButton Canal1 = new JButton("Canal 1");
		    buttonPanel1.add(Canal1);
		    Canal1.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		        	 
		         }          
		      });
		    
		    
		    JButton Canal2 = new JButton("Canal 2");
		    buttonPanel1.add(Canal2);
		    Canal2.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            statusLabel.setText("Canal 2 seleccionado.");
		            Visual.canalseleccionado();
		         }          
		      });
		    
		    JButton Canal3 = new JButton("Canal 3");
		    buttonPanel1.add(Canal3);
		    Canal3.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            statusLabel.setText("Canal 3 seleccionado.");
		         }          
		      });
		    
		    JButton Canal4 = new JButton("Canal 4");
		    buttonPanel1.add(Canal4);
		    Canal4.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            statusLabel.setText("Canal 4 seleccionado.");
		         }          
		      });
		    
		    JButton Canal5 = new JButton("Canal 5");
		    buttonPanel1.add(Canal5);
		    Canal5.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            statusLabel.setText("Canal 5 seleccionado.");
		         }          
		      });
		    
		    JButton Canal6 = new JButton("Canal 6");
		    buttonPanel1.add(Canal6);
		    Canal6.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            statusLabel.setText("Canal 6 seleccionado.");
		         }          
		      });
		    
		    JButton Canal7 = new JButton("Canal 7");
		    buttonPanel1.add(Canal7);
		    Canal7.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            statusLabel.setText("Canal 7 seleccionado.");
		         }          
		      });
		    
		    JButton Canal8 = new JButton("Canal 8");
		    buttonPanel1.add(Canal8);
		    Canal8.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            statusLabel.setText("Canal 8 seleccionado.");
		         }          
		      });
		    
		    
		    //buttonPanel2.add(listCombo);
		    JButton Canal11 = new JButton("Canal 1");
		    buttonPanel2.add(Canal11);
		    Canal11.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            statusLabel.setText("Canal 1 seleccionado.");
		         }          
		      });
		    
		    
		    JButton Canal21 = new JButton("Canal 2");
		    buttonPanel2.add(Canal21);
		    Canal21.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            statusLabel.setText("Canal 2 seleccionado.");
		         }          
		      });
		    
		    JButton Canal31 = new JButton("Canal 3");
		    buttonPanel2.add(Canal31);
		    Canal31.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            statusLabel.setText("Canal 3 seleccionado.");
		         }          
		      });
		    
		    JButton Canal41 = new JButton("Canal 4");
		    buttonPanel2.add(Canal41);
		    Canal41.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            statusLabel.setText("Canal 4 seleccionado.");
		            
		         }          
		      });
		    
		    
		    
		    panel.add("Análogo", buttonPanel1);
		    panel.add("Digital", buttonPanel2);
			
		    uno.add(listComboScrollPane);
		    
		    uno.add(panel);
		    
		    uno.add(statusLabel);
		    
		    this.add(listComboScrollPane);
		   // this.add(showButton);
			this.add(uno);
		}

}
