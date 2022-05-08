package threads;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        Runnable threadExample = new ThreadExample();
        Thread a=new Thread(threadExample,"Thread Example");
        a.start();
        System.out.println("mai thread finished");

}}
