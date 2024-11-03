import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sigFigs = 0;
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

        int dotPos = 0;

        //Find dotPos
        for (int i = 1; i <= number.length(); i++){
            if (i != number.length()){
                if(Objects.equals(number.substring(i, (i + 1)), ".")){
                    System.out.println("Contains .");
                    dotPos = i;
                }
            }
            else {
                dotPos = number.length();
            }
        }

        //Before dot
        boolean startOfSignificance = false;
        //Find dotPos
        for (int i = 1; i < dotPos; i++){
            if (!startOfSignificance){
                if (!Objects.equals(number.substring(i, (i + 1)), "0")){
                    startOfSignificance = true;
                    sigFigs++;
                }
            }
            else {
                sigFigs++;
            }
        }

        System.out.println(sigFigs);

    }
}
