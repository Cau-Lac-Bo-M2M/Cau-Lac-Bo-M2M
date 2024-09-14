package Array;

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

        System.out.print("Food: ");
        for (int i = 0; i < food.length; i++) {
            System.out.print(food[i] + ", ");
        }

        System.out.println();
        System.out.print("Beverage: ");
        for (String j : beverage) {
            System.out.print(j + ", ");
        }

        beverage[3] = food[4];
        System.out.println();
        System.out.print("New Beverage: ");
        for (String j : beverage) {
            System.out.print(j + ", ");
        }
    }
}
