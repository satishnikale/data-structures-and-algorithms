
import java.util.ArrayList;

public class IntersectionArray {
    public static void intersectionBrute(int arr1[], int arr2[]) {
        ArrayList<Integer> intersection = new ArrayList<>();
        int vis[] = new int[arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && vis[j] == 0) {
                    intersection.add(arr1[i]);
                    vis[j] = 1;
                    break;
                }
                if (arr2[j] > arr1[i]) {
                    break;
                }
            }
        }
        for (int i : intersection) {
            System.out.print(i + " ");
        }
    }

    public static void intersectionOptimised(int a[], int b[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;
            } else if(b[j] < a[i]) {
                j++;
            } else {
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        for (Integer integer : ans) {
            System.out.print(integer + " ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 2, 3, 3, 4, 5, 6 };
        int arr2[] = { 2, 3, 3, 5, 6, 6, 7 };

        intersectionOptimised(arr1, arr2);
    }
}
