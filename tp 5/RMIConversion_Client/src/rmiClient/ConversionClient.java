package rmiClient;

import java.rmi.Naming;

import rmiService.IConversion;

public class ConversionClient{
	public static void main(String[] args) {
		try {
		IConversion stub =(IConversion) Naming.lookup("rmi://localhost:1099/objetconvi");
		System.out.println(stub.convertirMontant(1.00));
		System.out.println(stub.convertirMontant(105.00));

	}catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
