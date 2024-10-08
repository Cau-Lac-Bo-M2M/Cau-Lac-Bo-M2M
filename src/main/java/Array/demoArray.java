package Array;

import java.util.Arrays;
import java.util.Comparator;

public class demoArray {
    public static void main(String[] args) {
        String food[] = new String[5];
        food[0] = "Pizza";
        food[1] = "Ramen";
        food[2] = "Salad";
        food[3] = "Brioche";
        food[4] = "Coffee";

        String[] beverage = {"Lemonade", "Tea", "Ice blend", "Boba"};

        System.out.println("Food menu: " + food.length);
        System.out.println("Beverage menu: " + beverage.length);

        Arrays.sort(food);
        System.out.print("Food: ");
        for (int i = 0; i < food.length; i++) {
            System.out.print(food[i] + ", ");
        }

        System.out.println();
        System.out.print("Beverage: ");
        Arrays.sort(beverage, (o1, o2) -> {
            return o2.compareTo(o1);
        });
        for (String j : beverage) {
            System.out.print(j + ", ");
        }

        beverage[3] = food[4];
        System.out.println();
        System.out.print("New Beverage: ");
        for (String j : beverage) {
            System.out.print(j + ", ");
        }
        System.out.println();

        //neu array rong phai dung for thuong
        String foodArray[] = new String[5];
//        int[] array = new int[5];
//        for(int i = 0; i<5 ; i++){
//            foodArray[i] = i + "pizza";
//        }

        //for-each truy xuat du lieu co trong array
          for(String i : foodArray){
              i = "pizza";
          }
        System.out.println(foodArray[0]);
    }
}
