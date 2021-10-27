package com.study.remotedesktop_client;

import android.util.Log;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

public class ClientThread implements Runnable{
    private InetAddress serverAddr;
    private int serverPort;
    private DatagramSocket socket;
    byte[] buf = new byte[1024];

    public ClientThread(String ipAddress, int port) {
        try {
            serverAddr = InetAddress.getByName(ipAddress);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        serverPort = port;
    }


    @Override
    public void run() {
        try {
            socket = new DatagramSocket();
            String s = "long day";
            DatagramPacket dp = new DatagramPacket(s.getBytes(), s.length(), serverAddr, serverPort);
            socket.send(dp);
        }catch (Exception e){
            Log.e("ClientActivity", "Client Connection Error", e);
        }

    }
}
