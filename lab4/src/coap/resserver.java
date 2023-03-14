package coap;

import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class resserver extends CoapResource{

	public resserver(String name)
	{
		super(name);	
	}
	public void handleGET(CoapExchange exchange)
	{
		String hum="Humidity :" + Math.floor(Math.random()*(20+40)-20);
		System.out.println("Sending the Resouce : "+ exchange.getSourceAddress()+hum);
		
		exchange.respond(hum);
		try
		{
			Thread.sleep(1000);
			
		
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}


	
	public static void main(String[] args)
	{
		CoapServer ser=new CoapServer();
//		CoapServer ser2=new CoapServer();
//		ser2.add(new reserver2("Temperature"));
		ser.add(new resserver("Humidity"));
		ser.add(new reserver2("Temperature"));
//		ser2.start();
		
		
		ser.start();
	}
}
