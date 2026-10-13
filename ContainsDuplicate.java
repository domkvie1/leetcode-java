import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    boolean run = true;
    while(run){
    System.out.println("How many numbers will be in your array?");
    int size = sc.nextInt();
    int[] nums = new int[size];
    for(int i = 0; i < size; i++){
        nums[i] = sc.nextInt();
    }
    System.out.println(containsDuplicate(nums));
    System.out.println("Would you like to go again? (yes/no)");
    String again = sc.next();
    if(again.equals("no")) run = false;
}
    System.out.println("Have a good day:)");
}

public static boolean containsDuplicate(int[] nums){
    Set<Integer> seen = new HashSet<>();
    for(int i = 0; i< nums.length; i++){
        if(seen.contains(nums[i])){
            return true;
        }
        seen.add(nums[i]);
    }
    return false;
}


public static boolean containsDuplicate(int[] nums){
    for(int i = 0; i< nums.length-1; i++){
        int num1 = nums[i];
        for(int j = i+1; j<nums.length; j++){
            int num2 = nums[j];
            if(num1 == num2){
                return true;
            }
        }
    }
    return false;
}
}
