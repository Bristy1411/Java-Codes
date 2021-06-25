package sumofnumber;
import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    public static void main(String args[]) throws IOException{
        
        ServerSocket ss = new ServerSocket(1010);
        Socket s = ss.accept();
        int v, tot=0;
        String str;
        
        InputStream is = s.getInputStream();
        PrintStream ps = new PrintStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        
        while((str=br.readLine())!=null){
            System.out.println("The number sends by client is:"+str);
            v = Integer.parseInt(str);
            tot = tot + v;
            ps.println(""+tot);
        }
        
        ps.close();
        ss.close();
        s.close();
    }
}
