
package Server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    final static int port = 1234;
    private static byte[] buffer = new byte[1024];

    public static void main(String[] args){
        try {
            DatagramSocket socket = new DatagramSocket(port);

            while(true){
                DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
                DatagramPacket envoie = null;
                socket.receive(packet);
            }

        }catch( Exception e){
            System.out.println(e.getMessage());
        }
    }
}
//Complete
