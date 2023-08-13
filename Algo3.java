import java.util.Arrays;

public class Algo3 {
    public static void main(String[] args) {

        int[] nums = { 10, 20, 30, 40, 50 };
        int [] newArray= new int[nums.length];
        for (int i = nums.length-1; i >=0; i--) {
            newArray[nums.length-1-i]= nums[i];
            System.out.print(nums[i]+ " "); 

        }
        nums = newArray;
        System.out.println();
        String arrayString = Arrays.toString(nums);
        System.out.println(arrayString);


    }

}
