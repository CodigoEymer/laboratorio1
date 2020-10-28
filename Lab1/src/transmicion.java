import java.io.*;
import java.util.*;
import gnu.io.*;

public class transmicion implements Runnable, SerialPortEventListener
{
    static Enumeration portList;
    static CommPortIdentifier portId;
    static String messageString;
    static SerialPort serialPort;
    static OutputStream outputStream;
    static InputStream inputStream;
    Thread writeThread;
    static byte trama=0x2f;

	
	///////////////////////////////////////////////////////////////////////
    public transmicion(byte b) 
	{
		
		portList = CommPortIdentifier.getPortIdentifiers();

		try
		{
			while (portList.hasMoreElements()) 
			{
				portId = (CommPortIdentifier) portList.nextElement();
				if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) 
				{
					if (portId.getName().equals("COM1")) //if (portId.getName().equals("/dev/term/a"))
					{
						
						// Conectando con el puerto. TIMEOUT = 2000 ms
						try 
						{
							serialPort = (SerialPort) portId.open("SimpleWriteApp", 2000);
						} catch (PortInUseException e) {}
						
						// Iniciando flujos de información
						try 
						{
							outputStream = serialPort.getOutputStream();
							inputStream = serialPort.getInputStream();
						} catch (IOException e) {}
						
						// Registrando eventos.
						try 
						{
							serialPort.addEventListener(this);
						} catch (TooManyListenersException e) {}
						serialPort.notifyOnOutputEmpty(true);
						
						// Configurando parámetros.
						try 
						{
							serialPort.setSerialPortParams(9600,
										   SerialPort.DATABITS_8,
										   SerialPort.STOPBITS_1,
										   SerialPort.PARITY_NONE);
						} catch (UnsupportedCommOperationException e) {}
						
						// Enviando información.
						try 
						{
							outputStream.write(b);
							
							
						} catch (IOException e) {}

						writeThread = new Thread(this);
						writeThread.start();
					}
				}
			}
		} catch(Exception e) {e.printStackTrace();}
		
    }

	///////////////////////////////////////////////////////////////////////
    public void run()
    {
	try {
	    while (true)
		{
		    Thread.sleep(0);
			break;
		}
        } catch (InterruptedException e) {}
    }

	///////////////////////////////////////////////////////////////////////
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
				//System.out.println("\n El mensaje: \""+b+"\" ha sido enviado!");
				if (serialPort != null)
					serialPort.close();
					
				break;
				
			case SerialPortEvent.DATA_AVAILABLE:
				break;
        }
    }
}
