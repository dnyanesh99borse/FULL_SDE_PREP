public class SubArrays{
    public static void SubArrays(int[] arr){
        int n = arr.length;
        int totalsa = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+ " ");
                }
                totalsa++;
                System.out.println();
            }
            System.out.println();
        }
            System.out.println("total SubArrays are: "+totalsa);
    }

    public static void main(String[] args){
        // int[] arr = {1,2,3};
        int[] arr = {2,4,6,8,10};
        SubArrays(arr);
    }
}