import java.util.concurrent.Semaphore;

public class Fred extends Thread {

    private Semaphore s1;

    private Semaphore s2;

    public Fred(Semaphore one, Semaphore two){
        this.s1 = one;
        this.s2 = two;
    }

    @Override
    public void run(){
        while(Main.topped <= 10){
            try{
                s1.acquire();
                if(Main.WilmaHeight <= 1 || Main.FredHeight >= 7){
                    //System.out.println("next" + Main.topped);

                    Thread.sleep(1000);
                    Main.topped++;
                    s2.release();
                    continue;
                }else{
                    System.out.print("");//It needs this for some reason for it to run properly...??
                    Main.FredHeight += Main.FredVel;
                    Main.WilmaHeight -= Main.FredVel;
                    System.out.println("Fred's height: " + Main.FredHeight + "    Wilma's height: " + Main.WilmaHeight);
                    s1.release();
                }

                if(Main.FredHeight >= 7){
                    System.out.println("\n===WILMA's GOING UP===");
                }

            }catch (Exception e){
                e.printStackTrace();
            }


        }

    }
}
