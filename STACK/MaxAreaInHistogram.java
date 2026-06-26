import java.util.*;
public class MaxAreaInHistogram{
    public static void maxArea(int[] arr){
        int maxArea = 0;
        Stack<Integer> s = new Stack<>();
        int[] nsr = new int[arr.length];
        int[] nsl = new int[arr.length];

        //next smaller right
        for(int i = arr.length - 1; i >= 0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){  //remove larger elements and stop at first smallest
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        s = new Stack<>();
        //next smaller left
        for(int i = 0; i < arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){  //remove larger elements and stop at first smallest
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //Current Area and then max area
        for(int i = 0; i < arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int area = height * width;
            maxArea = Math.max(maxArea, area);
        }

        System.out.println("Maximum area in histogram is: " + maxArea);
    }
    public static void main(String[] args){
        int[] arr = {2,1,5,6,2,3};

        maxArea(arr);
    }
}