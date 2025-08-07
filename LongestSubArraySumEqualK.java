import java.util.HashMap;
import java.util.Map;

public class LongestSubArraySumEqualK {
    public static int Brute(int arr[], int k) {
        int longestSubArray = 0;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i + 1; j < arr.length; j++) {
                currSum = 0;
                int end = j;
                for (int m = start; m <= end; m++) {
                    currSum += arr[m];
                }
                if (currSum == k) {
                    longestSubArray = Math.max(longestSubArray, (end - start + 1));
                }
            }

        }
        return longestSubArray;
    }
    // second approach is calculationg prefix sum using extra array
    // Time : N^2
    // Space : O(N)

    // Third approach is use hashMap to store freq
    // Time Complexity: O(N) or O(N*logN) depending on which map data structure we are using, where N = size of the array.
    // Space Complexity: O(N) as we are using a map data structure.

    public static int getLongestSubarray(int []a, int k) {
        int n = a.length; // size of the array.

        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            //calculate the prefix sum till index i:
            sum += a[i];

            // if the sum = k, update the maxLen:
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // calculate the sum of remaining part i.e. x-k:
            int rem = sum - k;

            //Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            //Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }


    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 7, 1, -10 };
        int k = 15;
        // System.out.println(Brute(arr, k));
        System.err.println(getLongestSubarray(arr, k));
    }
}
