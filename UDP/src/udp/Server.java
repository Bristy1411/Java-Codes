
package udp;

import java.net.*;  
public class Server{  
  public static void main(String[] args) throws Exception {  
    DatagramSocket dataS = new DatagramSocket(2962);  
    byte[] buf = new byte[1024];  
    DatagramPacket dataP = new DatagramPacket(buf, 1024);  
    dataS.receive(dataP);  
    String str = new String(dataP.getData(), 0, dataP.getLength());  
    String rstr="";
        int len = str.length();
        for(int i=len-1;i>=0;i--)
        {
            rstr = rstr + str.charAt(i);
        }
    System.out.println(rstr);  
    dataS.close();  
  } 
}
