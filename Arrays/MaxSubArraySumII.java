public class MaxSubArraySumII{
    public static void MaxSubArrayPrefix(int[] arr){
        int n = arr.length;
        int sum;
        int ans = Integer.MIN_VALUE; //cause we have to compare
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                //cause when the i will be 0 then it can't go more back.. thus.. for i == 0; directly.. prefix[j] end.
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                ans = Math.max(ans,sum);
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args){
        int[] arr = {2,4,6,8};
        MaxSubArrayPrefix(arr);
    }
}