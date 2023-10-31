package ie.atu;

import java.util.Scanner;

public class Student1 {
    String Name;
    String Email;
    String Course;

    //constructor
    public Student1(String Name, String Email, String Course) {
        this.Name = Name;
        this.Email = Email;
        this.Course = Course;
    }
    public Student1(String Name) {
        this.Name = Name;
    }

    public Student1() {
        this.Name = "";
        this.Email = "";
        this.Course = "";

    }

    public void getName() {
        System.out.println("Name:" + Name);
    }



    public void getEmail() {
        System.out.println("\nEmail:" + Email);
    }





    public void getCourse() {
        System.out.println("\nCourse:" + Course);
    }


//Method to get/set user input


    public void setName() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name");
        this.Name = scanner.nextLine();
    }

    public void setEmail() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Email");
        this.Email = scanner.nextLine();
    }

    public void setCourse() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Course");
        this.Course = scanner.nextLine();
    }
}