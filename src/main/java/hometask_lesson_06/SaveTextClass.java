package hometask_lesson_06;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SaveTextClass {
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        TextContainer container = new TextContainer();
        Class<?> cls = container.getClass();

        SaveTo saveTo = cls.getAnnotation(SaveTo.class);

        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Saver.class)) {
                method.invoke(null, saveTo.path());
            }
        }
    }
}
