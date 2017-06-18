package arrays;

import java.util.Arrays;

/**
 * Created by amatada on 4/10/2017.
 */
public class InsertionSort {
    public int[] list = new int[]{8,7,6,5,4,3,2,1};

    public static void main (String args[]){
        InsertionSort is = new InsertionSort();
        is.sort(is.list);
        System.out.println(Arrays.toString(is.list));
    }

    private void sort(int[] list) {
        for(int i=1;i<list.length;i++)
            for(int j=i;j>0;j--){
                if(list[j-1]>list[j]){
                    int temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                }
                //else
                    //break;
            }
    }
}
