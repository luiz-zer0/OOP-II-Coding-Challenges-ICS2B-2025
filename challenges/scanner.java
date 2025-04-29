package challenges;
import java.util.Scanner;
// This program asks for the temperature in Celsius and converts it to Fahrenheit 

public class scanner {
        
        
        void convertTemp(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the temperature in Celsius:");
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        }
        
        public static void main(String[] args) {
            scanner obj = new scanner();
            obj.convertTemp();
            
        }

}
