package service;

import model.Students;

public class StudentsService {
    /**
     * This class is for working with the model Student
     * @param data
     * @return
     */

    public static Students[] convert (String[] data){
        //creating new students array for converting
        Students[] students = new Students[data.length];
        for (int i = 0; i < data.length; i++) {
            students[i] = new Students(data[i]); // writing information in the array
        }
        return students;
    }

    public static Students studentWithMaxGrade (Students[] students){
        Students studentWithMaxAge = students[0]; // giving first element of the array as a max value
        for (int i = 0; i < students.length; i++) {
            if(studentWithMaxAge.getGrade() < students[i].getGrade()){
                studentWithMaxAge = students[i]; // if another value is biger than our variable's value, saving that another value
            }

        }
        return studentWithMaxAge;
    }

    public static String sortByGrade(Students[] students){
        // sorting array
        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < students.length; j++) {
                if (students[j].getGrade() > students[j-1].getGrade()) {
                    Students temp = students[j];
                    students[j] = students[j-1];
                    students[j-1] = temp;
                }
            }
        }
        String result = "";
        for (int i = 0; i < students.length; i++) {
            // saving info of the elements in one line
            result += students[i].getName() + ", " + students[i].getSurname() + ", " + students[i].getGrade() + "/ ";
        }
        return result;
    }

    public static String studentInfo(Students student){
        return student.getName() + ", " + student.getSurname() + ", " + student.getGender() + ", " +
                student.getAge() + ", " + student.getGrade();
    }

}
