package CarSpeed;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.nanoTime();
        carSpeed cs = new carSpeed();
        cs.start();
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}
