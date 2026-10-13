import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("How many numbers?");
            int n = sc.nextInt();
            int[] nums = new int[n];
            System.out.println("Enter the numbers:");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.println("Enter the target:");
            int target = sc.nextInt();

            System.out.println("Nested loops: " + Arrays.toString(twoSum(nums, target)));
            System.out.println("HashMap:      " + Arrays.toString(twoSumHash(nums, target)));

            System.out.println("Would you like to go again? (yes/no)");
            if (sc.next().equalsIgnoreCase("no")) run = false;
        }
        System.out.println("Have a great day:)");
    }

    // Nested loops
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    // HashMap
    public static int[] twoSumHash(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (seen.containsKey(need)) {
                return new int[]{seen.get(need), i};
            }
            seen.put(nums[i], i);
        }
        return null;
    }
}
