package main;

import input.Input;
import output.Output;
import studentManager.*;
import validator.Validator;

public class Main {
    public static final int REGISTER = 1;
    public static final int LIST = 2;
    public static final int DELETE = 3;
    public static final int MODIFY = 4;
    public static final int SEARCH = 5;
    public static final int OUT = 6;

    public static void main(String[] args) {
        StudentManager.addUsers();
        int optionMenu;

        do {
            Output.showMenu();
            optionMenu = Input.getValueInt();
            action(optionMenu);
        } while (!Validator.userWantsLogOut(optionMenu));
    }

    private static void action(int optionMenu) {
        switch (optionMenu) {
            case REGISTER:
                StudentManager.registerNewStudent();
                break;
            case LIST:
                StudentManager.listStudent();
                break;
            case DELETE:
                StudentManager.deleteStudent();
                break;
            case MODIFY:
                StudentManager.modificateMark();
                break;
            case SEARCH:
                StudentManager.searchStudent();
                break;
            case OUT:
                Output.logout();
                break;
            default:
        }
    }

}
