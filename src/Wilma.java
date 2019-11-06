import java.util.concurrent.Semaphore;

public class Wilma extends Thread {
    private Semaphore s1;
    private Semaphore s2;
    public Wilma(Semaphore one, Semaphore two){
        this.s2 = one;
        this.s1 = two;
    }
    @Override
    public void run(){
        while(Main.topped <= 10) {
            try {
                s1.acquire();
                if (Main.FredHeight <= 1 || Main.WilmaHeight >= 7) {
                    //System.out.println("next" + Main.topped);

                    Thread.sleep(1000);
                    s2.release();
                    continue;
                } else {
                    System.out.print("");
                    Main.WilmaHeight += Main.WilmaVel;
                    Main.FredHeight -= Main.WilmaVel;
                    System.out.println("Fred's height: " + Main.FredHeight + "    Wilma's height: " + Main.WilmaHeight);
                    s1.release();
                }
                if(Main.WilmaHeight >= 7){
                    System.out.println("\n===FRED's GOING UP===");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
