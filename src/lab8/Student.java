package lab8;
import java.util.*;

public class Student implements Comparable<Student> {

    private String name;
    private String surname;
    private long id;
    private double averageGrade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public Student(String name, String surname, long id, double averageGrade) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.averageGrade = averageGrade;
    }

    @Override
    public int compareTo(Student o) {
        if(this.getAverageGrade() == o.getAverageGrade()){
            if (surname.equals(o.surname)) {
                return name.compareTo(o.name);
            } else {
                return surname.compareTo(o.surname);
            }
        } else if(this.getAverageGrade() > o.getAverageGrade()){
            return 1;
        } else return -1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", averageGrade=" + averageGrade +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Johnny", "Test", 5, 7.33);
        Student s2 = new Student("Stefan", "Ghe", 3, 6);
        Student s3 = new Student("Bonel", "Test", 2, 7.33);
        Student s4 = new Student("Madison", "Beer", 1, 7.33);
        Student s5 = new Student("Tzanca", "Uraganu", 4, 9);

        ArrayList<Student> students = new ArrayList<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        System.out.println("Sortare crescator dupa medie/surname/name folosind Comparable:");
        System.out.println(" ");

        Collections.sort(students);
        for(Student s : students) {
            System.out.println(s);
        }

        System.out.println(" ");
        System.out.println("Sortare descrescator dupa medie folosind Comparator:");
        System.out.println(" ");

        Collections.sort(students, (o1, o2) -> (int) (o2.getAverageGrade() - o1.getAverageGrade()));
        for(Student s : students) {
            System.out.println(s);
        }


        Comparator<Student> comp = new CompID();

        PriorityQueue<Student> studentsQ = new PriorityQueue<>(comp);
        studentsQ.addAll(students);

        System.out.println(" ");
        System.out.println("Sortare crescator dupa id folosind Lambda:");
        System.out.println(" ");

        for(Student s : studentsQ) {
            System.out.println(s);
        }

        System.out.println(" ");

        HashMap<Student, LinkedList<String>> materii = new HashMap<Student, LinkedList<String>>();
        LinkedList<String> m1 = new LinkedList<String>();
        LinkedList<String> m2 = new LinkedList<String>();
        LinkedList<String> m3 = new LinkedList<String>();
        LinkedList<String> m4 = new LinkedList<String>();
        LinkedList<String> m5 = new LinkedList<String>();
        m1.add("Romanian");
        m1.add("Sports");
        m1.add("Maths");
        m2.add("Maths");
        m2.add("Biology");
        m2.add("Chemistry");
        m3.add("Sports");
        m3.add("Geography");
        m3.add("History");
        m4.add("English");
        m4.add("Music");
        m4.add("Psychology");
        m5.add("Mainele");
        m5.add("Mate");
        m5.add("Romina");
        materii.put(s1, m1);
        materii.put(s2, m2);
        materii.put(s3, m3);
        materii.put(s4, m4);
        materii.put(s5, m5);
        for(Map.Entry intrareMaterie : materii.entrySet()) {
            System.out.println(intrareMaterie.getKey() + " has the following subjects: " + intrareMaterie.getValue());
        }

        System.out.println(" ");

        TreeSet<Integer> nrPare = new AddEvenNR();
        nrPare.add(5);
        nrPare.add(6);
        nrPare.add(4);
        nrPare.add(2);
        nrPare.add(1);
        nrPare.add(3);

        Iterator<Integer> i = nrPare.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
        //LinkedhashSet conservă ordinea în care au fost introduse elementele
        //HashSet are ordinea elementelor total aleatoare
        //TreeSet ordoneaza elementele crescator
    }
}
