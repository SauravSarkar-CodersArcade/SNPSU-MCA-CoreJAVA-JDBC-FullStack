package algorithms.oops.abstraction;
abstract class Vehicle {
    // There are two types of methods in Java
    // 1. Normal Method or Concrete Method
    // Normal methods can be defined and executed
    void start(){
        System.out.println("Vehicle Started");
    }
    // 2. Abstract Method
    // Abstract methods can just be declared
    // They are defined in the classes using them
    abstract void wheels();
    // If an abstract class has even 1 normal method, it is not
    // 100% abstract
    // If it has only abstract methods, it is 100% abstract
}
class Car extends Vehicle {
    @Override
    void wheels(){
        System.out.println("A car has 4 wheels.");
    }
}
class Bike extends Vehicle {
    @Override
    void wheels(){
        System.out.println("A bike has 2 wheels.");
    }
}
