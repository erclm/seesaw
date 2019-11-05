import java.util.concurrent.Semaphore;

public class compute extends Thread {

    public compute(){

    }
    public void run(Person a, Person b, Semaphore one, Semaphore two){
        for (int i = 0; i <10 ; i++) {
            try {
                one.acquire();
                System.out.println(a.getName() + "'s height: " + a.getHeight());
                Seesaw s = new Seesaw();
                s.simulate(a,b);
                System.out.println(a.getName() + "'s height: " + a.getHeight());
                two.release();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
