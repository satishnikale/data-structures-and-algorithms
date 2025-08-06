
import java.util.HashMap;

public class SingleAmongDoubles {
    public static void Brute(int arr[]) {
        // For every element present in the array, we will do a linear search and
        // count the occurrence. If for any element, the occurrence is 1, we will return
        // it.
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count += 1;
                }
            }
            if (count == 1) {
                System.out.println(arr[i]);
            }
        }
    }
    // Using map data structure where we store freq of numbers

    public static int betterApproach(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<>();
        // store freq of elements
        for (int i = 0; i < arr.length; i++) {
            int value = map.getOrDefault(arr[i], 0);
            map.put(arr[i], value + 1);
        }
        // get the value which has freq 1
        for (HashMap.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }
        return -1;
    }
    // optimal approach usig - XOR opearation

    public static int optimalApproach(int arr[]){
        int xor = 0;
        for(int i = 0; i < arr.length; i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 5, 5 };
        // Brute(arr);
        // System.out.println(betterApproach(arr));
        System.out.println(optimalApproach(arr));
    }
}
