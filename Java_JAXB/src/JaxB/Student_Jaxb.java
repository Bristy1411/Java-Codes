
package JaxB;

import javax.xml.bind.*;
import java.io.*;

public class Student_Jaxb {
    public void marshal(){
        try{
            Student st = new Student("Bristy", "Savar", "12th", 171442105);
            JAXBContext jc = JAXBContext.newInstance(Student.class);
            Marshaller ma = jc.createMarshaller();
            ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            ma.marshal(st, System.out);
            ma.marshal(st, new File("src\\data\\Student.xml"));  
        }catch(Exception e){
            System.out.println(" " + e.getMessage());
        }
    }
    
    public void unmarshal(){
        try{
            JAXBContext jc = JAXBContext.newInstance(Student.class);
            Unmarshaller unm = jc.createUnmarshaller();
            Student st = (Student)unm.unmarshal(new File("src\\data\\Student.xml"));
            System.out.println("Student Information:");
            System.out.println("Name: " + st.getName());
            System.out.println("Address: " + st.getAddress());
            System.out.println("Semester: " + st.getSemester());
            System.out.println("Id: " + st.getId());   
        }catch(Exception e){
            System.out.println(""+e.getMessage());
        }
    }
}
