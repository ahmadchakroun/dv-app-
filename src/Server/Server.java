package Server;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.net.Socket;
import java.net.ServerSocket;
public class Server {
	public static void main(String[] args){
		System.out.println("je suis un server");
		try  {
		ServerSocket server=new ServerSocket(902);//permeter  de connexion au port 
		System.out.println("J ettend le client");
		Socket stocket=server.accept(); // permeter d'accpter le connxion de client
		System.out.println("le client est conncet");
InputStream is = stocket.getInputStream();//objet pour ecrire le resultat envoyer par le server
OutputStream os = stocket.getOutputStream();//objet pour lire le resultat envoyer par le server
int nb = is.read();//permeter de lire un nomber envoyer un nomber par le client
int resultat=nb*5;
os.write(resultat);//permeter d'ecrire le resultat
stocket.close();//fermer le stocket		
server.close();//fermer le server

		} catch (IOException e) {
			e.printStackTrace();	}
	}

}
