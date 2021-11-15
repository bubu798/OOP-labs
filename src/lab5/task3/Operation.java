package lab5.task3;

public class Operation implements Minus, Plus, Div, Mult{
    public float rezultat;
    public Operation(float rezultat){
        this.rezultat = rezultat;
    }
    public void mult(float number){
        rezultat *= number;
    }
    public void div(float number){
        if (number > 0)
            rezultat /= number;
    }
    public void minus(float number) {
        rezultat -= number;
    }
    public void plus(float number) {
        rezultat += number;
    }
}
