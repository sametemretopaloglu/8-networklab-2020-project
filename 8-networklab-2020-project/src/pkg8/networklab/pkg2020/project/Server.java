/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketfiletransferdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author abdulhalik
 * @author halil
 *
 * Ekleme yaptığımız her kod boluğu için yorum satırı eklemeye çalışalım, anlaşılır olsun.
 */
public class Server {

    private ServerSocket serverSocket = null;
    private Socket socket = null;
    private ObjectInputStream inputStream = null;

    public Server() {

    }

    /**
     * Socket bağlantılarının kabul edilmesi.
     */


    public void doConnect() {
        try {
            serverSocket = new ServerSocket(4445);
            socket = serverSocket.accept();
            System.out.println(socket.getPort());
            inputStream = new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Server server = new Server();
        server.doConnect();
    }

}
