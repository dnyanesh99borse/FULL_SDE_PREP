class Inversion {

    private long merge(int[] arr, int si, int mid, int ei) {

        int[] temp = new int[ei - si + 1];

        int i = si;
        int j = mid + 1;
        int k = 0;

        long invCount = 0;

        while (i <= mid && j <= ei) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {

                // Inversion found
                invCount += (mid - i + 1);

                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy back to original array
        for (int p = 0; p < temp.length; p++) {
            arr[si + p] = temp[p];
        }

        return invCount;
    }

    private long mergeSort(int[] arr, int si, int ei) {

        if (si >= ei) {
            return 0;
        }

        int mid = si + (ei - si) / 2;

        long leftInv = mergeSort(arr, si, mid);
        long rightInv = mergeSort(arr, mid + 1, ei);

        long mergeInv = merge(arr, si, mid, ei);

        return leftInv + rightInv + mergeInv;
    }

    public long inversionCount(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 3, 5};

        Solution obj = new Solution();

        System.out.println(obj.inversionCount(arr));
    }
}