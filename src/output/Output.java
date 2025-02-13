package output;

public class Output {

    public static void showMenu() {
        System.out.print("""
                
                1. - DAR DE ALTA ALUMNO
                5. - SALIR
                
                ELIJA OPCIÓN A REALIZAR:""");
    }

    public static void askDNI() {System.out.print("INTRODUZCA SU DOCUMENTO DE IDENTIDAD: ");}
    public static void askCompleteName() {System.out.print("INTRODUZCA SU NOMBRE COMPLETO: ");}
    public static void askAge() {System.out.print("INTRODUZCA SU EDAD ACTUAL: ");}
    public static void askBirthday() {System.out.print("INTRODUZCA SU FECHA DE NACIMIENTO: ");}
    public static void askSubject() {System.out.print("INTRODUZCA EL NOMBRE DE LA ASIGNATURA: ");}
    public static void askMark() {System.out.print("INTRODUZCA LA NOTA DE LA ASIGNATURA: ");}
    public static void logout() {System.out.println("CIERRE DE SESIÓN");}

}


