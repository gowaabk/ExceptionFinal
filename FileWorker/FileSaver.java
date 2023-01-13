package FileWorker;

import Data.Person;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileSaver {
    public static void save(Person person) {
        File file = new File(String.format("DB\\%s.txt", person.getLastName()));
        try {
            file.createNewFile();
            FileWriter writer = new FileWriter(file, true);
            writer.write(person + "\n");
            writer.flush();
            writer.close();
            System.out.println("Added record!\n");
        } catch (IOException e) {
            System.out.println("Stack trace:");
            for (StackTraceElement trace : e.getStackTrace()) {
                System.out.println(trace);
            }
            System.out.println();
        }
    }
}