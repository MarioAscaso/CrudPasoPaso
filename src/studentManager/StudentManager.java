package studentManager;

import input.Input;
import main.Main;
import organizer.BinarySort;
import organizer.Organizer;
import output.Output;
import student.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static output.Output.listStudents;

public class StudentManager {

    private static List<Student> studentsList = new ArrayList<>();
    private static Iterator<Student> iterator;

    public static void registerNewStudent() {
        Object[] data = new Object[10];
        Output.askDNI();
        data[0] = Input.getText();
        Output.askName();
        data[1] = Input.getText();
        Output.askFirstSurname();
        data[2] = Input.getText();
        Output.askSecondSurname();
        data[3] = Input.getText();
        Output.askAge();
        data[4] = Input.getValueInt();
        Output.askBirthday();
        data[5] = Input.getText();
        Output.askSubject();
        data[6] = Input.getText();
        Output.askMark();
        data[7] = Input.getValueFloat();
        Output.askSubject();
        data[8] = Input.getText();
        Output.askMark();
        data[9] = Input.getValueFloat();

        studentsList.add(new Student((String) data[0], (String) data[1], (String) data[2], (String) data[3], (Integer) data[4], (String) data[5], (String) data[6], (float) data[7], (String) data[8], (float) data[9]));
    }

    public static void deleteStudent(){
        iterator = studentsList.iterator();
        boolean found = false;
        String toFoundDNI;
        Output.askDNI();
        toFoundDNI = Input.getText();
        while (iterator.hasNext() && !found) {
            Student student = iterator.next();
            if (student.getDNI().equals(toFoundDNI)) {
                iterator.remove();
                Output.userDeleted();
                found = true;
            }
        }
    }

    public static void listStudent(){
        iterator = studentsList.iterator();
        Output.listHeaderStudents();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            Output.listStudents(student);
        }
    }

    public static void modificateMark(){
        iterator = studentsList.iterator();
        boolean found = false;
        String toFoundDNI;
        Output.askDNI();
        toFoundDNI = Input.getText();
        while (iterator.hasNext() && !found) {
            Student student = iterator.next();
            if (student.getDNI().equals(toFoundDNI)) {
                Output.askMark();
                float mark1 = Input.getValueFloat();
                student.setMark1(mark1);
                Output.markModificated();
                found = true;
            }
        }
    }

    public static void searchStudent(){
        Organizer.sortListAlphabetically(studentsList);
        listStudent();
        Student student;
        boolean found = false;
        Output.askFirstSurnameStudentToSearch();
        String surnameToSearch = Input.getText();
        student = BinarySort.studentSearch(studentsList, surnameToSearch);
        if (student == null) {
            Output.studentNotFound();
        }else {
            Output.separator();
            listStudents(student);
        }
    }

    public static List<Student> addUsers(){
        studentsList.add(new Student("51193593D", "Mario", "Ascaso", "Vicente", 23, "27/08/2001", "Programacion", 5.5f, "Lenguaje de marcas", 6.6f));
        studentsList.add(new Student("11111111A", "David", "Ascaso", "Vicente",29, "11/09/1995", "Programacion", 5, "Lenguaje de marcas", 5.6f));
        studentsList.add(new Student("22222222B", "Cristina", "Vicente", "Sanchez", 58, "05/12/1966", "Programacion", 6.5f, "Lenguaje de marcas", 6.6f));
        studentsList.add(new Student("33333333C", "Enrique", "Ascaso", "Jimenez", 60, "22/10/1964", "Programacion", 7.2f, "Lenguaje de marcas", 7.8f));
        studentsList.add(new Student("44444444D", "Nico", "Mahecha", "Ramirez", 25, "13/04/1999", "Programacion", 6.3f, "Lenguaje de marcas", 6.7f));
        studentsList.add(new Student("55555555E", "Marco", "DeLuca", "Cid", 23, "13/02/2001", "Programacion", 7.2f, "Lenguaje de marcas", 7.7f));
        studentsList.add(new Student("66666666F", "Adolfo", "Trocoli", "Naranjo", 22, "11/01/2002", "Programacion", 9.1f, "Lenguaje de marcas", 8.9f));
        studentsList.add(new Student("77777777G", "Alberto", "Perez", "Tejedor", 24, "2/08/2000", "Programacion", 5.3f, "Lenguaje de marcas", 6.3f));
        studentsList.add(new Student("88888888H", "Eduardo", "Martinez", "Fernandez", 22, "12/12/2001", "Programacion", 2.5f, "Lenguaje de marcas", 3.1f));
        studentsList.add(new Student("99999999I", "Elena", "Gallego", "Hernandez", 23, "27/09/2001", "Programacion", 7.5f, "Lenguaje de marcas", 6.6f));
        studentsList.add(new Student("00000000J", "Paula", "Mosquera", "Serrano", 23, "23/02/2001", "Programacion", 3.5f, "Lenguaje de marcas", 7.6f));
        return studentsList;
    }


}
