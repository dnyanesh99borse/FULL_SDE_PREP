public class LCSortedandRotated{
    public static void main(String[] args){
        int[] arr = {2,1,3,4};
        int n = arr.length;
        int count = 0;

        for(int i=0; i<arr.length - 1; i++){
            if(arr[i] > arr[(i+1)]){
                count++;
                System.out.println(count);
            }

            if(count > 1){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}