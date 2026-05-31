
public class TrappingRainWater {

    public static void TrappingRainWater(int[] arr) {

        int n = arr.length;
        //the final output or the units of trapping water.
        int units = 0;

        //iterator for the while loop
        int i = 0;

        //from 0 t0 last element of the array;
        while (i < n - 1) {

            //firt bar all the further steps will gonna clear from this.
            //initially the b1 is 1st element;
            int b1 = arr[i];
            //for now we are storing the empty value as -1 in b2.
            int b2 = -1;
            //same for the b2Index.
            int b2Index = -1;

            //move to the first valid bar directly.
            if (b1 == 0) {
                i++;
                continue;
            }

            // Find first building/bar >= b1 to make it  b2 so that we can perform operation in bet. them.
            for (int j = i + 1; j < n; j++) {
                //upcoming bar should be either > or == to b1. then store it in b2 variables.
                if (arr[j] >= b1) {
                    b2 = arr[j];
                    b2Index = j;
                    break;
                }
            }

            // If not found, take tallest on right
            //it b2 is still unchanged..
            if (b2Index == -1) {

                for (int j = i + 1; j < n; j++) {

                    if (arr[j] > b2) {
                        b2 = arr[j];
                        b2Index = j;
                    }
                }
            }

            if (b2Index == -1) {
                break;
            }

            int count = 0;
            int sum = 0;
            //k loop for getting the total units in between bar 1 and bar2;
            for (int k = i + 1; k < b2Index; k++) {
                //counting total bars in between b1 and b2.
                count++;
                //counting total current occupied units of the bar.
                sum += arr[k];
            }

            //getting the total units in between b1 and b2.
            units += ((count * Math.min(b1, b2)) - sum);

            //now change the i to the b2Index so that now starting point will be the b2Index and 
            //and same it will look for the b2 and will doing the same operation.. and adding the 
            //upcoming units in the total. and final out of this print the units.
            i = b2Index;
        }

        System.out.println("Total Units = " + units);
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 0, 6, 3, 2, 5};

        TrappingRainWater(arr);
    }
}
