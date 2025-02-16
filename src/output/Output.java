package output;

import student.Student;

public class Output {

    public static void showMenu() {
        System.out.print("""
                
                1. - DAR DE ALTA ALUMNO
                2. - LISTAR ALUMNOS
                3. - DAR DE BAJA ALUMNO
                4. - MODIFICAR NOTA 
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
    public static void listStudents(Student student) {
        String format = "| %-12s | %-20s | %-4s | %-12s | %-15s | %-4s | %-15s | %-4s |\n";
        String separator = "+--------------+-----------------+------+--------------+-----------------+--------+-----------------+--------+";
        System.out.printf(format, student);
        System.out.println(separator);
    }
    public static void listHeaderStudents(){
        String format = "| %-12s | %-15s | %-4s | %-12s | %-15s | %-4s | %-15s | %-4s |\n";
        String separator = "+--------------+-----------------+------+--------------+-----------------+--------+-----------------+--------+";
        System.out.println(separator);
        System.out.printf(format, "DNI", "NOMBRE ALUMNO", "EDAD", "FECHA NAC.", "ASIGNATURA 1", "NOTA 1", "ASIGNATURA 2", "NOTA 2");
        System.out.println(separator);
    }

}


