/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echoapplication;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Shashi
 */
public class EchoServer {
    public static void main(String[] args) {
        try {
            System.out.println("waiting for clients....");
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept();
            System.out.println("connection established");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
