package ie.atu;
import java.util.Scanner;
public class UsingTryCatch {
    public static void main(String[] args){
        System.out.println("Please enter a number between 0 - 9:");
        Scanner myscan = new Scanner(System.in);

        //read user input as a sting
        String input = myscan.nextLine();

        //Parse the input to an integer
        int muNum= Integer.parseInt(Input);

        //check if the number is between 0 and 9
        if (myNum>= 0 && myNum<=9){
            System.out.printLn("You entered " + myNum);
        }
        else{
            System.out.println("Not a valid number");
        }
    }
}
