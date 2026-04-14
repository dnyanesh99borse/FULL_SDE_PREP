// output in java
// public class Javabasics{
//     public static void main(String[] args){
//         System.out.println("Hello Duniya!");
//     }
// }



// //print: prints the output without space of line
// public class Javabasics{
//     public static void main(String[] args){
//         System.out.print("Hello Duniya!");
//     }
// }



// //println: print output with the space of line after each output
// public class Javabasics{
//     public static void main(String[] args){
//         System.out.println("Hello Duniya!");
//     }
// }



// // '\n': print output with the space of line after each output
// public class Javabasics{
//     public static void main(String[] args){
//         System.out.print("Hello Duniya!\n");
//         System.out.print("Hello Duniya!");
//     }
// }



// ------------VARIABLES IN JAVA------------------
// //variable: a variable is a container that holds data that can be changed during the execution of a program
// public class Javabasics{ 
//     public static void main(String[] args){
//         int age = 25; //integer variable
//         String name = "John"; //string variable
//         double salary = 50000.50; //double variable
//         boolean isMarried = false; //boolean variable
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);       
//         System.out.println("Salary: " + salary);
//         System.out.println("Married: " + isMarried);
//     }
// }


// -----------------------------DATA TYPES IN JAVA------------------
// //data types: a data type is a classification of data that tells the compiler or interpreter
// //how the programmer intends to use the data. Java has two categories of data types: primitive and non-primitive

// //primitive data types: a primitive data type is a basic data type that is not an object and has no methods.
// public class Javabasics{ 
//     public static void main(String[] args){
//         int age = 25; //integer variable
//         double salary = 50000.50; //double variable
//         boolean isMarried = false; //boolean variable
//         char grade = 'A'; //char variable
//         System.out.println("Age: " + age);
//         System.out.println("Salary: " + salary);
//         System.out.println("Married: " + isMarried);
//         System.out.println("Grade: " + grade);
//     }
// }

// //non-primitive data types: a non-primitive data type is a data type that is an object and has methods.
// public class Javabasics{
//     public static void main(String[] args){
//         String name = "John"; //string variable
//         System.out.println("Name: " + name);
//     }
// }

// import java.util.Scanner;
// public class Javabasics{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter your name: ");
//         String name = sc.next();

//         System.out.println("Enter your full name: ");
//         String fullname = sc.nextLine();

//         System.out.print("Enter your age: ");
//         int age = sc.nextInt();

//         System.out.println("Enter any byte number: ");
//         byte num = sc.nextByte();

//         System.out.println("Enter any float number:");
//         float num1 = sc.nextFloat();

//         System.out.println("Enter any double number:");
//         double num2 = sc.nextDouble();

//         System.out.println("Enter any boolean value:");
//         boolean isMarried = sc.nextBoolean();

//         System.out.println("Enter any char value:");
//         char grade = sc.next().charAt(0);

//         System.out.println("Enter any long number:");
//         long num3 = sc.nextLong();

//         System.out.println("Enter any short number:");
//         short num4 = sc.nextShort();

//         System.out.println("Name: " + name);
//         System.out.println("Full Name: " + fullname);
//         System.out.println("Age: " + age);
//         System.out.println("Byte Number: " + num);
//         System.out.println("Float Number: " + num1);
//         System.out.println("Double Number: " + num2);
//         System.out.println("Boolean Value: " + isMarried);
//         System.out.println("Char Value: " + grade);
//         System.out.println("Long Number: " + num3);
//         System.out.println("Short Number: " + num4);

//     }
// }






//---------------if-else statement in java------------------
//---------------else-if statement in java------------------
import java.util.*;
public class Javabasics{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int tax = 0;
        int income = sc.nextInt();

        if(income < 500000){
            System.out.println(tax+"% Tax");
        }else if(income >= 500000 && income <= 1000000){
            tax = (income/100) * 20;
            System.out.println(tax+"% Tax");
        }else if(income > 1000000){
            tax = (income/100) * 30;
            System.out.println(tax+"% Tax");
        }else{
            System.out.println("Invalid Income");
        }
    }
}