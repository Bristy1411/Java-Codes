package socket_practice02;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {

    public static void main(String args[]) throws Exception {
        try {
            ServerSocket ss = new ServerSocket(1010);
            Socket s = ss.accept();
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeBytes("Date: " + (new Date()).toString());
            dout.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
