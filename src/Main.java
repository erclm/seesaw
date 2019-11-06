import java.util.concurrent.Semaphore;

public class Main {
    static double FredVel = 1.0;
    static double WilmaVel = 1.5;
    static double FredHeight = 1;
    static double WilmaHeight = 7;
    static int topped = 0;

    public static void main(String[] args) {
        Semaphore willmaSemaphore = new Semaphore(1);
        Semaphore fredSemaphore = new Semaphore(1);
        Fred f = new Fred(fredSemaphore, willmaSemaphore);
        Wilma w = new Wilma(fredSemaphore, willmaSemaphore);

        f.start();
        w.start();

        try{
            f.join();
            w.join();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
