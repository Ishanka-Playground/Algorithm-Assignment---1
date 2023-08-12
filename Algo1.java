import java.util.Scanner;

public class Algo1 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        
        System.out.print("Input the number:");
        int number = scanner.nextInt();
        scanner.nextLine();
        if (number <=0 ){
            System.out.println("Invalid number");
            System.exit(0);
        }
        int preValue1 = 1;
        int preValue2 = 1;
        int value;
    
        do {
            value = preValue1 + preValue2;
            if (value > number) break;
            preValue2= preValue1;
            preValue1 = value;




        } while (true);
        System.out.println(preValue1);

        
    }
}
