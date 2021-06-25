
package userdefinedexception;
class myexception extends Exception{
    myexception(String m){
        super(m);
    }
}
public class Userdefinedexception {
    public static void main(String[] args) {
        int arr[]=new int[10];
        try {
            if(arr.length<11)
                throw new myexception("array size is small");
           
        } catch (myexception e) {
            System.out.println("array index out of  bounds");
            System.out.println(e.getMessage());
        }
        
    }
    
}
