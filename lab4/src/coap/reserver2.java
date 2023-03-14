package coap;

import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class reserver2 extends CoapResource{

	public reserver2(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

		public void handleGET(CoapExchange exchange)
		{
			String temp="Temperature :" + Math.floor(Math.random()*(10+40)-40);
			System.out.println("Sending the Resouce : "+ exchange.getSourceAddress()+temp);
			
			exchange.respond(temp);
			try
			{
				Thread.sleep(1000);
				
			
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
}


