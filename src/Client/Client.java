package Client;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.net.Socket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
public class Client {
	public static void main(String[] args){
		System.out.println("je suis un client");
		try  {
InetAddress inetAdd = InetAddress.getByName("10.26.14.108")		;
//rechercher un addresse ip de server
InetSocketAddress isa=new InetSocketAddress(inetAdd,902)		;
//permet le client de conncet  de server 
Socket s = new Socket();
s.connect(isa);
//permet de connect au port de server 
		
		System.out.println("le client est conncet");
int nb ;// declartion de variable type entier
Scanner scanner = new Scanner(System.in);//permeter l'utilisateur d'enter un entier
nb=scanner.nextInt();//permeter de lire le nomber
InputStream is = stocket.getInputStream();//objet pour ecrire le resultat envoyer par le server
OutputStream os = stocket.getOutputStream();//objet pour lire le resultat envoyer par le server
os.write(nb);//envoyer un nomber au server
int resultat=is.read();//lire le resultat envoyer par le server
System.out.println("le resultat est"+resultat);
stocket.close();//fermer le socket
		} catch (IOException e) {
			e.printStackTrace();	}
	}


}
