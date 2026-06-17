//------------------USING THIS APPROACH NOT ALL THE CASES WILL GET PASSED-------------------

// public class LC11ContainerMostWater{

//     public static int ContainerwithMostWater(int[] arr){
//         int start = 0;
//         int end = arr.length - 1;
//         int left = arr[start];
//         int right = arr[end];
//         int ans = 0; int lidx = start; int ridx = end;

//     // Left side
//     while (start < arr.length - 1) {
//         if (arr[start + 1] > left) {
//             left = arr[start + 1];
//             lidx = start + 1;
//             start++;
//         } else {
//             break;
//         }
//     }

//     // Right side
//     while (end > 0) {
//         if (arr[end - 1] > right) {
//             right = arr[end - 1];
//             ridx = end - 1;
//             end--;
//         } else {
//             break;
//         } 
//     }

//     //   System.out.println("Left = " + left + " " + lidx);
//     //   System.out.println("Right = " + right + " " + ridx);

//       ans = (Math.min(left, right)) * (ridx - lidx);

//     //   System.out.println(ans);
//     return ans;
//     }
//     public static void main(String[] args){
//         int[] arr = {1,8,6,2,5,4,8,3,7};
//         System.out.println(ContainerwithMostWater(arr));
//         // ContainerwithMostWater(arr);
//     }
// }


//--------------------approach two (BRUTE FORCE)---------------------------
// public class LC11ContainerMostWater{
//     public static int ContainerwithMostWater(int[] arr){
//         int max = Integer.MIN_VALUE;
//         int height = 0; int width = 0; int water = 0;

//         for(int i = 0; i < arr.length; i++){
//             for(int j = i+1; j < arr.length; j++){
//                 height = Math.min(arr[i] , arr[j]);
//                 width = j - i;
//                 water = height * width;

//                 max = Math.max(max, water);
//             }
//         }
//         return max;
//     }
//     public static void main(String[] args){
//         int[] arr = {1,8,6,2,5,4,8,3,7};
//         System.out.println(ContainerwithMostWater(arr));
//         // ContainerwithMostWater(arr);
//     }
// }

//------------------optimal approach (TWO POINTERS)--------------
public class LC11ContainerMostWater{
    public static int ContainerwithMostWater(int[] height){
        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;

        while(left < right){
            int currentHeight = Math.min(height[left] , height[right]);
            int currentWidth = right - left;

            int Area = currentHeight * currentWidth;
            maxArea = Math.max(maxArea, Area);
            //move the smaller height;
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(ContainerwithMostWater(height));
        // ContainerwithMostWater(arr);
    }
}