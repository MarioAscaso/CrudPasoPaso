package main;

import input.Input;
import output.Output;
import student.Student;
import validator.Validator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static final int REGISTER = 1;
    public static final int LIST = 2;
    public static final int DELETE = 3;
    public static final int MODIFY = 4;
    public static final int OUT = 5;

    private static List<Student> students;
    private static Iterator<Student> iterator;

    public static void main(String[] args) {
        students = new ArrayList<>();
        int optionMenu;
        do {
            optionMenu = getOpcionMenu();
            action(optionMenu);
        } while (!Validator.userWantsLogOut(optionMenu));
    }

    private static int getOpcionMenu() {
        int optionMenu;
        do {
            optionMenu = showAndAskOption();
        } while (!Validator.validarOpcionMenu(optionMenu));
        return optionMenu;
    }

    private static int showAndAskOption() {
        Output.showMenu();
        return Input.getValueInt();
    }

    private static void action(int optionMenu) {
        switch (optionMenu) {
            case REGISTER:
                registerStudent();
                break;
            case LIST:
                listStudents(students);
                break;
            case DELETE:
                deleteStudent();
                break;
            case MODIFY: modificateMark();
                break;
            case OUT:
                Output.logout();
                break;
            default:
        }
    }

    private static void registerStudent() {
        Object[] data = askData();
        students.add(new Student((String) data[0], (String) data[1], (int) data[2], (String) data[3], (String) data[4], (float) data[5], (String) data[6], (float) data[7]));
    }

    private static void listStudents(List<Student> students) {
        iterator = students.iterator();
        Output.listHeaderStudents();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            Output.listStudents(student);
        }
    }

    private static void deleteStudent() {
        iterator = students.iterator();
        boolean found = false;
        String toFoundDNI;
        Output.askDNI();
        toFoundDNI = Input.getText();
        while(iterator.hasNext() && !found) {
            Student student = iterator.next();
            if(Student.getDNI().equals(toFoundDNI)){
                iterator.remove();
                found = true;
            }
        }
    }

    private static void modificateMark(){

        iterator = students.iterator();
        boolean found = false;
        String toFoundDNI;
        Output.askDNI();
        toFoundDNI = Input.getText();
        while(iterator.hasNext() && !found) {
            Student student = iterator.next();
            if(Student.getDNI().equals(toFoundDNI)){
                Output.askMark();
                float mark1 = Input.getValueFloat();
                Student.setMark1(mark1);
                found = true;
            }
        }
    }

    private static Object[] askData() {
        Object[] data = new Object[8];
        Output.askDNI();
        String DNI = Input.getText();
        data[0] = DNI;
        Output.askCompleteName();
        String name = Input.getText();
        data[1] = name;
        Output.askAge();
        int age = Input.getValueInt();
        data[2] = age;
        Output.askBirthday();
        String birthday = Input.getText();
        data[3] = birthday;
        Output.askSubject();
        String subject1 = Input.getText();
        data[4] = subject1;
        Output.askMark();
        float mark1 = Input.getValueFloat();
        data[5] = mark1;
        Output.askSubject();
        String subject2 = Input.getText();
        data[6] = subject2;
        Output.askMark();
        float mark2 = Input.getValueFloat();
        data[7] = mark2;

        return data;
    }

}
