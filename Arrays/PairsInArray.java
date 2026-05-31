public class PairsInArray{

    public static void PairsInArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n - 1; i++){
            for(int j = i+1; j <= n -1; j++){
                System.out.print("{"+arr[i]+", "+arr[j]+"}"+" , ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {2,4,6,8};
        PairsInArray(arr);
    }
}