import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sigFigs = 0;
        String numberString;
        float number;

        Scanner numberScanner = new Scanner(System.in);

        numberString = numberScanner.nextLine();
        try{
            number = Float.parseFloat(numberString); //Check to make sure it can find a number
        }
        catch(Exception e){
            //If not tell them to restart program
            System.out.println("That's not a valid Number. \nPlease restart the program");
        }

        //Start to count SigFigs
        char[] chrArray = numberString.toCharArray();

        boolean isTrailingZero = true;
        for (char currentCharacter : chrArray) {
            //ignore trailing zeros
            if (isTrailingZero) {
                if (currentCharacter != '0') {
                    isTrailingZero = false;
                } else {
                    continue;
                }
            }

            if (currentCharacter == '.'){
                continue; //ignore the decimal point
            }

            sigFigs++;
        }

        System.out.println(sigFigs);
    }
}
