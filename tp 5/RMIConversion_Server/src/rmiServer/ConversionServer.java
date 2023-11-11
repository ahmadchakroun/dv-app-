package rmiServer;
import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;

import rmiService.ConversionImpl;
public class ConversionServer {
	public static void main(String[] args) {
		
			
			try {
				ConversionImpl c1 = new ConversionImpl();
			LocateRegistry.createRegistry(1099);//OVERTUER DE ANNAIR
				Naming.rebind("rmi://localhost:1099/objetconvi", c1); // ENRTIER LE ANNIER PAR C
				System.out.println(c1.toString());
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
}
