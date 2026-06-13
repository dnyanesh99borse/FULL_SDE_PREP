
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
// class Animal{
//     void eat(){
//         System.out.println("Eating");
//     }
// }
// class Dog extends Animal{
//     void bark(){
//         System.out.println("Barking");
//     }
// }
// class Cat extends Animal{
//     void meow(){
//         System.out.println("Meowing");
//     }
// }
// class Elephant extends Animal{
//     void size(){
//         System.out.println("Enormous");
//     }
// }

// public class Inheritance{
//     public static void main(String[] args){
//         Dog d = new Dog();
//         d.eat();
//         d.bark();

//         Cat c = new Cat();
//         c.eat();
//         c.meow();

//         Elephant e = new Elephant();
//         e.eat();
//         e.size();
//     }
// }





//-------------------HYBRID INHERITANCE----------------------------
class Animal{
    void eat(){
        System.out.println("Eating");
    }
}
class Fish extends Animal{
    void aqua(){
        System.out.println("Aquatic");
    }
}
class Tuna extends Fish{
    void tuna(){
        System.out.println("I am tuna fish");
    }
}
class Shark extends Fish{
    void shark(){
        System.out.println("I am shark");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Flying");
    }
}
class Peacock extends Bird{
    void pea(){
        System.out.println("I am a National Bird");
    }
}
class Mammals extends Animal{
    void mamm(){
        System.out.println("Mammals");
    }
}
class Dog extends Mammals{
    void bark(){
        System.out.println("Barking");
    }
}

public class Inheritance{
    public static void main(String[] args){
        System.out.println("class Fish");
        Fish f = new Fish();
        f.eat();
        f.aqua();
        System.out.println("Class Tuna from class Fish");
        Tuna t = new Tuna();
        t.eat();
        t.aqua();
        t.tuna();

        System.out.println("Class Bird"); 
        Bird b = new Bird();
        b.eat();
        b.fly();
        
        System.out.println("Class Peacock from Class Bird");
        Peacock p = new Peacock();
        p.eat();
        p.fly();
        p.pea();
    }
}