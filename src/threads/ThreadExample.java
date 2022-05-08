package threads;

public class ThreadExample implements Runnable {

    @Override
    public void run() {
        System.out.println("daughter thread");
    }
}
