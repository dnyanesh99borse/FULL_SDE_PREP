
//--------------METHOD OVERLOADING: (compile time polymorphism)-------------------
// class Calculator{
//     int add(int a , int b){
//         return a + b;
//     }

//     int add(int a, int b, int c){
//         return a + b + c;
//     }

//     double add(double a , double b){
//         return a + b;
//     }
// }
// public class Polymorphism{
//     public static void main(String[] args){
//         System.out.println("This is Method Overloading: Compile time polymorphism")
//         Calculator c = new Calculator();
//         System.out.println(c.add(10,20)); //30
//         System.out.println(c.add(10,20,30)); //30
//         System.out.println(c.add(10.5, 20.5)); //31.0
//     }
// }



//--------------METHOD OVERRIDING : RUNTIME POLYMORPHISM-------------------
class Animal{
    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Barking sound");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Meowing sound");
    }
}

public class Polymorphism{
    public static void main(String[] args){
        System.out.println("This is Method Overriding: Runtime polymorphism");
        
        //very paramount(important) line. hence run time polymorphism
        Animal a1 = new Dog();

        a1.sound(); //Barking sound

        Animal a2 = new Cat();
        a2.sound(); //Meowing sound

        Animal a3 = new Animal();
        a3.sound(); //Animal sound

        //so here in runtime polymorphism, the whole game is of tricking the compiler by giving 
        // PARENT'S REFERENCE AND CHILD'S OBJECT. : Animal a1 = new Dog();
    }
}