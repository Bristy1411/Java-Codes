
package palindrome_check;

import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String args[]) throws Exception{
        try{
        Socket s = new Socket("localhost",6161);
        DataOutputStream diis = new DataOutputStream(s.getOutputStream());
        diis.writeUTF("madam");
        
        diis.flush();
        diis.close();
        s.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
}
