
package methodoverriding;
class Bank{
    void getinterest(int x,int y){
     int p=x+y;
     System.out.println("Bank interest = "+p);
  }
}
class FSIBL extends Bank{
    void getinterest(int x,int y){
     int o=x+y;
        System.out.println("FSIBL interest = "+o);
  }
}
class DBBL extends Bank{
    void getinterest(int x,int y){
     int n=x+y;
     System.out.println("DBBL interest = "+n);
}
}
class ICB extends Bank{
    void getinterest(int x,int y){
        int m=x+y;
        System.out.println("ICB interest = "+m);
}
}
public class Methodoverriding {
    public static void main(String[] args) {   
       FSIBL obj1 = new FSIBL();
       DBBL obj2 = new DBBL();
       ICB obj3 = new ICB();
       obj1.getinterest(4,5);
       obj2.getinterest(5,5);
       obj3.getinterest(6,5);
    }
}
