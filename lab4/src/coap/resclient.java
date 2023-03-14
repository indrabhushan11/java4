package coap;

import java.io.IOException;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.elements.exception.ConnectorException;

public class resclient {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CoapClient cl=new CoapClient("coap://localhost/Humidity");
		CoapClient tecl=new CoapClient("coap://localhost/Temperature");
		
		
		try
		{
			for(int i=0;i<10;i++)
			{
				String txt=cl.get().getResponseText();
				String txt2=tecl.get().getResponseText();
				System.out.println(txt2);
				System.out.println(txt+"\n");
			}
			
			
		}
		catch(ConnectorException e)
		{
			e.printStackTrace();
		}
		catch(IOException e1)
		{
			e1.printStackTrace();
		}
		System.out.println("Ended");
	}

}
