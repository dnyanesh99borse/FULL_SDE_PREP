// --------- BRUTE FORCE APPROACH ----------
// public class RemoveDuplicateSorted {

//     public static void main(String[] args) {

//         int[] arr = {1, 1, 2, 2, 3, 3, 4};

//         int size = arr.length;

//         for (int i = 0; i < size - 1; i++) {

//             if (arr[i] == arr[i + 1]) {

//                 // Shift elements to the left
//                 for (int j = i; j < size - 1; j++) {
//                     arr[j] = arr[j + 1];
//                 }

//                 size--;     // One duplicate removed

//                 i--;        // Check the current index again
//             }
//         }

//         System.out.println("New Length = " + size);

//         System.out.print("Array = ");
//         for (int i = 0; i < size; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


//------------OPTIMAL APPROACH---------------------------
public class RemoveDuplicateSorted {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        int size = arr.length;
        int last = 0;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                int temp = arr[i];
                arr[last] = arr[i];
                arr[i] = temp;
                last++;
            }

            System.out.print("last" + last);
             //last element
            if(i == arr.length-1){
                arr[last] = arr[arr.length-1];
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
