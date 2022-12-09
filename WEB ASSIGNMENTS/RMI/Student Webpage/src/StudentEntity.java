package school;

import javax.persistence.*;

@Entity
@Table(name="student")
public class StudentEntity implements java.io.Serializable{
    @Id
    @Column(name="roll_no")
    private int rollNo;
    
    @Column(name="name")
    private String name;

    @Column(name="course")
    private String course;
    
    @Column(name="age")
    private int age;

    public int getRollNo() {return rollNo;}
    public void setRollNo(int value) {rollNo = value;}
    
    public String getName() {return name;}
    public void setName(String value) {name = value;}
    
    public String getCourse() {return course;}
    public void setCourse(int value) {course = value;}
    
    public int getAge() {return age;}
    public void setAge(int value) {age = value;}



}