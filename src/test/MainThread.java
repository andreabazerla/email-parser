package test;

public class MainThread {

  public static void main(String[] args) {

    long start = System.currentTimeMillis();
    System.out.println("Start: " + start);

    SharedThread shared = new SharedThread(10 * 1000);
    
    Thread t1 = new Thread(new MyThread("T1", shared));
    Thread t2 = new Thread(new MyThread("T2", shared));
    
    t1.start();
    t2.start();
    shared.start();

    while (t1.isAlive() && t2.isAlive()) {

    }
    
    System.out.println(
        "End: " + System.currentTimeMillis() + " (" + (System.currentTimeMillis() - start) + ")");

  }
}
