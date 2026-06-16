public class MergeSorttoStringArray{
    public static void mergeSort(String[] arr, int si, int ei){
        //Base Case
        if(si >= ei){
            return;
        }

        int mid = si + (ei - si) / 2;

        //merge sort left half
        mergeSort(arr, si, mid);
        //merge sort right half
        mergeSort(arr, mid + 1, ei);
        //merge both sorted sides
        merge(arr, si, mid, ei);
    }

    public static void merge(String[] arr, int si, int mid, int ei){
        String[] temp = new String[ei - si + 1];
        //for comparison between two sorted halfs.
        int i = si; //left iterator
        int j = mid + 1; //right iterator
        int k = 0; //temp iterator

        while(i <= mid && j <= ei){
            if(arr[i].compareTo(arr[j]) < 0){
                // temp[k++] = arr[i++]; //compact version
                temp[k] = arr[i];
                k++;
                i++;
            }else{
                // temp[k++] = arr[j++]; //compact version
                temp[k] = arr[j];
                k++;
                j++;
            }
        }
        //For remaining LEFT elements
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        //For remaining RIGHT elements
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //copy Temp ---> original array
        for(i = si, k = 0; i < temp.length; i++, k++){
            arr[i] = temp[k];
        }
    }

    public static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main (String[] args){
        String[] arr = {"sun","earth","mars","mercury"};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}