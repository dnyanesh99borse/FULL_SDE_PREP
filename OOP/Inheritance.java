
//------------------INHERITANCE--------------------------
// public class Inheritance{
//     public static void main(String[] args){
//         Fish shark = new Fish();

//         //inherited property from base class Animal.
//         shark.color = "Blue";
//         System.out.println(shark.color);
//         //inherited method
//         shark.eat();
//         //child class's own method
//         shark.swim();

//         shark.fins = 2;
//         System.out.println(shark.fins);
//     }
// }

// class Animal {
//     String color;

//     void eat(){
//         System.out.println("eats");
//     }
// }

// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("swims in water");
//     }
// }




//--------------------TYPES OF INHERITANCE-------------------------
//1. SINGLE LEVEL INHERITANCE. (same example as given above one base class and one child or derived class).

//2. MULTI LEVEL INHERITANCE.
//one parent class and multiple derived class and their child class.. that is chain of inheritance.

// class Vehicle {
//     void start(){
//         System.out.println("Vehicle Started");
//     }
// }

// class Car extends Vehicle{
//     void drive(){
//         System.out.println("Car is Driving");
//     }
// }

// class SportsCar extends Car{
//     void turbo(){
//         System.out.println("Turbo Mode Activated");
//     }
// }

// public class Inheritance{
//     public static void main(String[] args){
//         SportsCar sc = new SportsCar();

//         sc.start();  //inherited from Vehicle
//         sc.drive();  //inherited from Car
//         sc.turbo();  //inherited from SportsCar
//     }
// }



//-------------------HIERARCHICAL INHERITANCE----------------------------
class Animal{
    void eat(){
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Meowing");
    }
}
class Elephant extends Animal{
    void size(){
        System.out.println("Enormous");
    }
}

public class Inheritance{
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();

        Elephant e = new Elephant();
        e.eat();
        e.size();
    }
}