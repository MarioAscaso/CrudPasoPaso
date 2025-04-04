package student;

import java.util.ArrayList;
import java.util.List;

public record StudentList() {

    public static List<Student> addUsers(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("51193593D", "Mario", "Ascaso", "Vicente", 23, "27/08/2001", "Programacion", 5.5f, "Lenguaje de marcas", 6.6f));
        //studentList.add(new Student("11111111A", "David", "Ascaso", "Vicente",29, "11/09/1995", "Programacion", 5, "Lenguaje de marcas", 5.6f));
        studentList.add(new Student("22222222B", "Cristina", "Vicente", "Sanchez", 58, "05/12/1966", "Programacion", 6.5f, "Lenguaje de marcas", 6.6f));
        studentList.add(new Student("33333333C", "Enrique", "Ascaso", "Jimenez", 60, "22/10/1964", "Programacion", 7.2f, "Lenguaje de marcas", 7.8f));
        studentList.add(new Student("44444444D", "Nico", "Mahecha", "Ramirez", 25, "13/04/1999", "Programacion", 6.3f, "Lenguaje de marcas", 6.7f));
        studentList.add(new Student("55555555E", "Marco", "DeLuca", "Cid", 23, "13/02/2001", "Programacion", 7.2f, "Lenguaje de marcas", 7.7f));
        studentList.add(new Student("66666666F", "Adolfo", "Trocoli", "Naranjo", 22, "11/01/2002", "Programacion", 9.1f, "Lenguaje de marcas", 8.9f));
        studentList.add(new Student("77777777G", "Alberto", "Perez", "Tejedor", 24, "2/08/2000", "Programacion", 5.3f, "Lenguaje de marcas", 6.3f));
        studentList.add(new Student("88888888H", "Eduardo", "Martinez", "Fernandez", 22, "12/12/2001", "Programacion", 2.5f, "Lenguaje de marcas", 3.1f));
        studentList.add(new Student("99999999I", "Elena", "Gallego", "Hernandez", 23, "27/09/2001", "Programacion", 7.5f, "Lenguaje de marcas", 6.6f));
        studentList.add(new Student("00000000J", "Paula", "Mosquera", "Serrano", 23, "23/02/2001", "Programacion", 3.5f, "Lenguaje de marcas", 7.6f));
        return studentList;
    }
}
