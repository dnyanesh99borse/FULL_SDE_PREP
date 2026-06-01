public class SelectionSort{
    public static void SelectionSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            int minpos = i;
            for(int j = i + 1; j < n; j++){
            if(arr[j] < arr[minpos]){
                minpos = j;
            }
           }
           //swap here to avoid frequent swapping.
           int temp = arr[i];
           arr[i] =  arr[minpos];
           arr[minpos] = temp;
        }
        
        for(int x : arr) System.out.print(x + " ");
    }

    public static void main(String[] args){
        int[] arr = {5,4,1,3,2};
        SelectionSort(arr);
    }
}