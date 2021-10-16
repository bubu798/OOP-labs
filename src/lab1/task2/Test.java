package lab1.task2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);

        Student stud1 = new Student("Gigel", 2000);
        Student stud2 = new Student("Gogu", 2002);
        Student stud3 = new Student("Frone", 2000);
        Student stud4 = new Student("Jordache", 1990);

        Student[] students = {stud1, stud2, stud3, stud4};

        Course poo = new Course("POO", "Cea mai tare materie", students);
        System.out.println(Arrays.toString(poo.filterYear(year)));

        Student studX = new Student("TJ Miles", 1989);
        Student studY = new Student("TJ Miles", 1989);

        System.out.println(studX.equals(studY));


    }
}
