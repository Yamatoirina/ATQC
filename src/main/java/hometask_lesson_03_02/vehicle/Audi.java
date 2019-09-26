package hometask_lesson_03_02.vehicle;

public class Audi extends Car {
    private boolean isElectric;


    public Audi(String name, String size, boolean isElectric) {
        super(name, size);
        this.isElectric = isElectric;
    }

    public static void main(String[] args) {
        Audi audi = new Audi("Audi1000", "35", true);
        audi.steer(125,"Berdichev");
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public void steer(int direction, String sity) {
        super.steer(direction, sity);
        System.out.println("Go to "+sity + " sity!");
    }

    @Override
    public void move(int velocity, int direction) {
        super.move(velocity*2, direction);
        System.out.println("It's a good result!");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("The car is broken.");
    }
}
