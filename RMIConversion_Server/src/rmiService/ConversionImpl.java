package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Remote;

public class ConversionImpl extends UnicastRemoteObject implements IConversion {

	public ConversionImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double convertirMontant(double mt) throws RemoteException {
	        return mt*3.3;
	    
		
	}

}
