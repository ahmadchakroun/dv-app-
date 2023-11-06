package Server;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.text.SimpleDateFormat;
import java.text.spi.DateFormatProvider;
import java.util.Date;
public class ServerTime {
    public static final int PORT=1212;
    public static byte[] buffer = new byte[1024];

    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(PORT);
            System.out.println("Demarrage du serveur 'Time'");
            while (true){
                DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
                socket.receive(packet);
                SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date currentTime = new Date();
                String dateToSend = date.format(currentTime);
     DatagramPacket toSend = new DatagramPacket(dateToSend.getBytes(),dateToSend.length(),packet.getAddress(), packet.getPort());
                socket.send(toSend);

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}