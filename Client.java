package tp2;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client {
	public static <BufferReader> void main(String[] args) throws UnknownHostException, IOException {
		int serverPort = 904;
		//Connexion au serveur
		System.out.println("je suis un client pas encore connecté");
		Socket s = new Socket("localhost",serverPort);
		System.out.println("je suis un client connecté");
		//Création des flux d'entrée et de sortie pour la communication avec le serveur
		System.out.println("Génération de l'objet InputStream et OutputStream de la socket");
		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();
		System.out.println("lire un nombre = ");

		try (Scanner scanner = new Scanner(System.in)) {
			 // Lecture d'un nombre depuis la console
			int nb = scanner.nextInt();
			System.out.println("envoyer le nombre '"+nb+"' au serveur");
            // Envoyer  du nombre au serveur

			os.write(nb);
			System.out.println("Attendre la réponse du serveur:");
			// Lecture de la réponse du serveur (le résultat de la multiplication)
			int rep = is.read();
			System.out.println("la valeur de "+nb+"*5 = "+rep);
			// Lecture des opérands et de l'opération depuis la console
			int op1 = 0, op2 = 0;
			String operation = null ; //+,_,*/ // Les opérations autorisées sont +, -, *
			 // Envoi des opérandes et de l'opération au serveur
			@SuppressWarnings("unused")
			InputStream is1 = s.getInputStream();
			OutputStream os1 = s.getOutputStream();
			PrintWriter pw= new PrintWriter(os1,true);
			pw.println(op1); //op1=500800
			pw.println(op2); 
			pw.println(operation);
			// Lecture de la réponse du serveur (résultat de l'opération)
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String serverResponse = br.readLine();
            System.out.println("Server response: " + serverResponse);
        } catch (IOException e) {

        }
	s.close();	// : fermeture de la socket et déconnexion
	}
}
