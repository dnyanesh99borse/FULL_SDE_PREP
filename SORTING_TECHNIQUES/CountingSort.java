//------WHILE ALL THE ELEMENTS OF THE ARRAY WILL BE POSITIVE------------------
//-------negative handle differently.... 
//but it is mostly used in positve array or small size.

public class CountingSort{
    public static void CountingSort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int x : arr){
            largest = Math.max(largest, x);
        }

        int[] count = new int[largest + 1]; //cause we are counting from 0 t0 7.

        for(int i=0; i < arr.length; i++){
                count[arr[i]]++;
        }
        //sorting
        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        for(int x : arr){
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args){
        int[] arr = {1,4,1,3,2,4,3,7};
        CountingSort(arr);
    }
}