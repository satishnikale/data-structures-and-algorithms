
import java.util.Arrays;

class MovePositiveEnd {
    // Brute force approach to move negative at start
    static int[] moveBrute(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
    // This is better approach but has unecessary swapping -> O(N)
    static int[] moveBetter(int arr[]){
        int n = arr.length;
        int j = 0;

        for(int i=0; i<n; i++){
            if(arr[i] < 0){
                int temp= arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
    // This is also a better approach using two pointers -> O(N)
    public static int[] moveTwoPointer(int arr[]){
        int n = arr.length-1;
        int start = 0;
        int end = n;

        while(start < end){
            if(arr[start] < 0){
                start++;
            } else if(arr[end] > 0){
                end--;
            } else {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        // int[] ans = moveBrute(arr);
        // int[] ans = moveBetter(arr);
        int[] ans = moveTwoPointer(arr);

        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}