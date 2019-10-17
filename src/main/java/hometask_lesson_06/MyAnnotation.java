package hometask_lesson_06;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class MyAnnotation {


    @Target(value= ElementType.METHOD)
    @Retention(value= RetentionPolicy.RUNTIME)

    public @interface Test1 {
        int a();
        int b();


    }

    @Test1(a = 6, b = 4)
    public static void test(int a, int b) {
        System.out.println("a= " + a + " b= "+b);
    }

    public static void main(String[] args) {

        try {
            Class<?> cls = MyAnnotation.class;
            Method vasja = cls.getMethod("test", int.class, int.class);
            if (vasja.isAnnotationPresent(Test1.class)) {

                Test1 test1 = vasja.getAnnotation(Test1.class);
                vasja.invoke(null, test1.a(), test1.b());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
