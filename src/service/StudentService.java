//package service;
//
//import model.Student;
//
//import java.util.Scanner;
//
//public class StudentService {
//
//    public Student createStudent() {
//        Scanner sc = new Scanner(System.in);
//        Student student = new Student();
//        System.out.println("Enter student name: ");
//        String name = sc.next();
//        System.out.println("Enter surname: ");
//        String surname = sc.next();
//        System.out.println("Enter year: ");
//        int year = sc.nextInt();
//        System.out.println("Enter gender: ");
//        char gender = sc.next().charAt(0);
//        System.out.println("Enter mark: ");
//        double mark = sc.nextDouble();
//        System.out.println("Enter PHD: ");
//        boolean phd = sc.nextBoolean();
//
//        student.setName(name);
//        student.setSurname(surname);
//        student.setYear(year);
//        student.setGender(gender);
//        student.setMark(mark);
//        student.setPHD(phd);
//        return student;
//    }
//
//    public void maxStudent(Student student1, Student student2) {
//        if (student1.getYear() < student2.getYear()) {
//            student1.printInfo();
//        }else {
//            student2.printInfo();
//        }
//    }
//
//    public void femaleStudents(Student[] student) {
//        for (int i = 0; i < student.length; i++) {
//            if (student[i].getGender() == 'F') {
//                student[i].printInfo();
//            }
//        }
//    }
//
//    public Student studentWithMaxMark(Student[] student) {
//        Student m = null;
//        for (int i = 0; i < student.length; i++) {
//            if(student[i].isPHD()) {
//                if(m == null || student[i].getMark() > m.getMark()) {
//                    m = student[i];
//                }
//            }
//        }
//        return m;
//    }
//
//    public Student[] sortStudentsByAge (Student[] student) {
//        Student[] sorted = new Student[student.length];
//        for (int i = 0; i < student.length; i++) {
//            sorted[i] = student[i];
//        }
//        for (int i = 1; i < sorted.length; i++) {
//            if (sorted[i].getYear() > sorted[i - 1].getYear()) {
//                Student temp = sorted[i];
//                sorted[i] = sorted[i - 1];
//                sorted[i - 1] = temp;
//            }
//        }
//        return sorted;
//    }
//
//}
