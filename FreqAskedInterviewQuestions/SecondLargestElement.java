// public class SecondLargestElement{
//     public static void main(String[] args){
//         int[] arr = {1,2,3,4,5,6};
//         int max = Integer.MIN_VALUE;
//         int secmax = max;

//         for(int i=0; i<arr.length; i++){
//             if(arr[i] > max){
//                 secmax = max;
//                 max = arr[i];
//             }
//         }
//         System.out.println("Second largest: " + secmax);
//     }
// }

//==========================SECOND SMALLEST============================
public class SecondLargestElement{
    public static void main(String[] args){
        // int[] arr = {13,22,-1,3,4,-2,6};
        int[] arr = {1,2,3,4,5,6,7};
        int min = Integer.MAX_VALUE;
        int secmin = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                secmin = min;
                min = arr[i];
            }
        }
        if(secmin == Integer.MAX_VALUE){
            System.out.println(arr[1]);
        }else{
            System.out.println("second smallest: " + secmin);
        }
    }
}
