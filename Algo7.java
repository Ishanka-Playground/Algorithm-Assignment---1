import java.util.Scanner;

public class Algo7 {   
    
    private static final Scanner scanner = new Scanner(System.in);
    //private static final Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {

        do {

            System.out.print( "Enate a sentence :");
            String sentance = scanner.nextLine().trim();
            if (sentance.isBlank()){
                System.out.println( "Invalid Sentence");
                continue;
            }
            char [] sentanceArray = sentance.toCharArray();
            String newWord = " ";
            String newSentence = "";

            String min = sentance;
            String max = "";
            int count = 0;

            for (int i = 0; i < sentanceArray.length; i++) {
                if (sentanceArray[sentanceArray.length-1-i]==' ' ){

                    if ( count > max.length()) max = newWord;
                    if ( count < min.length()) min = newWord;
                    
                    count = 0;
                    newWord = " ";
                    continue;

                };
                newWord =sentanceArray[sentanceArray.length-1-i] + newWord;
                count +=1;

                
            }

            if ( count > max.length()) max = newWord;
            if ( count < min.length()) min = newWord;

            System.out.println(max);
            System.out.println(min);
            
        } while (true);
        
    }
}