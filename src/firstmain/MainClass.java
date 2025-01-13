package firstmain;

public class MainClass {
    public static void main(String[] args) {
        //System.out.println("Hello world, welcome to springboot1");


        // creating objects
        Student student1 = new Student(); // student1 is the object of Student class

        System.out.println("Student1 is: "+student1);

        // assigning values

        student1.id = 1;
        student1.age = 25;
        student1.name ="Rahul Kumar Jaiswal";
        student1.email = "rahulkumar8533205@gmail.com";
        student1.address = "New Manglapuri, Delhi-110030";

        System.out.println("Student1 is: "+student1);
    }
}

// adding some line
// for checking
