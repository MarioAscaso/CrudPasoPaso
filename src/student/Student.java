package student;

public class Student {
    String DNI;
    String name;
    String firstSurname;
    String secondSurname;
    int age;
    String birthday;
    String subject1;
    float mark1;
    String subject2;
    float mark2;

    public Student(String DNI, String name, String firstSurname, String secondSurname, int age, String birthday, String subject1, float mark1, String subject2, float mark2) {
        this.DNI = DNI;
        this.name = name;
        this.firstSurname = firstSurname;
        this.secondSurname =secondSurname;
        this.age = age;
        this.birthday = birthday;
        this.subject1 = subject1;
        this.mark1 = mark1;
        this.subject2 = subject2;
        this.mark2 = mark2;
    }

    public String getDNI() {return DNI;}
    public String getName() {return name;}
    public String getFirstSurname() {return firstSurname;}
    public String getSecondSurname() {return secondSurname;}
    public int getAge() {return age;}
    public String getBirthday() {return birthday;}
    public String getSubject1() {return subject1;}
    public float getMark1() {return mark1;}
    public String getSubject2() {return subject2;}
    public float getMark2() {return mark2;}

    public void setMark1(float mark1){this.mark1 = mark1;}

}

