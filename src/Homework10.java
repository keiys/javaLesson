import model.Students;
import service.AgeExeption;

public class Homework10 {
    public static void main(String[] args) throws AgeExeption {
        Students s = new Students();
        try{
            s.setAge(0);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("barev");


    }

}
