	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	
public class seleccion_canal extends JPanel
{

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		JLabel statusLabel;
		JPanel uno;
		plano Plane;
		visualizacion Visual;
		static int control;
		
		public seleccion_canal()
		{
			
			
			BorderLayout layout = new BorderLayout();
			this.setLayout(layout);
			
			final JPanel panel = new JPanel();
		    this.setBorder(BorderFactory.createTitledBorder("Selección de canal"));
		    
		    statusLabel = new JLabel("Seleccione un canal.");
		    
		    //uno = new JPanel();
		    //uno.setLayout(new GridLayout(3 , 1));
		      
		    CardLayout layout1 = new CardLayout();
		    panel.setLayout(layout1);        
		
		    JPanel buttonPanel1 = new JPanel(new FlowLayout());
		    buttonPanel1.setLayout(new BoxLayout(buttonPanel1, BoxLayout.Y_AXIS));
		    
		    JPanel buttonPanel2 = new JPanel(new FlowLayout());
		    buttonPanel2.setLayout(new BoxLayout(buttonPanel2, BoxLayout.Y_AXIS));
		
	    
		    final DefaultComboBoxModel<String> panelName = new DefaultComboBoxModel<String>();
		
		    panelName.addElement("Análogo");
		    panelName.addElement("Digital");
		    
		    final JComboBox<String> listCombo = new JComboBox<String>(panelName);
		    
		    listCombo.setSelectedIndex(0);
		
		    JScrollPane listComboScrollPane = new JScrollPane(listCombo);    
		    FlowLayout Up = new FlowLayout();
		    JPanel select = new JPanel();
		    select.setLayout(Up);
		    select.add(listComboScrollPane);
		    //Up.setHgap(40);
		    Up.setVgap(40);
		    
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
		    
		    Plane = new plano();
		    JButton Canal1 = new JButton("Canal 1");
		    buttonPanel1.add(Canal1);
		    Canal1.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		        	 control = 1;
		         }          
		      });
		    
		    
		    JButton Canal2 = new JButton("Canal 2");
		    buttonPanel1.add(Canal2);
		    Canal2.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            statusLabel.setText("Canal 2 seleccionado.");
		            control = 2;
		         }          
		      });
		    
		    JButton Canal3 = new JButton("Canal 3");
		    buttonPanel1.add(Canal3);
		    Canal3.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            statusLabel.setText("Canal 3 seleccionado.");
		            control = 3;
		         }          
		      });
		    
		    JButton Canal4 = new JButton("Canal 4");
		    buttonPanel1.add(Canal4);
		    Canal4.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            statusLabel.setText("Canal 4 seleccionado.");
		            control = 4;
		         }          
		      });
		    
		    JButton Canal5 = new JButton("Canal 5");
		    buttonPanel1.add(Canal5);
		    Canal5.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            statusLabel.setText("Canal 5 seleccionado.");
		            control = 5;
		         }          
		      });
		    
		    JButton Canal6 = new JButton("Canal 6");
		    buttonPanel1.add(Canal6);
		    Canal6.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            statusLabel.setText("Canal 6 seleccionado.");
		            control = 6;
		         }          
		      });
		    
		    JButton Canal7 = new JButton("Canal 7");
		    buttonPanel1.add(Canal7);
		    Canal7.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            statusLabel.setText("Canal 7 seleccionado.");
		            control = 7;
		         }          
		      });
		    
		    JButton Canal8 = new JButton("Canal 8");
		    buttonPanel1.add(Canal8);
		    Canal8.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            statusLabel.setText("Canal 8 seleccionado.");
		            control = 8;
		         }          
		      });
		    
		    
		    //buttonPanel2.add(listCombo);
		    JButton Canal11 = new JButton("Canal 1");
		    buttonPanel2.add(Canal11);
		    Canal11.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            statusLabel.setText("Canal 1 seleccionado.");
		            control = 9;
		         }          
		      });
		    
		    
		    JButton Canal21 = new JButton("Canal 2");
		    buttonPanel2.add(Canal21);
		    Canal21.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            statusLabel.setText("Canal 2 seleccionado.");
		            control = 10;
		         }          
		      });
		    
		    JButton Canal31 = new JButton("Canal 3");
		    buttonPanel2.add(Canal31);
		    Canal31.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            statusLabel.setText("Canal 3 seleccionado.");
		            control = 11;
		         }          
		      });
		    
		    JButton Canal41 = new JButton("Canal 4");
		    buttonPanel2.add(Canal41);
		    Canal41.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            statusLabel.setText("Canal 4 seleccionado.");
		            control = 12;
		            
		         }          
		      });
		    
		    
		    
		    panel.add("AnÃ¡logo", buttonPanel1);
		    panel.add("Digital", buttonPanel2);
			
		    JPanel botones = new JPanel();
		    botones.add(panel);
		    
		    this.add(select,BorderLayout.NORTH);
		    this.add(botones,BorderLayout.CENTER);
		    this.add(statusLabel,BorderLayout.SOUTH);
		    
		    //this.add(listComboScrollPane);
			//this.add(uno);
		}

}
