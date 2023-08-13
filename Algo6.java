import java.util.Scanner;

public class Algo6 {
    private static final Scanner scanner = new Scanner(System.in);
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

            for (int i = 0; i < sentanceArray.length; i++) {
                if (sentanceArray[sentanceArray.length-1-i]==' ' ){
                    
                    newSentence += newWord;
                    newWord = " ";
                    continue;

                };
                newWord =sentanceArray[sentanceArray.length-1-i] + newWord;
                
                
            }

            System.out.println(newSentence+ newWord);
            
        } while (true);
        
    }
}
