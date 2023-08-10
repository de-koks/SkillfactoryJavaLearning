package Module28Collections.ProducerConsumer;
/*
This program is an example of using FIFO (First in - First out) algorithm for the Queue entity.
 */
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        int numberOfTasks = 5; //there will be no more than 5 tasks in the list
        Queue toDoQueue = new ArrayDeque(numberOfTasks); //the list creation
        Boss boss = new Boss(toDoQueue); //the boss creation with a link to the task list
        Worker worker = new Worker(toDoQueue); //the worker creation with a link to the task list

        for (int i = 1; i <= numberOfTasks; i++){ //the boss assigns tasks in the cycle
            boss.giveTask(" Task #" + i);
        }

        System.out.println("The manager has completed tasks assignment.");

        //we tell the worker to execute the tasks
        // let us tell him to do one task more than there are in the queue
        for (int i = 1; i <= numberOfTasks + 1; i++){
            worker.takeTask();
        }
    }
}
