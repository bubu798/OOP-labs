package lab1.task2;

public class Student {
    private String name;
    private Integer year;

    public Student() {
    }

    public Integer getYear() {
        return year;
    }

    public Student(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
