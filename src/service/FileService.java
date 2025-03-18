package service;
import model.Students;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileService {
    public static String[] readFile(String url) throws Exception {
        // reading info from the file
        String[] elements = Files.readAllLines(Paths.get(url)).toArray(new String[0]);
        return elements;
    }

    public static void writeFile(String url, String text) throws Exception {
        // writing info in the file
        Files.write(Path.of(url), text.getBytes(), StandardOpenOption.APPEND);
    }

    public static void newFiles(Students[] students) throws Exception{
        for (int i = 0; i <students.length; i++) {
            String url = students[i].getName() + ".txt"; // giving the name of the element of the array as the name of the file
            Path path = Paths.get(url); // making path
            Files.createFile(path); // creating new file which will have the name of the element
            writeFile(url, StudentsService.studentInfo(students[i])); // writing info of that element in the newly created file
        }
    }
}
