public class countTarget{
    public static int countTarget(int[][] arr, int target) {
    int count = 0;

    for(int i = 0; i < arr.length; i++) {
        for(int j = 0; j < arr[0].length; j++) {
            if(arr[i][j] == target) {
                count++;
            }
        }
    }

    return count;
}
    public static void main(String[] args){
        // int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        // int[][] arr = {{-1,3}};

        int[][] arr = { 
            {4,7,8},{8,8,7}
        };
        int target = 7;
        System.out.println(countTarget(arr,target));
    }
}