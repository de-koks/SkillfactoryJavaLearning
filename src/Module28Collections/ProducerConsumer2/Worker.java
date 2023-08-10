package Module28Collections.ProducerConsumer2;

import java.util.Deque;

public class Worker {
    private Deque toDoDeque;
    public Worker(Deque toDoDeque){
        this.toDoDeque = toDoDeque;
    }
    public void takeTask(){
        Object task = toDoDeque.pollLast(); //worker take the last task in the queue
        if (task != null){
            System.out.println("Task executing: " + task);
        } else {
            System.out.println("All tasks are completed.");
        }
    }
}
