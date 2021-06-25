
package udp;

import java.net.*;  
public class Client{  
  public static void main(String[] args) throws Exception {  
    DatagramSocket dataS = new DatagramSocket();  
    String str = "Abdullah Al Numan";  
    InetAddress ip = InetAddress.getByName("127.0.0.1");  
     
    DatagramPacket dataP = new DatagramPacket(str.getBytes(), str.length(), ip, 2962);  
    dataS.send(dataP);  
    dataS.close();  
  }  
} 

