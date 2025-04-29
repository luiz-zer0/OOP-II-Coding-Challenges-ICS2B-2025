package challenges;
public class variables {
    void calculateInterest(){
        double amount, rate, time, interest;
        
        amount = 1000; 
        rate = 5; 
        time = 2; 

        interest = (amount * rate * time) / 100;
        amount = amount + interest;
        System.out.println("The simple interest is: " + interest);
        System.out.println("Your total amount after interest is: " + amount);

    }
    public static void main(String[] args) {
        variables obj = new variables();
        obj.calculateInterest();
        
       
        
    }
}
