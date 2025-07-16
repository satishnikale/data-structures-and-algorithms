// This program is demonstration of National dutch flag algorithm. 
// it is used to sort the array of 0's, 1's and 2's 
public class DNFA {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void dutchNationalFlagAlgo(int arr[]){
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid <= high){
            if(arr[mid] == 0){
                // swap(arr[low], arr[mid]);
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if(arr[mid] == 1){
                mid++;
            } else {
                // swap(arr[mid], arr[high]);
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0};
        printArray(arr);
        dutchNationalFlagAlgo(arr);
        printArray(arr);
    }
}
