
public class Algo8_2 {
    public static void main(String[] args) {


        int[] numA = {5, 7, -2, 3, 4, 6, 7};
        int[] numB = {7, 8, -8, 2, 1, -9, 6,5};

// numA U numB

        System.out.print("numA ^ numB : ");

        String word = "";
        loop:
        for (int i = 0; i < numA.length; i++) {

            // if (word.contains(""+numA[i])) {
            //             continue loop;
            // } else {
            //             word+=(""+numA[i]+",");
            //             continue loop;
            // }

            for (int j = 0; j < numB.length; j++) {

                if (word.contains(""+numA[j])) {
                continue loop;
                } else {
                        word+=(""+numA[j]+",");
                        continue loop;
                }
                if (numA [i] == numB[j]){
                    if (word.contains(""+numA[i])) {
                        continue loop;
                    } else {
                        word+=(""+numA[i]+",");
                        continue loop;
                    }

                        
                }
                

            }
            
            
        }
        System.out.println(word + "\b ");
    
    }
    
}



