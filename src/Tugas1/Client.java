/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author Somad
 */
public class Client {
    public static DatagramSocket ds;
    public static byte buffer[] = new byte[1024];
    public static int clientport = 800, serverport = 900;
    public static void main(String args[]) throws Exception {
        
        ds = new DatagramSocket(clientport);
        System.out.println("Client sedang menunggu server mengirimkan data ");
        System.out.println("tekan Ctrl + C untuk mengakhiri ");
        while (true) {
            DatagramPacket dp = new DatagramPacket(buffer, buffer.length);ds.receive(dp);
            String ps = new String(dp.getData(), 0, dp.getLength());
            System.out.println("From Server: " + ps);
        }
    }
}
