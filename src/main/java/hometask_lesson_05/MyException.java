package hometask_lesson_05;

public class MyException extends Exception {

     MyException(String msg){
        super(msg + "Such a poor exception");
    }


    public MyException() {

    }
}
