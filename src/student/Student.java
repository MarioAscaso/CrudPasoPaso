package student;

public class Student {
    String DNI;
    String completeName;
    int age;
    String birthday;
    String subject1;
    float mark1;
    String subject2;
    float mark2;

    public Student(String DNI, String nombreCompleto, int age, String birthday, String subject1, float mark1, String subject2, float mark2){
        this.DNI = DNI;
        this.completeName = nombreCompleto;
        this.age = age;
        this.birthday = birthday;
        this.subject1 = subject1;
        this.mark1 = mark1;
        this.subject2 = subject2;
        this.mark2 = mark2;
    }
}

