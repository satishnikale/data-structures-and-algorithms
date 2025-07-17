
public class SecondLargest {
    // In this fucntion we are calculating the largest element and finding
    // just smaller than largest so we will get desired secondLargest. O(N+N) => 2N
    public static void secondLargest(int arr[]) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("Largest element is : " + max);
        System.out.println("Second Largest element is : " + secondMax);
    }

    // This function is more cleaner and optimal compare to above function
    public static void secondLargestOptimal(int arr[]) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("Largest is : " + max);
        System.out.println("Second largest is : " + secondMax);
    }

    public static void main(String[] args) {
        int arr[] = { -1, 2, 3, -4, 5, 6, -7 };
        secondLargestOptimal(arr);
    }
}
