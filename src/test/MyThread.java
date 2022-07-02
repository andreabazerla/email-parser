package test;

public class MyThread implements Runnable {

  private String name;
  private long lastExecution;
  private SharedThread shared;

  public MyThread(String name, SharedThread shared) {
    super();
    this.name = name;
    this.shared = shared;
  }

  @Override
  public void run() {

    lastExecution = System.currentTimeMillis();
    while (!this.shared.isFinished())

      try {

        Thread.sleep(new Double(100 + (Math.random() * 1500)).longValue());

        long now = System.currentTimeMillis();
        System.out
            .println("Thread " + name + " - time:" + now + " - delta: " + (now - lastExecution));

        lastExecution = now;

      } catch (Exception e) {
        System.out.println("Thread " + name + " andato in errore ");
        e.printStackTrace();
      }

  }
}
