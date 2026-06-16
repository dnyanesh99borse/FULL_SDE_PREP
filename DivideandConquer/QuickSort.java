
public class QuickSort{
    public static void QuickSort(int[] arr, int si, int ei){
        //Base Case
        if(si >= ei){
            return;
        }
        //pivot index, will return the new updated pivot value each time.
        int pIdx = partition(arr, si, ei);
        
        QuickSort(arr, si, pIdx - 1); //left part
        QuickSort(arr, pIdx + 1, ei); //right part
    }

    public static int partition(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int i = si - 1; //to make place for the elements smaller than pivot.(jagah banana)
        
        //here j should start from j = si cause when the pivot will be 5 in second iteration.. then for the second half 
        //of quick sort the starting index will be pIdx + 1.. which we are doing beforehand.. but that value is carrying by the si variable.. thus..
        for(int j = si; j < ei; j++){
            //move smaller elements towards right
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        //place pivot by swapping pivot element on it correct position
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {6,3,9,8,2,5};
        QuickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}