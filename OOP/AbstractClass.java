// abstract class Animal{
//     abstract void sound();
// }

// class Dog extends Animal{
//     public void sound(){
//         System.out.println("Dog is making Barking Sound");
//     }
// }

abstract class Vehicle{
    abstract void start();
}

class Car extends Vehicle{
    void start(){
        System.out.println("Car Started");
    }
}

class Bike extends Vehicle{
    void start(){
        System.out.println("Bike started");
    }
}

public class AbstractClass{
    public static void main(String[] args){
        // Dog d = new Dog();
        // d.sound();

        Car c = new Car();
        c.start();

        Bike b = new Bike();
        b.start();
    }
}