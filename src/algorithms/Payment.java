package algorithms;
public interface Payment {
    void pay();
}
class CreditCard {
    public static void main(String[] args) {
        // Can we create an object of an interface? Boilerplate Code [Default]
        Payment p = new Payment(){

          public void pay(){
              System.out.println("Payment done via Credit Card. 💳");
          }
        };
        p.pay();
        // JavaScript MOCHA ECMA Java [Scala Code] Java 8 -> One Liners
        Payment p1 = () -> System.out.println("Payment done via Scala Card. 💳");
        p1.pay();
    }
}
