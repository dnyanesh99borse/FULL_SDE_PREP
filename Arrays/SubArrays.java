//TIME COMPLEXITY OF THE BELOW CODE WILL BE O(n^3).

// public class SubArrays{
//     public static void SubArrays(int[] arr){
//         int n = arr.length;
//         int totalsa = 0;
//         for(int i = 0; i < n; i++){
//             for(int j = i; j < n; j++){
//                 for(int k=i; k<=j; k++){
//                     System.out.print(arr[k]+ " ");
//                 }
//                 totalsa++;
//                 System.out.println();
//             }
//             System.out.println();
//         }
//             System.out.println("total SubArrays are: "+totalsa);
//     }

//     public static void main(String[] args){
//         // int[] arr = {1,2,3};
//         int[] arr = {2,4,6,8,10};
//         SubArrays(arr);
//     }
// }



//---------IT CAN BE OPTIMIZED USING KADANE'S ALGORITHM-----------

//SIMPLY  WHAT WE ARE DOING.. AS USING KADANE'S ALGO WE WERE ESPECIALLY FINDING THE MAXIMUM SUBARRAY SUM
//SO WE WERE ABLE TO TRACK THE RANGE OF ELEMENTS DUE TO WHICH THE OUTPUT WAS GETTING THE MAXIMUM SUBARRAY SUM..
//SO JUST TRACK ON THE START AND END OF THAT RANGE AND PRINT IT .. THAT IS YOUR ACTUAL MAXIMUM SUM SUBARRAY.
public class SubArrays{
    public static void kadaneWithSubarray(int[] nums){

    int cs = nums[0];
    int ms = nums[0];

    int start = 0;
    int end = 0;
    int tempStart = 0;

    for(int i = 1; i < nums.length; i++){

        if(nums[i] > cs + nums[i]){
            cs = nums[i];
            tempStart = i;
        }else{
            cs = cs + nums[i];
        }

        if(cs > ms){
            ms = cs;
            start = tempStart;
            end = i;
        }
    }

    System.out.println("Maximum Sum = " + ms);

    System.out.print("Subarray: ");

    for(int i = start; i <= end; i++){
        System.out.print(nums[i] + " ");
    }
}

    public static void main(String[] args){
        // int[] arr = {1,2,3};
        int[] arr = {2,4,6,8,10};
        kadaneWithSubarray(arr);
    }
}