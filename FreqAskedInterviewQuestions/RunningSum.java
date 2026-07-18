public class RunningSum{
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int sum = arr[0];

        for(int i=1; i<arr.length; i++){
            sum += arr[i];
            arr[i] = sum;
            System.out.println(arr[i]);
        }
    }
}