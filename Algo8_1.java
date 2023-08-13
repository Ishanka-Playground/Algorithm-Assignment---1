public class Algo8_1 {
    public static void main(String[] args) {


        int[] numA = {5, 7, -2, 3, 4, 6, 7};
        int[] numB = {7, 8, -8, 2, 1, -9, 6,5};

// numA ^ numB

        System.out.print("numA ^ numB : ");

        String word = "";
        loop:
        for (int i = 0; i < numA.length; i++) {
            for (int j = 0; j < numB.length; j++) {
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

