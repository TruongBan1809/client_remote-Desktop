package com.study.remotedesktop_client;

import android.app.Application;

import java.net.UnknownHostException;


public class AppDelegate extends Application {
    private ClientThread client;

    public void onCreate(){
        super.onCreate();
    }


    public void createClientThread(String ipAddress, int port) {

        client = new ClientThread(ipAddress, port);

        Thread cThread = new Thread(client);
        cThread.start();
    }


}
