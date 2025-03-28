package organizer;

import student.Student;

public class Comparator {

    public boolean comparatorFirstSurnameByPriorityAlphabetic(Student student1, Student student2){
        boolean goesFirst = false;
        char [] lettersOfSurname1;
        char [] lettersOfSurname2;

        String firstSurname1 = student1.getFirstSurname();
        String firstSurname2 = student2.getFirstSurname();

        lettersOfSurname1 = firstSurname1.toCharArray();
        lettersOfSurname2 = firstSurname2.toCharArray();

        for(int i = 0; i < firstSurname1.length(); i++){
            if(lettersOfSurname1[i] > lettersOfSurname2[i]){
                goesFirst = true;
            }
        }
        return goesFirst;
    }

    public boolean comparatorSecondSurnameByPriorityAlphabetic(Student student1, Student student2){
        boolean goesFirst = false;
        char [] lettersOfSurname1;
        char [] lettersOfSurname2;

        String secondSurname1 = student1.getFirstSurname();
        String secondSurname2 = student2.getFirstSurname();

        lettersOfSurname1 = secondSurname1.toCharArray();
        lettersOfSurname2 = secondSurname2.toCharArray();

        for(int i = 0; i < secondSurname1.length(); i++){
            if(lettersOfSurname1[i] > lettersOfSurname2[i]){
                goesFirst = true;
            }
        }
        return goesFirst;
    }

    public boolean comparatorFirstSurnameByPriorityAlphabeticB(Student student1, String surname){
        boolean goesFirst = false;
        char [] lettersOfSurname1;
        char [] lettersOfSurname2;

        String firstSurname1 = student1.getFirstSurname();

        lettersOfSurname1 = firstSurname1.toCharArray();
        lettersOfSurname2 = surname.toCharArray();

        for(int i = 0; i < firstSurname1.length(); i++){
            if(lettersOfSurname1[i] > lettersOfSurname2[i]){
                goesFirst = true;
            }
        }
        return goesFirst;
    }

}
