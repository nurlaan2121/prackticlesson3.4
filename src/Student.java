import java.time.LocalDate;

public class Student {
    String name;
    LocalDate localDate;
    String phoneNumbe;
    String nationality;
    public Student (){

    }
    public Student (String name,LocalDate localDate,String phoneNumbe,String nationality){
        this.name = name;
        this.localDate = localDate;
        this.nationality = nationality;
        this.phoneNumbe = phoneNumbe;
    }
}
