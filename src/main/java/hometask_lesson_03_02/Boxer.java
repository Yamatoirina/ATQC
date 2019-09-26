package hometask_lesson_03_02;

public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public static void main(String[] args) {
        Boxer boxer1 = new Boxer(25,112,225);
        Boxer boxer2 = new Boxer(28,104,187);
        System.out.println(boxer1.fight(boxer2));
        System.out.println(boxer2.fight(boxer1));
    }

    public boolean fight(Boxer anotherBoxer) {
        //write your code here
        if (anotherBoxer.age >= 18 && anotherBoxer.age <= 90 && anotherBoxer.age <= this.age+20){
            if (anotherBoxer.weight >= 95 && anotherBoxer.weight <=150 && anotherBoxer.weight <=this.weight+45) {
                if (anotherBoxer.strength > this.strength) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }


}
