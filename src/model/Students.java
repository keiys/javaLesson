package model;

public class Students {

    /**
     * Model of the student class, gives information about which student's data will be required for creating
     */

    private String name;
    private String surname;
    private String gender;
    private int age;
    private double grade;

    public Students(String data) {
        String [] str = data.split(", ");
        name = str[0];
        surname = str[1];
        gender = String.valueOf(str[2].charAt(0));
        age = Integer.parseInt(str[3]);
        grade = Double.parseDouble(str[4]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
