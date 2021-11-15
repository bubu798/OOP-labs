package lab5.task2;
import lab5.task1.Task;

import java.util.ArrayList;

public class Stack implements Container{
    public ArrayList<Task> list = new ArrayList<Task>();
    public void pop() {
        this.list.remove(list.size() - 1);
    }
    public void push(Task task) {
        this.list.add(task);
    }
    public int size(){
        return this.list.size();
    }
    public boolean isEmpty() {
        if(this.list.size() == 0){
            return true;
        }
        return false;
    }

    @Override
    public void transferFrom(Container container) {
        for (Task task: container.list) {
            this.list.add(task);
        }
    }
}
