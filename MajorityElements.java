import java.util.HashMap;
import java.util.Map;

class MajorityElements {
    // Moore's Voting algorithm for calculating majority elements
    public static int mooresVotingAlgo(int arr[]) {
        int n = arr.length;
        int count = 0;
        int el = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                el = arr[i];
            } else if (arr[i] == el) {
                count++;
            } else {
                count--;
            }
        }
        int cnt = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] == el) {
                cnt++;
            }
        }
        if (cnt > (n / 2)) {
            return el;
        }
        return -1;
    }

    public static int better(int arr[]) {
        int n = arr.length;
        int majoritySize = (int) Math.floor(n / 2);

        HashMap<Integer, Integer> ans = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int value = ans.getOrDefault(arr[i], 1);
            ans.put(arr[i], value + 1);
        }
        for (Map.Entry<Integer, Integer> it : ans.entrySet()) {
            if (it.getValue() > majoritySize) {
                return it.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
        System.out.println(better(arr));
        System.out.println(mooresVotingAlgo(arr));
    }
}