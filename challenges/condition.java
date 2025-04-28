package challenges;
public class condition {
    //using traffic light to determine colour of light using while loop changing it after every 10 seconds
    public static void main(String[] args) throws InterruptedException {
        String light = "red";
        while (true) {
            if (light.equals("red")) {
                System.out.println("Stop!");
                light = "green";
            } else if (light.equals("green")) {
                System.out.println("Go!");
                light = "yellow";
            } else if (light.equals("yellow")) {
                System.out.println("Slow down!");
                light = "red";
            }
            Thread.sleep(10000); 
            //this one pauses the colour for 10 seconds 
        }
    }
}
