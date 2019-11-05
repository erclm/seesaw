import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person willma = new Person("willma", 1.5, 7, false);
        Person fred = new Person("fred", 1.0, 1, true);
        Semaphore s1 = new Semaphore(1);
        Semaphore s2 = new Semaphore(1);

        compute t1 = new compute();
        compute t2 = new compute();

            try {
                t1.run(fred, willma, s1, s2);
                t1.wait(1000);
                t2.run(willma, fred, s2, s1);
                t2.wait(1000);


                t1.join();
                t2.join();
            } catch (Exception e) {
                e.printStackTrace();
            }

    }
}
