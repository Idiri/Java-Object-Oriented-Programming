package exercises.oop.arraylists;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //ArrayList = A resizeable array that stores objects (autoboxing).
        //            Arrays are fixed in size, but ArrayLists can change.

        //ArrayList<String> fruits = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();
        System.out.println("Enter the number of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numOfFood; i++){
            System.out.print("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);


        //fruits.add("Apple");
        //fruits.add("Orange");
        //fruits.add("Banana");
        //fruits.add("Coconut");

        //fruits.remove(1);
        //fruits.set(0, "Pineapple");
        //System.out.println(fruits.get(0));
        // System.out.println(fruits.size());


        //for(String fruit : fruits){
         //   System.out.println(fruit);
       // }



    }
}
