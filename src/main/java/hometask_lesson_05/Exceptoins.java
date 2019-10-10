package hometask_lesson_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exceptoins {

    public static void main(String[] args) throws NullPointerException {

        int num = 0;
        ifNumberIsZero(num);


        System.out.println(divideByZero());


        iCanThrowException();


        readData();


        //task 3. Finish the program to handle all the possible exceptions:

                int a = args.length;
                System.out.println(a);

                try {
                    int b = 10 / a;

                    int[] c = {1};
                    System.out.println(c[1]);
                }catch (Exception e){
                    e.printStackTrace();
                }




        //task 4. Fix the program to make it work:

            try {
                int a1 = 0;
                int b = 4 / a1;
            } catch (ArithmeticException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }


    }

    // task 1

    public static void ifNumberIsZero(int num){
        if (num < 0){
            System.out.println("Number < 0");
        } else if (num > 0){
            System.out.println("Number > 0");
        }else if (num == 0){
            try {
                throw new MyException();
            } catch (MyException e) {
                e.printStackTrace();

            }
        }
    }



    //task 2. Fix the method with try-catch to get the correct result of division:


        public static int divideByZero() {
            int a = 5;
            int b = 0;
            try {
               return a / b;
            } catch (ArithmeticException e){
                e.printStackTrace();
                return 0;
            }
        }





        // task 5. Throw a NullPointerException from the method iCanThrowException()


        public static void iCanThrowException() throws NullPointerException{
        throw new NullPointerException();

        }



        //task 6

        public static void readData (){

            List<Integer> list = new ArrayList<>();
            Scanner scan = new Scanner(System.in);

          try {
              while (true){
                  list.add(scan.nextInt());
              }
          } catch (Exception e){
              for (Integer i: list
                   ) {
                  System.out.println(i);

              }
          }
        }





}


