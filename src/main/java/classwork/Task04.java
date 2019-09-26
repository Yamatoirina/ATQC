package classwork;

public class Task04 {

    public static void main(String[] args) {

        changeVariablesWithAdditionalVariable(2,5);
        changeVariablesWithoutVariable(8,1);



    }

    public static void changeVariablesWithAdditionalVariable (int a, int b){
        int mid;
        mid = a;
        a = b;
        b = mid;
        System.out.println("a = " +  a + " b = "+ b);
    }


    public static void changeVariablesWithoutVariable(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " +  a + " b = "+ b);
    }
}
