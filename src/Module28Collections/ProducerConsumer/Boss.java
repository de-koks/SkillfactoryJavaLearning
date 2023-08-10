package Module28Collections.ProducerConsumer;

import java.util.Queue;

public class Boss {
    private Queue toDoQueue; //boss has a list of tasks
    public Boss(Queue toDoQueue){ //give a link to the list of tasks while creation
        this.toDoQueue = toDoQueue;
    }
    public void giveTask(String task){ //boss can assign tasks to the list
        toDoQueue.add(task);
        System.out.println("Task assignment: " + task);
    }
}
