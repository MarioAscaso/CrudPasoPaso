package organizer;

import student.Student;

public class Comparator {


    public boolean isFirstWordGreaterThanTheSecondA(Student student1, Student student2) {
        boolean isFirstWordGreaterThanTheSecond = false;

        char[] lettersOfSurname1 = student1.getFirstSurname().toCharArray();
        char[] lettersOfSurname2 = student2.getFirstSurname().toCharArray();

        if (lettersOfSurname1[0] < lettersOfSurname2[0]) {
            isFirstWordGreaterThanTheSecond = true;
        } else {
            if (lettersOfSurname1[0] == lettersOfSurname2[0]) {
                if (lettersOfSurname1[1] < lettersOfSurname2[1]) {
                    isFirstWordGreaterThanTheSecond = true;
                } else {
                    if (lettersOfSurname1[1] == lettersOfSurname2[1]) {
                        if (lettersOfSurname1[2] < lettersOfSurname2[2]) {
                            isFirstWordGreaterThanTheSecond = true;
                        }
                    }
                }
            }
        }
        return isFirstWordGreaterThanTheSecond;
    }

    public boolean isFirstWordGreaterThanTheSecondB(Student student1, Student student2) {
        boolean isFirstWordGreaterThanTheSecond = false;

        char[] lettersOfSurname1 = student1.getSecondSurname().toCharArray();
        char[] lettersOfSurname2 = student2.getSecondSurname().toCharArray();

        if (lettersOfSurname1[0] < lettersOfSurname2[0]) {
            isFirstWordGreaterThanTheSecond = true;
        } else {
            if (lettersOfSurname1[0] == lettersOfSurname2[0]) {
                if (lettersOfSurname1[1] < lettersOfSurname2[1]) {
                    isFirstWordGreaterThanTheSecond = true;
                } else {
                    if (lettersOfSurname1[1] == lettersOfSurname2[1]) {
                        if (lettersOfSurname1[2] < lettersOfSurname2[2]) {
                            isFirstWordGreaterThanTheSecond = true;
                        }
                    }
                }
            }
        }
        return isFirstWordGreaterThanTheSecond;
    }

}
