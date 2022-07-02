package test;

public class SharedThread extends Thread {

  private boolean finished;
  private long time;

  public SharedThread(long time) {
    this.time = time;
    this.finished = false;
  }

  @Override
  public void run() {

    long startExecution = System.currentTimeMillis();
    while (System.currentTimeMillis() - startExecution < time) {}

    finished = true;
  }

  public boolean isFinished() {
    return finished;
  }

}
