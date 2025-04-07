package output;

import student.Student;

public class Output {

    public static void showMenu() {
        System.out.print("""
                
                1. - DAR DE ALTA ALUMNO
                2. - LISTAR ALUMNOS
                3. - DAR DE BAJA ALUMNO
                4. - MODIFICAR NOTA
                5. - BUSCAR ALUMNO
                6. - SALIR
                
                ELIJA OPCIÓN A REALIZAR:""");
    }

    public static void askDNI() {System.out.print("INTRODUZCA SU DOCUMENTO DE IDENTIDAD: ");}
    public static void askName() {System.out.print("INTRODUZCA SU NOMBRE: ");}
    public static void askFirstSurname(){System.out.print("INTRODUZCA SU PRIMER APELLIDO: ");}
    public static void askSecondSurname(){System.out.print("INTRODUZCA SU SEGUNDO APELLIDO: ");}
    public static void askAge() {System.out.print("INTRODUZCA SU EDAD ACTUAL: ");}
    public static void askBirthday() {System.out.print("INTRODUZCA SU FECHA DE NACIMIENTO: ");}
    public static void askSubject() {System.out.print("INTRODUZCA EL NOMBRE DE LA ASIGNATURA: ");}
    public static void askMark() {System.out.print("INTRODUZCA LA NOTA DE LA ASIGNATURA: ");}
    public static void askFirstSurnameStudentToSearch() {System.out.print("INTRODUZCA PRIMER APELLIDO DEL ALUMNO A BUSCAR: ");}
    public static void askSecondSurnameStudentToSearch() {System.out.print("INTRODUZCA SEGUNDO APELLIDO DEL ALUMNO A BUSCAR: ");}
    public static void askNameStudentToSearch() {System.out.print("INTRODUZCA NOMBRE DEL ALUMNO A BUSCAR: ");}
    public static void userDeleted(){System.out.println("USUARIO ELIMINADO");}
    public static void markModificated(){System.out.println("NOTA CAMBIADA");}
    public static void studentNotFound(){System.out.println("ESTUDIANTE NO EXISTENTE");}

    public static void showMenuStudent(){
        System.out.print("""
                1. - MODIFICAR NOTA 1
                2. - MODIFICAR NOTA 2
                3. - DAR DE BAJA ALUMNO
                4. - NADA
                
                ELIJA OPCIÓN A REALIZAR:""");
    }

    public static void logout() {System.out.println("CIERRE DE SESIÓN");}

    public static void listStudents(Student student) {
        String format = "| %-9s | %-26s | %-4s | %-10s | %-12s | %-6s | %-18s | %-6s |\n";
        String separator = "+-----------+----------------------------+------+------------+--------------+--------+--------------------+--------+";
        System.out.printf(format, student.getDNI(), student.getName() + " " + student.getFirstSurname() + " " + student.getSecondSurname(), student.getAge(), student.getBirthday(), student.getSubject1(), student.getMark1(), student.getSubject2(), student.getMark2());
        System.out.println(separator);
    }

    public static void listHeaderStudents() {
        String format = "| %-9s | %-26s | %-4s | %-10s | %-12s | %-6s | %-18s | %-6s |\n";
        String separator = "+-----------+----------------------------+------+------------+--------------+--------+--------------------+--------+";
        System.out.println(separator);
        System.out.printf(format, "DNI", "NOMBRE ALUMNO", "EDAD", "FECHA NAC.", "ASIGNATURA 1", "NOTA 1", "ASIGNATURA 2", "NOTA 2");
        System.out.println(separator);
    }
    public static void separator(){
        String separator = "+-----------+----------------------------+------+------------+--------------+--------+--------------------+--------+";
        System.out.println(separator);
    }
}


