package socket_practice02;

import java.io.*;
import java.net.*;

public class Client {

    public static void main(String args[]) throws Exception {
        Socket s = new Socket("localhost", 1010);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println(br.readLine());
    }
}
