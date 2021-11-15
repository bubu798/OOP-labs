package lab5.task1;
import java.util.Random;

public class RandomOutTask implements Task{
    int result;
    public RandomOutTask() {
        Random random = new Random();
        result = random.nextInt(1000);
    }
    public void execute() {
        System.out.println(result);
    }
}
