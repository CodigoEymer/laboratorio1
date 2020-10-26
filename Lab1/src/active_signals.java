	import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
	
	
	public class active_signals extends JPanel
	{
		
		int sel=0;
		int bin1=0;
		int bin2=0;
		int bin3=0;
		int bin4=0;

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
			  
			/*
			 * panel1.add(new JCheckBox("Canal 1")); panel1.add(new JCheckBox("Canal 2"));
			 * panel1.add(new JCheckBox("Canal 3")); panel1.add(new JCheckBox("Canal 4"));
			 */
			  
			/* JPanel buttonPanel1 = new JPanel(new FlowLayout()); */
			
			JCheckBox Canal1 = new JCheckBox("Canal 1");
		    panel1.add(Canal1);
		    Canal1.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		        	 if (bin1==0) {
		        		 sel += 1;
		        		 bin1=1;
		        	 }else {
		        		 sel -= 1;
		        		 bin1=0;
		        	 }
		            
		         }          
		      });
		    
		    JCheckBox Canal2 = new JCheckBox("Canal 2");
		    panel1.add(Canal2);
		    Canal2.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            
		            if (bin2==0) {
		        		 sel += 2;
		        		 bin2=1;
		        	 }else {
		        		 sel -= 2;
		        		 bin2=0;
		        	 }
		            
		         }          
		      });
		    
		    JCheckBox Canal3 = new JCheckBox("Canal 3");
		    panel1.add(Canal3);
		    Canal3.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		        	 
		        	 if (bin3==0) {
		        		 sel += 4;
		        		 bin3=1;
		        	 }else {
		        		 sel -= 4;
		        		 bin3=0;
		        	 }
		            
		         }          
		      });
		    
		    JCheckBox Canal4 = new JCheckBox("Canal 4");
		    panel1.add(Canal4);
		    Canal4.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {

		        	 if (bin4==0) {
		        		 sel += 8;
		        		 bin4=1;
		        	 }else {
		        		 sel -= 8;
		        		 bin4=0;
		        	 }
		         }          
		      });
		    
		    
		    /* panel1.add(new JButton("Aplicar")); */
			JButton button1 = new JButton("Apply");
		   
		    button1.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		        	 System.out.println(sel);
		        	 //Se envia la variable sel
		        	 //jfkdslfjañfdfds
		         }          
		      });  
			 
			this.add(panel1);
			this.add(button1);
		}
			
	}
