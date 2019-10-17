package hometask_lesson_06;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME)
@interface SaveTo {

    String path();
}

@Retention(value = RetentionPolicy.RUNTIME)
@interface Saver {
}

@SaveTo(path = "/home/ira/IdeaProjects/ATQC/src/main/java/hometask_lesson_06/text.txt")
public class TextContainer {

    private static String text = "Some beautiful text!";

    @Saver
    public static void save(String path) {
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(text);
            System.out.println("Successfully");
        } catch (IOException ex) {
            System.out.println( ex.getMessage());
        }
    }
}