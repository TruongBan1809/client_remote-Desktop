package com.study.remotedesktop_client;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {
    private EditText ipAdd;
    private EditText port;
    private Button btn_Conn;
    private TextView status;
    private SeekBar sensitivity;
    private EditText screenRatio;


    public static final String PREFS_NAME = "TouchSettings";
    public static final String IP_PREF = "ip_pref";
    public static final String PORT_PREF = "port_pref";
    private Object Controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //lien ket
        btn_Conn = (Button) findViewById(R.id.Btn_conn);
        ipAdd = (EditText) findViewById(R.id.Ed_ipADD);
        port = (EditText) findViewById(R.id.Ed_port);
        status = (TextView) findViewById(R.id.textView2);

        //thuc hien hanh dong
        btn_Conn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    connectToSever();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }



    @Override
    protected void onPause() {
        super.onPause();
    }

/***************************************************************************************************
********************************thông báo trạng thái mạng/máy chủ***********************************
***************************************************************************************************/


/**************************************************************************************************/
/********************************gọi các hàm kết nối/hủy kết nối***********************************/
/**************************************************************************************************/
    private void connectToSever() throws IOException {
        AppDelegate appDel = ((AppDelegate)getApplicationContext());

            String serverIp = ipAdd.getText().toString();
            int serverPort = Integer.parseInt(port.getText().toString());

            appDel.createClientThread(serverIp, serverPort);
    }
}