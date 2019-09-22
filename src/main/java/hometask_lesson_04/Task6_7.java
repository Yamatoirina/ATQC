package hometask_lesson_04;

public class Task6_7 {
    public static void main(String[] args) {

        //Task 6
        System.out.println(getEvenDigitSum(45272));



        //Task 7
        System.out.println(getGreatestCommonDivisor(28, 35));


    }


    public static int getEvenDigitSum(int a){
        if (a<0 ) {
            return -1;
        }

        int num;
        int acc = a;
        int sum = 0;
        while (acc != 0) {
            num = acc % 10;
            acc = acc / 10;
            if (num % 2 == 0)
                sum += num;
        }
        return sum;
    }



    public static int getGreatestCommonDivisor (int a, int b){

        if(a<10 || b<10){
            return -1;
        } else {
            while (b !=0) {
                int tmp = a%b;
                a = b;
                b = tmp;
            }
            return a;
        }


    }
}
