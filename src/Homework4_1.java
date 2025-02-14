import model.Student;
import service.StudentService;

import java.util.Scanner;

public class Homework4_1 {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        //Student[] students = {service.createStudent(), service.createStudent(), service.createStudent()};
        // service.femaleStudents(students);
        /*Student s = service.studentWithMaxMark(students);
        s.printInfo();*/
        /*Student[] sortedArrayOfStudents = service.sortStudentsByAge(students);
        for (Student student : sortedArrayOfStudents) {
            student.printInfo();
        }*/
        boolean isActive = true;
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];
        while (isActive) {
            System.out.println("--------- MENU ---------");
            System.out.println("1.        Create Student");
            System.out.println("2.        Max Student   ");
            System.out.println("3.        Female Student");
            System.out.println("4.        With max mark ");
            System.out.println("5.        Sort by age   ");
            System.out.println("6.        Exit          ");
            System.out.println("------------------------");
            System.out.println(" ");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            int indexOfStudent = 0;
            switch (choice) {
                case 1:
                    if (indexOfStudent >= students.length) {
                        System.out.println("The array is filled");
                        break;
                    }
                    students[indexOfStudent] = service.createStudent();
                    indexOfStudent++;
                    break;
                case 2:
                    if (indexOfStudent < 2) {
                        System.out.println("There isn't enough students");
                        break;
                    }
                    service.maxStudent(students[0], students[1]);
                    break;
                case 3:
                    if (indexOfStudent == 0) {
                        System.out.println("There isn't any students");
                        System.out.println("Please create a student first");
                        break;
                    }
                    service.femaleStudents(students);
                    break;
                case 4:
                    if (indexOfStudent == 0) {
                        System.out.println("There isn't any students");
                        System.out.println("Please create a student first");
                        break;
                    } else if (indexOfStudent == 1) {
                        students[indexOfStudent].printInfo();
                        break;
                    }
                    Student result = service.studentWithMaxMark(students);
                    result.printInfo();
                    break;
                case 5:
                    if (indexOfStudent == 0) {
                        System.out.println("There isn't any students");
                        System.out.println("Please create a student first");
                        break;
                    } else if (indexOfStudent == 1) {
                        students[indexOfStudent].printInfo();
                        break;
                    }
                    Student[] copyOfStudents = new Student[indexOfStudent];
                    for (int i = 0; i < indexOfStudent; i++) {
                        copyOfStudents[i] = students[i];
                    }
                    for (Student student : service.sortStudentsByAge(copyOfStudents)) {
                        student.printInfo();
                    }
                    break;
                case 6:
                    isActive = false;
            }
        }
    }
}
