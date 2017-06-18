package arrays;

import java.util.Arrays;

/**
 * Created by amatada on 4/10/2017.
 */
public class MergeSort {

    public int[] list = new int[]{4,3,2,1};

    public static void main (String args[]){
        MergeSort ms = new MergeSort();
        ms.sort(ms.list);
    }

    private void sort(int[] list) {
        int backup[] = new int[list.length];
        sort(list, backup, 0, list.length);
        System.out.println(Arrays.toString(list));
    }

    private void sort(int[] list, int[] backup, int low, int high) {

        if(high - low <=1) return;

        int mid = low + (high - low)/2;
        sort(list, backup, low, mid);
        sort(list, backup, mid, high);

        merge(list, backup, low, mid, high);
    }

    private void merge(int[] list, int[] backup, int low, int mid, int high) {

        int i=low, j=mid;

        for(int k=low; k < high; k++){
            if(i==mid) backup[k] = list[j++];
            else if(j==high) backup[k] = list[i++];
            else if(list[j]<list[i]) backup[k] = list[j++];
            else backup[k] = list[i++];
        }

        // copy back
        for (int k = low; k < high; k++)
            list[k] = backup[k];
    }
}
