package Module28Collections.ProducerConsumer2;
/*
This program is an example of using LiFO (Last in - First out) algorithm for the Queue entity.
 */
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        int numberOfTasks = 5;
        Deque toDoDeque = new ArrayDeque(numberOfTasks);
        Boss boss = new Boss(toDoDeque);
        Worker worker = new Worker(toDoDeque);

        for (int i = 1; i <= numberOfTasks; i++){
            boss.giveTask("Task " + i);
        }

        System.out.println("The manager has finished tasks assignment.");

        for (int i = 1; i<= numberOfTasks + 1; i++){
            worker.takeTask();
        }
    }
}
