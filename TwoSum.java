
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    // Brute Force : Using two for loops
    // Time : O(N^2)
    // Space : O(1)

    // Better : Sorting and Two Pointer
    // Time : O(N * log N), Space : O(1)
    public static boolean better(int arr[], int target){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;

        while(start < end ){
            if(arr[start] + arr[end] == target){
                return true;
            }
            if(arr[start] + arr[end] > target){
                end--;
            } else {
                start++;
            }
        }
        return false;
    }

    // Optimal : Using HashMap data structure
    // Time : O(N), Space : O(N)

    public static boolean Optimal(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int moreNeeded = target - num;

            if (map.containsKey(moreNeeded)) {
                return true;
            }
            map.put(arr[i], i);
        }

        return false;

    }

    public static void main(String[] args) {
        int arr[] = { 0, -1, 2, -3, 1 };
        int target = 2;
        // System.out.println(Optimal(arr, target));
        System.out.println(better(arr, target));

    }
}
