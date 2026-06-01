//----------BRUTE FORCE APPROACH BUT EXCEEDING TIME FOR LARGE SIZE ARRAY-----------------------
// public class LeetCode121BuyandSellStock{
//     public static int BuyandSellStock(int[] arr){
//         int maxprofit = 0;
//         int n = arr.length; 
//         for(int i=0; i < n; i++){
//             for(int j = i + 1; j < n; j++){
//                 maxprofit = Math.max(maxprofit , (arr[j] - arr[i]));
//             }
//         }
//         return maxprofit;
//     }

//     public static void main(String[] args){
//         int[] arr = {7,1,5,3,6,4};
//         // int[] arr = {7,6,4,3,1};
//         System.out.println(BuyandSellStock(arr));
//     }
// }



//----------------OPTIMAL APPROACH-------------------------

public class LeetCode121BuyandSellStock{
    public static int BuyandSellStock(int[] arr){
        int maxprofit = 0;
        int minprice = arr[0];
        int n = arr.length; 
        for(int i=0; i < n; i++){
            minprice = Math.min(minprice, arr[i]);
            maxprofit = Math.max(maxprofit, (arr[i] - minprice));
        }
        return maxprofit;
    }

    public static void main(String[] args){
        // int[] arr = {7,1,5,3,6,4};
        int[] arr = {7,6,4,3,1};
        System.out.println(BuyandSellStock(arr));
    }
}