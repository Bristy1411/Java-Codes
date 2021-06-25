package JaxB;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "student")
public class Student {
    private String name, address, semester;
    int id;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getSemester() {
        return semester;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String name, String address, String semester, int id) {
        this.name = name;
        this.address = address;
        this.semester = semester;
        this.id = id;
    }
    public Student() {
        super();
    }
    
}
