package hometask_lesson_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {

        //TASK 3
        System.out.println("Task 3: ");

        HashMap<String, Integer> vehicles = new HashMap();
        vehicles.put("BMW", 5);

        System.out.println(vehicles);



        //TASK 7
        System.out.println("\n Task 7: ");

        HashMap<String, String> plants = new HashMap<>();
        plants.put("watermelon", "berry");
        plants.put("banana", "fruit");
        plants.put("cherry", "berry");
        plants.put("pineapple", "fruit");
        plants.put("melon", "vegetable");
        plants.put("cranberry", "berry");
        plants.put("apple", "fruit");
        plants.put("iris", "flower");
        plants.put("potato", "vegetable");
        plants.put("carrot", "vegetable");

        for (String i : plants.keySet()) {
            System.out.println( i + " - " + plants.get(i));
        }




        //TASK 8
        System.out.println("\n Task 8: ");

        HashMap<String, String> plants1 = new HashMap<>();
        plants1.put("watermelon", "berry");
        plants1.put("banana", "fruit");
        plants1.put("cherry", "berry");
        plants1.put("pineapple", "fruit");
        plants1.put("melon", "vegetable");
        plants1.put("cranberry", "berry");
        plants1.put("apple", "fruit");
        plants1.put("iris", "flower");
        plants1.put("potato", "vegetable");
        plants1.put("carrot", "vegetable");

        Map<String, String> veg = new HashMap<>();

        for (Map.Entry<String,String> entry : plants1.entrySet()){
            if (entry.getValue().equals("vegetable")){
                veg.put(entry.getKey(), entry.getValue());
            }

        }


        for (String i : veg.keySet()) {
            System.out.println( i + " - " + veg.get(i));
        }



    }



}
