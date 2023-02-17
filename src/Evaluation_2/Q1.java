package Evaluation_2;

import java.util.Scanner;

class Student{
    int id;
    String firstName;
    String lastName;
    String education;
    String city;
    int marks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String
    toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", education='" + education + '\'' +
                ", city='" + city + '\'' +
                ", marks=" + marks +
                '}';
    }
}

public class Q1 {
    public static void main(String[] args) {

        Student student = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student ID:");
        int id = sc.nextInt();

        System.out.println("Enter First Name:");
        String firstName = sc.next();

        System.out.println("Enter Last Name:");
        String lastName = sc.next();

        System.out.println("Enter Education Name:");
        String education = sc.next();

        System.out.println("Enter City Name:");
        String city = sc.next();

        System.out.println("Enter Marks:");
        int marks = sc.nextInt();

        student.setId(id);
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setEducation(education);
        student.setCity(city);
        student.setMarks(marks);

        System.out.println(student);


        int marksObtained = student.getMarks();

        if(marksObtained<35){
            System.out.println("Fail");
        }

        else if(marksObtained<50 && marksObtained>=35){
            System.out.println("Pass class");
        }

        else if(marksObtained<55 && marksObtained>=50){
            System.out.println("Second class");
        }

        else if(marksObtained<60 && marksObtained>=55){
            System.out.println("Higher second class");
        }

        else if(marksObtained<70 && marksObtained>=60){
            System.out.println("First class");
        }

        else if(marksObtained>70){
            System.out.println("Distinction");
        }

    }
}
//Output-
//        Enter Student ID:
//        101
//        Enter First Name:
//        Aryaman
//        Enter Last Name:
//        Bhavsar
//        Enter Education Name:
//        B.Tech
//        Enter City Name:
//        Indore
//        Enter Marks:
//        57
//        Higher second class
