
package palindrome_check;

import java.net.*;
import java.io.*;
import java.lang.*;
public class Server {
    public static void main(String args[]) throws Exception{
        
        try{
        ServerSocket ss = new ServerSocket(6161);
        Socket s = ss.accept();
        
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String str = (String)dis.readUTF();
        String rstr="";
        int len = str.length();
        for(int i=len-1;i>=0;i--)
        {
            rstr = rstr + str.charAt(i);
        }
        int chk = 0;
        
        for(int i=0;i<len-1;i++)
        {
            if(str.charAt(i)!=rstr.charAt(i))
                chk=1;
        }
        if(chk==0)
            System.out.println(str + " is Palindrome");
        else
            System.out.println(str + " is not Palindrome");
            
        ss.close();
        }catch(Exception e){
            System.out.print(e);
        }
    }
}