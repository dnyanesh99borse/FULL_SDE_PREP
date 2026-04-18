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
// import java.util.*;
// public class Javabasics{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int tax = 0;
//         int income = sc.nextInt();
//         if(income < 500000){
//             System.out.println(tax+"% Tax");
//         }else if(income >= 500000 && income <= 1000000){
//             tax = (income/100) * 20;
//             System.out.println(tax+"% Tax");
//         }else if(income > 1000000){
//             tax = (income/100) * 30;
//             System.out.println(tax+"% Tax");
//         }else{
//             System.out.println("Invalid Income");
//         }
//     }
// }
//---------------------Largest of the three numbers A , B, C
// public class Javabasics{
//     public static void main(String[] args){
//         int a = 110, b = 90, c = 30;
//         if(a > b && a > c){
//             System.out.println(" a is Greater");
//         }else if(b > c){
//             System.out.println("b is greater");
//         }else{
//             System.out.println("c is greater");
//         }
//     }
// }
// public class Javabasics{
//     public static void main(String[] args){
//         int num = 8;
//         String output = (num%2 == 0) ? "even number" : "odd number";
//         System.out.println(output);
//     }
// }
// public class Javabasics{
//     public static void main(String[] args){
//         int marks = 40;
//         String result = (marks >= 40) ? "Pass" : "Fail";
//         System.out.println(result);
//     }
// }
// import java.util.*;
// public class Javabasics{
//     public static void main(String[] args){
//         System.out.println("Press 1 for Addition");
//         System.out.println("Press 2 for Substraction");
//         System.out.println("Press 3 for Multiplication");
//         System.out.println("Press 4 for Division");
//         System.out.println("Press 5 for Modulus");
//         Scanner sc = new Scanner(System.in);
//         int operation = sc.nextInt();
//         System.out.println("Enter the first num: ");
//         int a = sc.nextInt();
//         System.out.println("Enter the first num: ");
//         int b = sc.nextInt();
//         switch(operation){
//             case 1:
//                 int sum = a+b;
//                 System.out.println(sum);
//                 break;
//             case 2:
//                 int sub = a-b;
//                 System.out.println(sub);
//                 break;
//             case 3:
//                 int mul = a*b;
//                 System.out.println(mul);
//                 break;
//             case 4:
//                 int div = a/b;
//                 System.out.println(div);
//                 break;
//             case 5:
//                 int mod = a%b;
//                 System.out.println(mod);
//                 break;
//             default:
//                 System.out.println("Invalid input");
//         }
//     }
// }
// public class Javabasics{
//     public static void main(String[] args){
//         int year = 2027;
//         if(year % 4 == 0){
//             if(year % 100 == 0){
//                 if(year % 400 == 0){
//                     System.out.println(year + " is a leap year");
//                 }else{
//                     System.out.println(year + " is a not leap year");
//                 }
//             }else{
//                     System.out.println(year + " is a leap year");
//             }
//         }else{
//             System.out.println(year + " is a not a leap year");
//         }
//     }
// }




// public class Javabasics {

//     public static void main(String[] args) {
//         int n = 10899;
//         int rev = 0;

//         while (n != 0) {
//             int last = n % 10;
//             n = n / 10;

//             rev = (rev * 10) + last;
//         }
//         System.out.println(rev);
//     }
// }




// //--keep entering numbers till user enters a multiple of 10;
// import java.util.*;
// public class Javabasics{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int nuumber = 0;
//         do{
//             System.out.println("Enter a number");
//             int number = sc.nextInt();

//             if(number % 10 == 0){
//                 break;
//             }

//             System.out.println(number);
//         }while(true);
//     }
// }






//--display all numbers entered by users except multiple of 10;
// import java.util.*;
// public class Javabasics{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int nuumber = 0;
//         do{
//             System.out.println("Enter a number");
//             int number = sc.nextInt();

//             if(number % 10 == 0){
//                 continue;
//             }

//             System.out.println(number);
//         }while(true);
//     }
// }




public class Javabasics{
    public static void main(String[] args){
        char ch = 'A';

        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}