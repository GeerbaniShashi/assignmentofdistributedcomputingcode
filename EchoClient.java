/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echoapplication;

import java.net.Socket;

/**
 *
 * @author Shashi
 */
public class EchoClient {
    public static void main(String[] args) {
        try {
            System.out.println("Connection established");
            Socket soc = new Socket("localhost", 9806);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
