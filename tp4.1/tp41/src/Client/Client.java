package Client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Scanner;

public class Client {
    final static int port = 1234;
    private static byte[] buffer = new byte[1024];

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            sc.nextLine();

            DatagramSocket socket = new DatagramSocket();

            //incomplete
            DatagramPacket packet;

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}s