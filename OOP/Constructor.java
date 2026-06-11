//---------CONSTRUCTORS--------------------
// 1. non - parameterized constructor
// 2. parameterized constructor
// 3. copy constructor

class Student {
    String name;
    int roll;

    // Non-parameterized constructor
    Student() {
        System.out.println("Constructor called");
    }

    // Parameterized constructor
    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }

    //COPY CONSTRUCTOR
    Student(Student s){
        this.name = s.name;
        this.roll = s.roll;
    }
}

public class Constructor {
    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student("Dnyanesh");
        System.out.println("Name: " + s2.name);

        Student s3 = new Student(251);
        System.out.println("Roll No: " + s3.roll);

        //copy constructor
        Student s4 = new Student(s2);
        Student s5 = new Student(s3);

        System.out.println("copied name: " + s4.name); //here if we'll print the roll too then it will give 0 cause the s2 dont have variable roll
        System.out.println("copied roll: " + s5.roll); //same here for name , cause s3 dont have variable name.
    }
}