package hometask_lesson_03;

import java.util.ArrayList;

public class Hometask03 {

    public static void main(String[] args) {


        // Hometask 1
        System.out.println("Hometask 1: ");

        System.out.println("John is very good fellow!");
        System.out.println("John is very good fellow!");
        System.out.println("John is very good fellow!");
        System.out.println("John is very good fellow!");
        System.out.println("John is very good fellow!");


        //Hometask 2


        byte by = 10;
        short sh = 185;
        int in = 147976532;
        long lg = 49586574839395678L;
        double dbl = 245.354;
        float fl = 5765.574f;
        char ch = 'b';
        boolean boo = true;

        //Hometask 3
        System.out.println("\n Hometask 3: ");

        int r = 5;
        int dr = 3;

        int sum = r * dr;
        System.out.println("Area of rectangle is: " + sum);




        //Hometask 4 see at Education class





        //Hometask 5
        System.out.println("\n Hometask 5: ");


        int aa = 1;
        int bb = 3;
        int cc = 9;
        int dd = 27;

        int result = -aa + bb - cc + dd;

        System.out.println(result);





        //Hometask 6
        System.out.println("\n Hometask 6: ");


//                String s = "Java";
//                System.out.println("Happy");
//                System.out.println("Java Learning");
//                System.out.println("programming");
        System.out.print("Happy Java");
//                System.out.println("weekend");
//                System.out.println(s);
//                System.out.print("Python");
        System.out.print(" ");
        System.out.println("Learning");




        //Hometask 7
        System.out.println("\n Hometask 7: ");


        int a = 10;
        int b = 15;
        double c = b + 38;
//                int d = a + 12;
//                double e = 12.3;
        String s = " s " + a;
        String s1 = a + " b ";
//                String s2 = " a ";
        String s3 = s1 + " a ";
        String s4 = s3 + " b ";
        System.out.println(c + s4 + s);




        //Hometask 8
        System.out.println("\n Hometask 8: ");

        Hometask03 task = new Hometask03();
        task.printList(task.transformIntToChar(72));
        task.printList(task.transformIntToChar(101 ));
        task.printList(task.transformIntToChar(108 ));
        task.printList(task.transformIntToChar(108 ));
        task.printList(task.transformIntToChar(111 ));
        task.printList(task.transformIntToChar(32 ));
        task.printList(task.transformIntToChar(119 ));
        task.printList(task.transformIntToChar(111 ));
        task.printList(task.transformIntToChar(114 ));
        task.printList(task.transformIntToChar(108 ));
        task.printList(task.transformIntToChar(100 ));


    }


    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i : values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> characters) {
        for (char c : characters) {
            System.out.print(c);
        }
    }
}
