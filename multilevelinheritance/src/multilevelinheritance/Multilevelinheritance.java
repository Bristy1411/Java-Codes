
package multilevelinheritance;

class input{
    int l,w,h;
   void getdata(int length,int width,int hight){
     l=length;
     w=width;
     h=hight;
  }
}
class calculation extends input{
    int x;
    int volume(){
     getdata(5,6,9);
     x=l*w*h;
     return x; 
    
}
}
class output extends calculation{
   void disply(){
       volume();
       System.out.println("volume = "+x);
   }
   
   }
public class Multilevelinheritance {

   
    public static void main(String[] args) {
       
     output obj = new output();
     obj.disply();
    }
    
}
