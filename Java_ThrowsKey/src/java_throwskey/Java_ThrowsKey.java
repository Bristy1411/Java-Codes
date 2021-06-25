package java_throwskey;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite{
    
    void readFile() throws FileNotFoundException{
       FileInputStream fis = new FileInputStream("F:/sampleJava01.txt"); 
    }
    
    void saveFile() throws FileNotFoundException{
        String text = "hello world";
        FileOutputStream fos = new FileOutputStream("F:/sampleJava003.txt");
    }  
}

public class Java_ThrowsKey {

   
    public static void main(String[] args) {
       ReadAndWrite rw = new ReadAndWrite();
        try{
            rw.readFile();
            
        }catch(FileNotFoundException e){
            System.out.println("Error Found");
        }
        
        ReadAndWrite RW = new ReadAndWrite();
        try{
            RW.saveFile();
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("After Exception");
    }
}
