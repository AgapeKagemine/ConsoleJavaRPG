package rpg;

public class gachatest{

    public static void main(String[] args) {
        new gachatest();
    }

    public gachatest() {
        for(int x = 0; x < 10; x++){    
            Thread t = new Thread(new rng());

            t.start();

            try {
                t.join();
            } catch (Exception e) {
                System.out.println("Thread Interrupted!");
            }
        }
    }

}

class rng implements Runnable{
    java.util.Random rng = new java.util.Random();

    @Override
    public void run(){
        try {
            System.out.println(Thread.currentThread().getName() + ": " + rng.nextInt(1000));
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println("Error at Thread: " + Thread.currentThread().getName());
        }
    }
    
}