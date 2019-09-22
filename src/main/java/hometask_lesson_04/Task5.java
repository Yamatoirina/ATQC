package hometask_lesson_04;

public class Task5 {
    public static void main(String[] args) {


        System.out.println(min(9, 3, 8, 18));

    }


    public static int min(int a, int b, int c, int d) {
        if (min(a,b)==b){a = b;}
        if (min(a,c)==c){a = c;}
        if (min(a,d)==d){a = d;}
        return a;
    }
    public static int min(int a, int b) {
        if (a < b){return a;}
        else {return b;}
    }

}
