package hometask_lesson_04;

public class Task1 {
    public static void main(String[] args) {

        //Print numbers from 10 to 20 using all known cycles.

        int i = 10;
        do {
            System.out.print(i + " ");
            i++;
        } while (i<=20);

        System.out.println();


        int j = 10;
        while (j<=20){
            System.out.print(j+ " ");
            j++;
        }

        System.out.println();


        for (int k = 10; k < 21; k++) {
            System.out.print(k + " ");

        }

        System.out.println();

        int[] arr =  {10,11,12,13,14,15,16,17,18,19,20};

        for (int pr : arr) {
            System.out.print(pr + " ");
        }

    }



}
