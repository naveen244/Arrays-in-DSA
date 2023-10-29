import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // If we have seen the current element before
            // It means we have already encountered the other number of the pair
            if (map.containsKey(nums[i])) {
                // Index of the current element
                result[0] = i;
                // Index of the other element of the pair
                result[1] = map.get(nums[i]);
            }
            // If we have not seen the current before
            // It means we have not yet encountered any number of the pair
            else {
                // Save the difference of the target and the current element
                // with the index of the current element
                map.put(target - nums[i], i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,4,2,5,21,5};
        System.out.println("enter the sum: ");
        int target=sc.nextInt();
        int[] num=twoSum(arr,target);
        System.out.println("["+num[0]+","+num[1]+"]");











    }
}