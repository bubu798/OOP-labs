package lab1.task2;

public class Course {
    private String title;
    private String description;
    private Student[] students;

    public Course(String title, String description, Student[] students) {
        this.title = title;
        this.description = description;
        this.students = students;
    }

    Student[] filterYear(int year) {
        int sz = 0;
        Student[] filtered = new Student[this.students.length];
        for (Student stud : students) {
            if (stud.getYear() == year) {
                filtered[sz] = stud;
                ++sz;
            }
        }
        return filtered;
    }
}
