package hometask_lesson_04;

public class Task_asterisk {
    public static void main(String[] args) {

    asterisk1();
    asterisk2(7);
    asterisk3(10);

    asterisk4();

    }

     public static void asterisk1(){
         for(int i=0; i<4; i++){
             for(int j=0; j<11; j++){
                 System.out.print("*");
             } System.out.println();

         }
         System.out.println();
     }



    public static void asterisk2(int num){
        for(int i=0;i<=num;++i) {
            for (int j = 0; j < i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void asterisk3(int num){
        for(int i=0; i<=num; i++){
            if(i < 1 || i > num-1) {
                for (int j = 0; j <= num; j++) {
                    System.out.print("*");

                }
            } else if(i%2 != 0){
                for (int j = 0; j <= num; j++) {
                    System.out.print(" ");

                }System.out.println();
            } else {System.out.print("*         *");
            }


        }
        System.out.println();
    }




    public static void asterisk4(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6 - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
    }

}
