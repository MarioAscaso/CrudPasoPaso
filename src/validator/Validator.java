package validator;

import main.Main;

public class Validator {
    public static boolean validarOpcionMenu(int optionMenu) {
        return Main.REGISTER <= optionMenu && optionMenu <= Main.OUT;
    }

    public static boolean userWantsLogOut(int optionMenu) {
        return optionMenu == Main.OUT;
    }

}
