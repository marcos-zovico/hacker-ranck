package hackerrank.java.advanced;

import java.util.Scanner;

public class JavaFactoryPattern {

    public class Solution {
        public static void main(String args[]) {
            try {
                Scanner sc = new Scanner(System.in);
                FoodFactory foodFactory = new FoodFactory();
                Food food = foodFactory.getFood(sc.nextLine());
                System.out.println("The factory returned class " + food.getClass().getSimpleName());
                System.out.println(food.getType());
                sc.close();
            } catch (Exception e) {
                System.out.println("Unsuccessful Termination!!");
            }
        }
    }
}

interface Food {
    public String getType();
}

class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        if ("pizza".equals(order)) {
            return new Pizza();
        }
        return new Cake();
    }
}
