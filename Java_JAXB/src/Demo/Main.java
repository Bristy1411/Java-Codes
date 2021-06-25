
package Demo;


import JaxB.Student_Jaxb;

public class Main {
    public static void main(String[] args){
       
  Student_Jaxb obj= new Student_Jaxb();
        obj.marshal();
        obj.unmarshal();
    }
}
