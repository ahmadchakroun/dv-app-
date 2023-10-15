package Server1;
import java.io.*;
import java.net.*;
public class Server {
	public static void main(String[] args) throws IOException {
		// Définition du port sur lequel le serveur va écouter
		int serverPort = 904;
		try {
		//  Création d'un ServerSocket pour écouter sur le port spécifié
		ServerSocket ss= new ServerSocket(serverPort);
		System.out.println("je suis en attente de la connexion d'un client");
		//Attente de la connexion d'un client
		Socket s = ss.accept();
		System.out.println("un client est connecté");
		  // Établissement des flux d'entrée et de sortie pour la communication
		System.out.println("Génération de l'objet InputStream et OutputStream de la socket");
		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();
		// Lecture d'un nombre envoyé par le client, multiplication par 5, et envoi de la réponse
		System.out.println("j'attend un nombre");
		int nb = is.read();
		int rep = nb*5;
		
		System.out.println("j'envoie la réponse");
		os.write(rep);
		// Opérations mathématiques  basées sur l'opérande et l'opérateur du client
		@SuppressWarnings("unused")
		InputStream is1 = s.getInputStream();
		@SuppressWarnings("unused")
		OutputStream os1 = s.getOutputStream();
		int op1, op2;
		InputStreamReader isr = new InputStreamReader (is);
		BufferedReader br = new BufferedReader(isr);
		op1=Integer.parseInt(br.readLine());
		op2=Integer.parseInt(br.readLine());
		  PrintStream pw = null;
		switch (br.readLine())
		 // Ajouter "break" ici pour éviter l'exécution des autres cas
		  {case "+" : pw.println(op1+op2);

		   case "-" : pw.println(op1-op2);
		
		   case "*" : pw.println(op1*op2);

          
		   case "/" : pw.println(op1/op2);
		
          }
		  
		  
		
		  // Fermeture des sockets et déconnexion
		System.out.println("Déconnexion du client");
			s.close();	
			ss.close();	
		}catch(Exception e){}
		 
    }
}
