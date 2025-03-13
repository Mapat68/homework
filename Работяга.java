package работяга;

import работяга.Worker.OnTaskDoneListener;

public class Работяга {

    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        Worker worker = new Worker(listener);
        worker.start();
    }

}
