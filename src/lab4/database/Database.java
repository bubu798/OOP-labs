package lab4.database;

import lab4.people.Student;
import lab4.people.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private final List<Student> students = new ArrayList<>();
    private final List<Teacher> teachers = new ArrayList<>();

    // TODO: make it Singleton
    private final static Database instance = new Database();

    private Database() {

    }
    public static Database getInstance() {
        return instance;
    }

    public static int getNumberOfInstances() {
        // TODO
        return 0;
    }

    public void addTeachers(List<Teacher> teachers) {
        this.teachers.addAll(teachers);
    }

    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    public List<Teacher> findTeachersBySubject(String subject) {
        // TODO
        return null;
    }

    public Student findAllStudents() {
        // TODO
        for(Student student : students){
            return student;
        }
        return null;
    }

    public Teacher findAllTeachers() {
        // TODO
        for(Teacher teacher : teachers){
            return teacher;
        }
        return null;
    }

    public List<Student> getStudentsBySubject(String subject) {
        // TODO
        List<Student> studentiSub = new ArrayList<>();
        for (Student student: students) {
            if (student.getSubjects().get(subject) != null)
                studentiSub.add(student);
        }
        return studentiSub;
    }

    public List<Student> getStudentsByAverageGrade() {
        // TODO
        return null;
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        // TODO
        List<Student> studentiSub = new ArrayList<>();
        for (Student student: students) {
            if (student.getSubjects().get(subject) != null)
                studentiSub.add(student);
        }
        return studentiSub;
    }
}
