import java.util.Scanner;
import java.util.Random;
public class guess_game {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Random rndm =new Random();
        int yguess=-1;
        int myguess = rndm.nextInt(1,10);
       while( yguess !=  myguess)
        {System.out.println("guess my number");
        yguess = scan.nextInt();
        if(yguess < myguess)
        {
            System.out.println(" Is greater than you think");
        }
        else if (yguess > myguess)
        {
            System.out.println("Is smaller than you think");
        }
        else{
            System.out.println("well you guessed");
            System.out.println("My guess is " + myguess);
        }
    }
    }
}