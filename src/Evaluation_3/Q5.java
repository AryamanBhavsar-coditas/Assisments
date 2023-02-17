package Evaluation_3;

import java.time.temporal.TemporalAccessor;

class Student{
    int id;
    String Name;
    Address address;


    public Student(int id, String name, Address address) {
        this.id = id;
        Name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", address=" + address +
                '}';
    }
}

class Teacher{
    int id;
    String Name;
    Address address;


    public Teacher(int id, String name, Address address) {
        this.id = id;
        Name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", address=" + address +
                '}';
    }
}

public class Q5 {
    public static void main(String[] args) {

        Address address1 = new Address(193,452012,
                "Viman Nagar","Indore","India");

        Address address2 = new Address(123,122322,
                "Rajendra Nagar","Pune","India");

        Student student = new Student(101,"Aryaman",address1);
        Teacher teacher = new Teacher(300,"Ram",address2);

        System.out.println(student);
        System.out.println(teacher);
    }
}
