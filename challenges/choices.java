package challenges;
import java.util.Scanner;


public class choices {
    //the program asks your age and it determines if you are a minor or an adult
    void checkAge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        
        if (age < 18) {
            System.out.println("You are a minor.");
        } else {
            System.out.println("You are an adult.");
        }

    }
    public static void main(String[] args) {
        choices obj = new choices();
        obj.checkAge();
           
    }
    
    
}
