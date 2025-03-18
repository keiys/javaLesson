import model.Students;
import service.FileService;
import service.StudentsService;

import java.util.Locale;

public class Homework9 {
    // url of the file
    public static final String URL = "test.txt";
    public static void main(String[] args) throws Exception {
        String[] elements = FileService.readFile(URL); // reading from the file
        Students[] students = StudentsService.convert(elements); // making student list and taking data from the file
        Students student = StudentsService.studentWithMaxGrade(students); // searching student with max grade

        // sorting list by a grade and writing in the file
        String sortedList = StudentsService.sortByGrade(students);
        FileService.writeFile(URL, "\nSorted by grade = " + sortedList);

        //making text for writing in the file and giving to the file
        String text = "\nMax =" + student.getName() + ", " + student.getSurname() + ", " + student.getGrade();
        FileService.writeFile(URL, text);

        // creating new files with the names of the students and writing there those students info
        FileService.newFiles(students);




    }
}
