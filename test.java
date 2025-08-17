import java.util.*;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {2,4,6,7};
        int[] b = {5,10,20,30};
        int m = a.length;
        int n = b.length;
        int[] c = new int[m + n];
        int i=0, j=0, k=0;

        // Merge until one array ends
        while(i < m && j < n){
            if(a[i] <= b[j]){
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of a
        while(i < m){
            c[k] = a[i];
            i++;
            k++;
        }

        // Copy remaining elements of b
        while(j < n){
            c[k] = b[j];
            j++;
            k++;
        }

        // Print merged array
        for(int ele : c){
            System.out.print(ele + " ");
        }
    }
}
