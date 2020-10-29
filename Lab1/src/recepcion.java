import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.TooManyListenersException;

import gnu.io.CommPortIdentifier;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import gnu.io.UnsupportedCommOperationException;

public class recepcion implements Runnable, SerialPortEventListener 
{
    static CommPortIdentifier portId;
    static Enumeration portList;
    static OutputStream outputStream;
    transmicion Tdatos;
    recepcion Rdatos;

    static InputStream inputStream;
    static SerialPort serialPort;
    Thread readThread;
    static int c=0;
    static byte cabecera,trama1,trama2=0;

	///////////////////////////////////////////////////////////////////////
    public recepcion() 
	{
        portList = CommPortIdentifier.getPortIdentifiers();

		try
		{
			while (portList.hasMoreElements()) 
			{
				portId = (CommPortIdentifier) portList.nextElement();
				if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) 
				{
					 if (portId.getName().equals("COM1")) // if (portId.getName().equals("/dev/term/a"))
					 {
						System.out.println("Recibiendo...");
						try 
						{
				            serialPort = (SerialPort) portId.open("SimpleReadApp", 2000);
				            
				        } catch (PortInUseException e) {}
						
						// Iniciando flujos de información
				        try 
						{
				            inputStream = serialPort.getInputStream();
				            outputStream = serialPort.getOutputStream();
				        } catch (IOException e) {}
						
						// Registrando eventos.
						try 
						{
				            serialPort.addEventListener(this);
						} catch (TooManyListenersException e) {}
				        serialPort.notifyOnDataAvailable(true);
						
						// Configurando parámetros.
				        try {
				            serialPort.setSerialPortParams(9600,
				                SerialPort.DATABITS_8,
				                SerialPort.STOPBITS_1,
				                SerialPort.PARITY_NONE);
				        } catch (UnsupportedCommOperationException e) {}
						
						
				        readThread = new Thread(this);
				        readThread.start();
					 }
				}
			}
		} catch(Exception e) {e.printStackTrace();}		
    }

	///////////////////////////////////////////////////////////////////////


	///////////////////////////////////////////////////////////////////////
    public void run() 
	{
        try 
		{
			while (true)
			{
				Thread.sleep(10);
				if(c==1) {
					//serialPort.close();

					outputStream.write(cabecera);
					outputStream.write(trama1);
					
					//outputStream.write(trama2);
					c=0;
					
				}
				
			}
			//break;
        } catch (InterruptedException e) {} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	///////////////////////////////////////////////////////////////////////
    
   public void envior(byte b, byte trama1, byte trama2) {
	   		c=1;
    		System.out.println("METODO ENVIO...");
			//Tdatos= new transmicion(b,trama1,trama2);
			//Rdatos= new recepcion();
			
			}

    
    
    public void serialEvent(SerialPortEvent event) 
	{
        switch(event.getEventType()) 
		{
			case SerialPortEvent.BI:
			case SerialPortEvent.OE:
			case SerialPortEvent.FE:
			case SerialPortEvent.PE:
			case SerialPortEvent.CD:
			case SerialPortEvent.CTS:
			case SerialPortEvent.DSR:
			case SerialPortEvent.RI:
			case SerialPortEvent.OUTPUT_BUFFER_EMPTY:
				break;
			case SerialPortEvent.DATA_AVAILABLE:
				int numBytes=0;
				byte[] readBuffer = new byte[10];

				try 
				{
					while (inputStream.available() > 0) 
					{
						numBytes = inputStream.read(readBuffer);
					}
					
					System.out.print("Mensaje recibido: ");
					System.out.println(new String(readBuffer));		
					
				} catch (IOException e) {}
				
				break;
        }
    }
}
