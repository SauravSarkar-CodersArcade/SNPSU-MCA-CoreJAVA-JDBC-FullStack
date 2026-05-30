package algorithms;
class Printer<T> { // Generic Data Type
    T printSomething;
    Printer(T printSomething){
        this.printSomething = printSomething;
    }
    void print(){
        System.out.println(printSomething);
    }
}
public class GenericsDemo {
    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<>(1);
        integerPrinter.print();
        Printer<Double> doublePrinter = new Printer<>(2.45);
        doublePrinter.print();
        Printer<Float> floatPrinter = new Printer<>(1.2F);
        floatPrinter.print();
        Printer<String> stringPrinter = new Printer<>("SNPSU");
        stringPrinter.print();
        Printer<Boolean> booleanPrinter = new Printer<>(true);
        booleanPrinter.print();
        Printer<Character> characterPrinter = new Printer<>('c');
        characterPrinter.print();
    }
}
