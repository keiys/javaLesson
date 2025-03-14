import java.util.Date;

public class Homework7 {
    private String s;
    private Date d;

    public Homework7(String s, Date d) {
        this.s = s;
        this.d = new Date(d.getTime());
    }

    public String getS() {
        return s;
    }

    public Date getD() {
        return new Date(d.getTime());
    }


}
