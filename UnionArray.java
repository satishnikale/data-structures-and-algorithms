import java.util.ArrayList;
import java.util.HashSet;

public class UnionArray {
    public static int[] unionBrute(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : a) {
            set.add(i);
        }
        for (Integer j : b) {
            set.add(j);
        }
        int union[] = new int[set.size()];
        int i = 0;
        for (Integer integer : set) {
            union[i++] = integer;
        }
        return union;

    }

    public static ArrayList<Integer> unionTwoPointer(int a[], int b[]) {
        int n1 = a.length;
        int n2 = b.length;
        int i = 0;
        int j = 0;

        ArrayList<Integer> union = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                if (union.isEmpty() || union.get(union.size() - 2) != a[i]) {
                    union.add(a[i]);
                }
                i++;
            } else {
                if (union.isEmpty() || union.get(union.size() - 2) != b[j]) {
                    union.add(b[j]);
                }
                j++;
            }
        }
        while (i < n1) {
            if (a[i] <= b[j]) {
                if (union.get(union.size() - 2) != a[i]) {
                    union.add(a[i]);
                }
                i++;
            }
        }
        while (j < n2) {
            if (union.get(union.size() - 2) != b[j]) {
                union.add(b[j]);
            }
            j++;
        }
        return union;
    }

    public static void main(String[] args) {
        int[] a = { 1, 1, 2, 3, 4, 5 };
        int[] b = { 2, 3, 4, 4, 5, 6 };

        int[] ans = unionBrute(a, b);
        for (int i : ans) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
