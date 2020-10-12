//package graficadora;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
/**
 *
 * @author jorge
 */
public class plano extends JPanel{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public plano() {
        init();
    }

    public void init() {
        this.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        this.setSize(100, 200);
    }

    @Override 
     public void paintComponent( Graphics g ) {
                    super.paintComponent(g);

                    g.setColor(Color.red);

                    g.drawLine(0, this.getHeight()/2, this.getWidth(), this.getHeight()/2);
                    g.drawLine(this.getWidth()/2, 0,this.getWidth()/2 , this.getHeight());
                    
    }

    // y=c*x2 +c*x +c

    public void graficador(Graphics g, double[] vector)    // vector es la se�al de entrada
    {

        for(int i=0;i<vector.length-1;i++)
        {
            int x2 = i+1;
            double y1 = vector[i];
            double y2 = vector[x2];
            g.drawLine((int)coord_x(i), (int)coord_y(y1), (int)coord_x(x2), (int)coord_y(y2));

        }
    }


    
     private double coord_x(double x)
     {
         double real_x = x+(this.getWidth()/2)+10;
         //System.out.println(real_x);
        return real_x;
     }
     private double coord_y(double y)
     {
          double real_y = -y+(this.getHeight()/2)+49;
          return (real_y);
     }
}