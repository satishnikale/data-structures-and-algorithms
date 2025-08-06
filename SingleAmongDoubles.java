public class SingleAmongDoubles {
    public static void Brute(int arr[]){
    // For every element present in the array, we will do a linear search and
    // count the occurrence. If for any element, the occurrence is 1, we will return it.
    for(int i =0; i<arr.length; i++){
        int num = arr[i];
        int count = 0;

        for(int j=0; j<arr.length; j++){
            if(arr[i] == arr[j]){
                count += 1;
            }
        }
        if(count == 1){
            System.out.println(arr[i]);
        }
    }

    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 5, 5};
        Brute(arr);
    }
}
