public class trycatch{
    
    public static void main(String[] args) {
        int num1=250;
        int num2=0;

        try {
            int answer=num1/num2;
            System.out.println("Result: "+answer);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero isnt allowed");
        }
        finally{
            System.out.println("Program continues after handling the exception");
        }
    }
}