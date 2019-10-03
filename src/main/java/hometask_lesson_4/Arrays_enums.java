package hometask_lesson_4;

import java.util.ArrayList;
import java.util.HashSet;

import static hometask_lesson_4.Days.*;


public class Arrays_enums {

    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1:");

        ArrayList<String> heroes = new ArrayList<>();
        heroes.add("Tom");
        heroes.add("Petrovich");
        heroes.add("Vitalya");
        heroes.add("Kolya");

        for (int i = 0; i < heroes.size() ; i++) {
            System.out.println(heroes.get(i));
        }






        //Task 2
        System.out.println("\n Task 2: ");

        for (Hollidays holiday : Hollidays.values()) {
            System.out.println(holiday);
        }







        // Task 4
        System.out.println("\n Task 4: ");

        int[] nums = new int[15];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 0 + (int) (Math.random() * 9);
            System.out.print(nums[i] + " ");
        }
            int even=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2 == 0){
               even++;
            }
        }
        System.out.println("\n number of even elements: " + even);




        //Task 5
        System.out.println("\n Task 5: ");


        ArrayList<String> employees = new ArrayList<>();
        employees.add("Vasya");
        employees.add("Petya");
        employees.add("Fedor");
        employees.add("Sasha");
        employees.add("Maksim");


        System.out.println("ArrayList size: " + employees.size());

        for (int i = 0; i < employees.size() ; i++) {
            System.out.println(employees.get(i));
        }





        //Task 6
        System.out.println("\n Task 6: ");


        ArrayList<String> Str = new ArrayList<String>();
        Str.add("Jim Bob");
        Str.add("123451234512345");
        Str.add("Bobby Jonnes");
        Str.add("Jane Black");
        Str.add("Rob Stiles");
        Str.add("Jim Bobby");
        Str.add("456784567845678");
        Str.add("Drako Dragon");
        Str.add("Jilly Willy");
        Str.add("Jim Bomber");
        int largestString = Str.get(0).length();
        int index = 0;

        for(int i = 0; i < Str.size(); i++)
        {
            if(Str.get(i).length() >= largestString)
            {
                largestString = Str.get(i).length();
                index = i;
            }
        }
        for (int i = 0; i < Str.size(); i++) {

            if(Str.get(i).length() == largestString)
            {
                System.out.println(Str.get(i) + " " + "is the largest and its size " + largestString);
            }
        }



        //Task 9
        System.out.println("\n Task 9: ");

        ArrayList<Integer> intList = new ArrayList<Integer>();
        HashSet<Integer> intsSet = new HashSet();

        for(int i=0;i<100;i++) {
            intList.add(0 + (int) (Math.random() * 100));
            System.out.print(intList.get(i) +" ");
            intsSet.add(intList.get(i));
        }
        System.out.print("\n" + intsSet);

        System.out.println();




        //Task 10
        System.out.println("\n Task 10: ");


        Days day = SATURDAY;

        switch(day) {
            case MONDAY:
                System.out.println("1");
                break;
            case TUESDAY:
                System.out.println("2");
                break;
            case WEDNESDAY:
                System.out.println(" 3");
                break;
            case THURSDAY:
                System.out.println(" 4");
                break;
            case FRIDAY:
                System.out.println("5");
                break;
            case SATURDAY:
                System.out.println("6");
                break;
            case SUNDAY:
                System.out.println(" 7");
                break;
        }


    }



}
