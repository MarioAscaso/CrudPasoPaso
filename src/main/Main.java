package main;

import input.Input;
import organizer.BinarySort;
import organizer.Organizer;
import output.Output;
import student.Student;
import student.StudentList;
import validator.Validator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static final int REGISTER = 1;
    public static final int LIST = 2;
    public static final int DELETE = 3;
    public static final int MODIFY = 4;
    public static final int SEARCH = 5;
    public static final int OUT = 6;

    public static List<Student> studentsList;
    public static List<Student> studentsListOrganized;
    public static Iterator<Student> iterator;
    //public static Student student;

    public static void main(String[] args) {
        studentsList = StudentList.addUsers();
        int optionMenu;
        boolean userWantsQuit = false;
        do {
            optionMenu = getOpcionMenu();
            if (Validator.userWantsLogOut(optionMenu)) {
                Output.logout();
                userWantsQuit = true;
            } else {
                action(optionMenu);
            }
        } while (!userWantsQuit);
    }

    private static int getOptionMenu() {
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
                listStudents(studentsList);
                break;
            case DELETE:
                deleteStudent();
                break;
            case MODIFY:
                modificateMark();
                break;
            case SEARCH:
                //searchUser();
                break;
            default:
                break;
        }
    }

    private static void registerStudent() {
        Object[] data = askData();
        studentsList.add(new Student((String) data[0], (String) data[1], (String) data[2], (String) data[3], (int) data[4], (String) data[5], (String) data[6], (float) data[7], (String) data[8], (float) data[9]));
    }

    private static void listStudents(List<Student> list) {
        iterator = list.iterator();
        Output.listHeaderStudents();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            Output.listStudents(student);
        }
    }

    private static void deleteStudent() {
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

    private static void modificateMark() {
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
                student. setMark1(mark1);
                Output.markModificated();
                found = true;
            }
        }
    }

    /*private static void searchUser() {
        Student student;
        boolean found = false;
        Output.askFirstSurnameStudentToSearch();
        String surnameToSearch = Input.getText();
        student = BinarySort.binarySort(studentsList, surnameToSearch);
        if(found){
            Output.listStudents(student);
        }
    }*/

    private static Object[] askData() {
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

        return data;
    }

}
