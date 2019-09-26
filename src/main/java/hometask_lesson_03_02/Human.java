package hometask_lesson_03_02;

public class Human {

    private String firstName;
    private String lastName;
    private int age;
   private int weight;
   private int heght;


    public Human(){}

    public Human(String firstName, String lastName, int age, int weight, int heght) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.heght = heght;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeght() {
        return heght;
    }

    public void setHeght(int heght) {
        this.heght = heght;
    }


}
