//package graficadora;
import java.awt.Color;
import java.awt.GridLayout;


import javax.swing.BorderFactory;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Minute;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
/**
 *
 * @author
 */
public class plano extends JPanel{
	final TimeSeries series = new TimeSeries("Mi grafica", Minute.class);
	final TimeSeriesCollection datos = new TimeSeriesCollection(series);
	final JFreeChart grafica = ChartFactory.createTimeSeriesChart("", "t", "v", datos, true, true, true);
	JPanel panel1=new ChartPanel(grafica);

	int minuto=0;
	private static final long serialVersionUID = 1L;
	public plano() {
        init();
    }

    public void init() {
        this.setBorder(BorderFactory.createLineBorder(Color.blue));
        this.setLayout(new GridLayout(1, 1));
		this.add(panel1);
		this.setVisible(true);
    }
    
    public void graficador(double[] vector)    // vector es la señal de entrada
    {

        for(int i=0;i<vector.length-1;i++)
        {
            int x2 = i+1;
            double y1 = vector[i];
            double y2 = vector[x2];
            //g.drawLine((int)coord_x(i), (int)coord_y(y1), (int)coord_x(x2), (int)coord_y(y2));
            final Hour hora=new Hour();
	       	final int min = new Minute().getMinute();
	       	minuto++;
	       	series.add(new Minute(minuto,hora), y1);
			
        }
    }
}