package lab5.task1;

public class CounterOutTask implements Task{
    static int count;
    public CounterOutTask() {
        count++;
    }
    public void execute() {
        System.out.println(count);
    }

}
