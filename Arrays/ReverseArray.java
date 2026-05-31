public class ReverseArray{
    public static void ReverseArray(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int x : arr){
            System.out.print(x + ", ");
        }
    }
    public static void main(String[] args){
        // int[] arr = {1,2,3,4,5};
        int[] arr = {-1,-2,3009,4,0};
        ReverseArray(arr);
    }
}