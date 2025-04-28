package challenges;
import java.util.Scanner;
// This program asks for your name and greets you with a message

public class greetings {
    
    void salutation(){
        
        System.out.println("Wassupp!!!");
       
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
         String name=sc.nextLine();
         greetings obj = new greetings();
        obj.salutation();
        
         System.out.println("How are you doing"+" "+name+"?");

        
    }
}
