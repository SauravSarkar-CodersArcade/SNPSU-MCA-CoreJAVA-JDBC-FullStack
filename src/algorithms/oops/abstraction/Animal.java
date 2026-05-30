package algorithms.oops.abstraction;
public interface Animal {
    /*
    ℹ The methods inside an interface are completely abstract
    ⭐ We cannot write anything inside the body of the methods
    ⭐ They are implemented by the classes using them
    ✅ Therefore, interfaces exhibit 100% abstraction
     */
    void eat();
    void run();
    default void species(){
        System.out.println("They belong to the fauna group.");
    }
}
class Rabbit implements Animal{
    @Override
    public void eat() {
        System.out.println("Rabbits are herbivores.");
    }
    @Override
    public void run() {
        System.out.println("Rabbits run fast.");
    }
}
class Cheetah implements Animal{
    @Override
    public void eat() {
        System.out.println("Cheetahs are carnivores.");
    }
    @Override
    public void run() {
        System.out.println("Cheetahs run very fast.");
    }
}
class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.species();
        Cheetah cheetah = new Cheetah();
        cheetah.eat();
        cheetah.run();
        cheetah.species();
    }
}

