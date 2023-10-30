package serevur;


	import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
	import java.net.Socket;



public class Servuer extends Thread {
	int nb;
	 public static void main(String[] args) {
		 new Servuer().start();
	 }
	 public void run () {
		 try {
			ServerSocket ss = new ServerSocket(1234);
			while(true) {
				Socket s = ss.accept();
				nb++;
				new dude(s,nb).start();
				s.close();}}
		 catch (IOException e) {
		e.printStackTrace();
			}
			
			
		 	 }
	 
	 
}
 class dude extends Thread{
	 private Socket s;
	 private int nb;
	 public dude (Socket s, int nb) {
		 this.nb=nb;
		 this.s=s;
		 
	 }
	 public  void run () {
		  System.out.println("Le client est connecté "+s.getRemoteSocketAddress()+" à l'ordre "+nb);
	        try {

	            s.close();
	        }
	        catch (IOException e)
	        {e.getMessage();}
	    }
		 
		 }
	 
 

