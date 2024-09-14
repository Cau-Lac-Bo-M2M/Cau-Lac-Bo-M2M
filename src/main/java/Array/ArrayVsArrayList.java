package Array;

import java.util.ArrayList;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        int[] array = new int[6];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;
        array[5] = 10;
//        array[6] = 11;
        System.out.print("Array: ");
        for(int i:array){
            System.out.print(" "+ i);
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);
        System.out.println("\nArrayList: "+arrayList);
    }
}
