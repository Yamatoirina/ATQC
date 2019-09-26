package classwork;

public class Task03 {
    public static void main(String[] args) {

        System.out.println(numberInFor(2));
        System.out.println(numberInSix(2));

    }


    public static int numberInFor (int a){
        int mid;
        mid = a*a;
        a = mid*mid;

        return a;
    }

    public static int numberInSix (int b){
        int mid;
        int dub;
        mid = b*b;
        dub = mid*mid;
        b = dub*mid;

        return b;
    }

}
