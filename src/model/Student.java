//package model;
//
//public class Student {
//    String name;
//    String surname;
//    int year = 2010;
//    char gender;
//    double mark;
//    boolean isPHD;
//
//    public void printInfo(){
//        System.out.println("Name: " + name);
//        System.out.println("Surname: " + surname);
//        System.out.println("Year: " + year);
//        System.out.println("Gender: " + (gender == 'F'? "Female": "Male"));
//        System.out.println("Mark: " + mark);
//        System.out.println("isPHD: " + (isPHD ? "Yes" : "No"));
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getMark() {
//        return mark;
//    }
//
//    public void setMark(double mark) {
//        this.mark = mark;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        if(year >= 1940 && year <= 2010){
//            this.year = year;
//        }
//    }
//
//    public char getGender() {
//        return gender;
//    }
//
//    public void setGender(char gender) {
//        this.gender = gender;
//    }
//
//    public boolean isPHD() {
//        return isPHD;
//    }
//
//    public void setPHD(boolean PHD) {
//        isPHD = PHD;
//    }
//}
