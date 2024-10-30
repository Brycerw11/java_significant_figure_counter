import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);

        String number = numberScanner.nextLine();
        try{
            Float.parseFloat(number); //Check to make sure it can find a number
        }
        catch(Exception e){
            //If not tell them to restart program
            System.out.println("That's not a valid Number. \nPlease restart the program");
        }

        System.out.println(number);

        for (int i = 1; i <= number.length(); i++){
            if (i != number.length()){
                if(Objects.equals(number.substring(i, (i + 1)), ".")){
                    System.out.println("Contains .");
                }
            }
        }
    }
}
