package hometask_lesson_03_02.vehicle;

public class Car extends Vehicle{


    public Car(String name, String size) {
        super(name, size);
    }

    public void steer(int direction, String sity) {
        super.steer(direction);
    }

    @Override
    public void move(int velocity, int direction) {
        super.move(velocity, direction);
    }

    @Override
    public void stop() {
        super.stop();
    }


}
