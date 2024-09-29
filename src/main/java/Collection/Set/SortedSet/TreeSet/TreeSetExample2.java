package Collection.Set.SortedSet.TreeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter element: ");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            treeSet.add(scanner.nextInt());
        }
        System.out.println("Tree Set: ");
//        treeSet.pollFirst(); //trả về và xoá phần tử đầu
//        treeSet.pollLast(); //trả về và xoá phần tử cuối
        for (int i : treeSet) {
            System.out.print(i + " ");
        }
        System.out.print("\nMin: "+treeSet.first());                        //phần tử nhỏ nhất
        System.out.print("\nMax: "+treeSet.last());                         //phần tử lớn nhất
        System.out.print("\nHigher: "+treeSet.higher(5));               //phần tử nhỏ nhất > 5
        System.out.print("\nLower: "+treeSet.lower(5));                 //phần tử lớn nhất < 5
        System.out.print("\nCeiling: "+treeSet.ceiling(5));             //phần tử nhỏ nhất >= 5
        System.out.print("\nFloor: "+treeSet.floor(5));                 //phần tử lớn nhất <= 5
        System.out.print("\nHead Set: "+treeSet.headSet(5));      //các phần tử < 5
        System.out.print("\nTail Set: "+treeSet.tailSet(5));
    }
}

