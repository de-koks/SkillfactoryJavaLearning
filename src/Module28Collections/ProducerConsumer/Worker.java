package Module28Collections.ProducerConsumer;

import java.util.Queue;

public class Worker {
    private Queue toDoQueue; //worker has a list of tasks
    public Worker (Queue toDoQueue){ //give a link to the list of tasks while creation
        this.toDoQueue = toDoQueue;
    }

    public void takeTask(){ //worker can take and execute tasks from the list
        Object task = toDoQueue.poll();
        if (task != null) {
            System.out.println("Task execution: " + task);
        } else {
            System.out.println("All tasks are completed.");
        }
    }
}
