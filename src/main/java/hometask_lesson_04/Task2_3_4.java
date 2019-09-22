package hometask_lesson_04;

public class Task2_3_4 {
    public static void main(String[] args) {

        //Hometask 2. Print all the numbers from 1 to 100, which are divided by 3 without a remainder.


        for (int num = 1; num <= 100; num++) {
            if (num % 3 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println();


        //Hometask 3. Fill the array with numbers from 100 to 0.

        int[] arr = new int[101];
        int j = 0;
        for (int i = 100; i >= 0; i--) {
            arr[j] = i;
            System.out.print(arr[j] + " ");
            j++;
        }


        System.out.println();

        //Hometask 4. Given an array of 10 integers. To display the sum of all its elements except the first and last.
        
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int sum=0;

        for (int i = 1; i < array.length-1; i++) {
            sum = sum +array[i];
        }
        System.out.println(sum);

    }



}
