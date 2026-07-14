public class LinearSearch{
    public static int search(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {10, 25, 7, 40, 18};
        int target = 7;
        System.out.println(search(arr,target));
    }
}