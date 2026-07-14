
public class Movezeroes{
    public static void main(String[] args){
        int[] arr = {0,1,0,3,12};
        int last = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[last];
                arr[last] = temp;
                last++;
                continue;
            }
        }

        for(int x: arr){
            System.out.print(x + " ");
        }
    }
}