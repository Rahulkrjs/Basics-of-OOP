package firstmain;

public class Student {

    int id;
    String name;
    String email;
    String gender;
    String address;
    String grade;
    int age;


    // Using toString method we convert objects to string
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", grade='" + grade + '\'' +
                ", age=" + age +
                '}';
    }
}
