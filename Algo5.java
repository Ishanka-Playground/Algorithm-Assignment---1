import java.util.Arrays;
import java.util.Scanner;

public class Algo5 {

    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        do {
            System.out.print("Enter a text: ");
            String text = scanner.nextLine(); 
            if ( text.isBlank()) {
                System.out.println("Invalid Text");
                continue;
            }
            char[] textArray = text.toCharArray();
            String newText ="";

            for (int i = 0; i < textArray.length; i++) {
                newText += textArray[textArray.length-1-i];
                
            }
            System.out.println(newText);
            // String arryString = Arrays.toString(textArray);
            // System.out.println(arryString);


        } while (true);









        
    }
}
