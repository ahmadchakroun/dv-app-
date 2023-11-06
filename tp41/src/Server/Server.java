
package Server;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
public class Server {
    private static final int port=1235;
    private static byte[] buffer = new byte[1024];
    public static void main (String[]args) throws IOException {
        DatagramSocket socket = new DatagramSocket(port);
        System.out.println("Lancement du serveru...");
        while(true) {
            DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
            socket.receive(packet);
            String username = new String(packet.getData(),0,packet.getLength());
            String message ="Bienvenue "+username;
            DatagramPacket msg = new DatagramPacket(message.getBytes(),message.length(),
                    packet.getAddress(),packet.getPort());
            socket.send(msg);

        }
    }
}
