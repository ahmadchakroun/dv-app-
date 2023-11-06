package Client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class ClientTime {
    public static final int PORT=1212;
    public static byte[] buffer = new byte[1024];

    public static void main(String[] args) throws Exception {
        try {
            DatagramSocket socket = new DatagramSocket();
            byte[] requestData = new byte[1024];

            DatagramPacket data = new DatagramPacket(requestData,requestData.length, InetAddress.getByName("localhost"),PORT);
            socket.send(data);
            DatagramPacket recData = new DatagramPacket(buffer, buffer.length);
            socket.receive(recData);
            System.out.println("server: "+new String(recData.getData(),0, recData.getLength()));

        }catch (Exception e){

            e.printStackTrace();
        }
    }
}