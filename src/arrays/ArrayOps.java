package arrays;

import java.util.Arrays;

/**
 * Created by amatada on 4/6/2017.
 */
public class ArrayOps {

    public int[] list1 = new int[]{1,2,3,5,6,7,0};
    public int[] list2 = new int[]{1,2,3,4,5,7,0};
    public int[] list3 = new int[]{2,4,6,8,10,12,14};
    public int[] list4 = new int[]{1,2,3,4,5,7};
    public int[] list5 = new int[]{1,2,3,5,6,7,0};

    public static void main(String args[]){
        ArrayOps ops = new ArrayOps();
        System.out.println(ops.findInsertSpotSeq(4, ops.list1));
        System.out.println(ops.findInsertSpotSeq(6, ops.list2));
        ops.insertAndMove(ops.findInsertSpotSeq(4, ops.list1),ops.list1,4);
        ops.insertAndMove(ops.findInsertSpotSeq(6, ops.list2),ops.list2,6);
        System.out.println(Arrays.toString(ops.list1));
        System.out.println(Arrays.toString(ops.list2));
        System.out.println(ops.binarySearch(7, ops.list3));
        System.out.println(ops.binarySearch(6, ops.list4));
        System.out.println(Arrays.toString(ops.list5));
        ops.insertionSort(ops.list5);
        System.out.println(Arrays.toString(ops.list5));
    }

    public int findInsertSpotSeq(int num, int list[]) {
        int i;
        for (i = 0; i < list.length; i++) {
            if (list[i] > num)
                break;
        }
        return i;
    }

    public void insertAndMove(int pos, int[] list, int num){
        int temp = 0;
        for(int i=pos;i<list.length;i++){
            temp = list[i];
            list[i] = num;
            num = temp;
        }
    }

    public int binarySearch(int num, int list[]){

        return binarySearch(num, list, 0,list.length-1);
    }

    public int binarySearch(int num, int list[],int low, int high){

        int mid = (low + high)/2;
        if(mid == low || mid == high)
            return mid;

        if (num > list[mid])
             return binarySearch(num, list, mid, high);
        else
             return binarySearch(num, list, low, mid);


    }

    public void insertionSort(int list[]){

        for(int i=1;i<list.length;i++)
            for(int j=i;j>0;j--){
                if(list[j-1]>list[j]){
                    int temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                }
                else
                    break;
            }
    }
}
