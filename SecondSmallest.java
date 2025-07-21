
import java.util.Arrays;

public class SecondSmallest {
    public static void secondSmallestBrute(int arr[]){
        Arrays.sort(arr);
        System.out.println("Second smallest is : " + arr[1]);
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        secondSmallestBrute(arr);
    }
}
