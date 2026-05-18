package algorithms;
public class LemonadeStand {
    public static boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for(int bill : bills){
            if (bill == 5){
                five++;  // Add a five rupee to the account
            }else if(bill == 10){
                if(five == 0) return false;
                five--; // Subtract a five rupee from account
                ten++; // Add a ten rupee to the account
            }else{
                if(ten > 0 && five > 0){ // Greedy Algorithm
                    ten--;
                    five--;
                }else if(five >= 3){
                    five -= 3;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] bills1 = {5,5,5,10,20};
        int[] bills2 = {5,5,10,10,20};
        System.out.println(lemonadeChange(bills1));
        System.out.println(lemonadeChange(bills2));
    }
}
