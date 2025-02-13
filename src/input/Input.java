package input;

import java.util.Scanner;

public class Input {
    private final static Scanner sc = new Scanner(System.in);
    private static int valueInt;
    private static float valueFloat;
    private static String valueString;

    private static void getInt() {valueInt = Integer.parseInt(sc.nextLine());}
    public static int getValueInt() {
        getInt();
        return valueInt;
    }

    private static void getFloat() {valueFloat = Float.parseFloat(sc.nextLine());}
    public static float getValueFloat() {
        getFloat();
        return valueFloat;
    }

    private static void getString() {valueString = sc.nextLine();}
    public static String getText() {
        getString();
        return valueString;
    }

}
