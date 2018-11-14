public class MergeSort extends Merge {
    public static int[] mergesort(int[] arr) {
        if (arr == null) {
            return null;
        }
        if (arr.length == 0) {
            return new int[0];
        }
        //this one is important base case
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] fir = mergesort(copyOfRange(arr, 0, mid));
        int[] sec = mergesort(copyOfRange(arr, mid, arr.length));
        return merge(fir, sec);
    }
    
    //merge, give two pointers i, j pointing two two arrays, move the pointer
}
