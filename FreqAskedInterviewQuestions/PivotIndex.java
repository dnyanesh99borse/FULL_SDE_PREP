
public class PivotIndex {

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        int totalsum = 0;

        for (int x : arr) {
            totalsum += x;
        }

        int leftsum = 0;

        //find pivot index
        for (int i = 0; i < arr.length; i++) {
            //since, totalsum = leftsum + rightsum + currelement
            int rightsum = totalsum - leftsum - arr[i];

            if (leftsum == rightsum) {
                System.out.println("Pivot index: " + i);
                break;
            }

            leftsum += arr[i];
        }
        System.out.println("Pivot Index = -1");
    }
}
