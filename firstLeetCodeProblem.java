
//package javaapplication2;
import java.util.*;

public class firstLeetCodeProblem {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5};
        for(int i : numbers){
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.print("Enter your target: ");
        int target = s.nextInt();
        int pointers[] = twoSum(numbers, target);
        if(pointers[0] == 0 && pointers[1] == 0){
            System.out.println("Not found");
            return;
        }
        for(int j : pointers){
            System.out.print(j+" ");
        }
        System.out.println("");
    }
    
    private static int[] twoSum(int[] nums, int target) {
        int[] indicies = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if((nums[i] + nums[j]) == target){
                    indicies[0] = i;
                    indicies[1] = j;
                }
            }
        }
        return indicies;
    }
}
