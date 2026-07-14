
//RIGHT ROTATION (LC 189)
public class RotateArrayByK{
    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        int n = arr.length;
        k = k%n;

        //step1: reverse the whole array
        reverse(arr, 0, n-1);

        //step2: reverse first half till last k elements
        reverse(arr, 0, k-1);
        //step3: reverse second half till n
        reverse(arr, k, n-1);

        for(int x: arr){
            System.out.print(x + " ");
        }
    }
}

// ---------LEFT ROTATION------
