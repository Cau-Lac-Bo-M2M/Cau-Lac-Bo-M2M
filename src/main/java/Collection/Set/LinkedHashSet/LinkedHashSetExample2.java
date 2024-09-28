package Collection.Set.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetExample2 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(5);
        set.add(5);
        set.add(3);
        set.add(7);
        set.add(6);
        set.add(2);
        System.out.println("LinkedHashSet: ");
        for(int i : set){
            System.out.print(i + " ");
        }
        System.out.println();

        LinkedHashSet<Integer> set2 = new LinkedHashSet();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter element: ");
        int number = scanner.nextInt();
        for(int i = 0; i < number; i++){
           set2.add(scanner.nextInt());
        }
        for(int i : set2){
            System.out.println(i+"");
        }
    }
}

