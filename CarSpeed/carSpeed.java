package CarSpeed;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class carSpeed {
    static int limit = 1800;
    public static double currentTime = 0.5;
    public static void start() throws InterruptedException {
        LinkedList<Integer> speed = new LinkedList<>();
        for(int i=0; i<limit; i++) {
            speed.add(randomInt(10,150));
            System.out.println("Current Speed at "+currentTime+"s"+" is "+speed.get(i)+" miles/hr");
            System.out.println("Average Speed at "+currentTime+"s"+" is "+avgSpeed(speed)+" miles/hr");
            System.out.println("Distance covered after "+currentTime+"s"+" is "+distanceCovered(speed.get(i))+" miles");
            System.out.println();
            currentTime+=0.5;
            //TimeUnit.MILLISECONDS.sleep(500);
        }
    }

    public static int avgSpeed(LinkedList<Integer> speed) {
        int sum=0, avg=0;
        for(int j:speed) {
            sum += j;
        }
        avg = (int) (sum/speed.size());
        return avg;
    }

    public static int randomInt(int lowerLimit, int upperLimit) {
        Random rd = new Random();
        return rd.ints(lowerLimit,upperLimit).findFirst().getAsInt();
    }

//    public static double distanceCovered(LinkedList<Integer> speed) {
//        double DistanceCovered = 0;
//
//        for (int k=0; k<speed.size(); k++) {
//            double s = speed.get(k) / 7200.0;
//            //System.out.println(s);
//            DistanceCovered = s * currentTime;
//        }
//        double totalDistanceCovered = 0;
//        totalDistanceCovered += DistanceCovered;
//        return totalDistanceCovered;
//    }

    public static double distanceCovered(int speed) {
        double distanceCovered = 0;
        double speedInSec = speed / 7200.0;
        distanceCovered = speedInSec * currentTime;
        double totalDistanceCovered = 0;
        totalDistanceCovered += distanceCovered;
        return totalDistanceCovered;
    }
}
