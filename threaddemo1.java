public class threaddemo1 implements Runnable {
    public void run() {
        System.out.println("Thread is running");
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
    }
        public static void main(String[] args)
        {
          threaddemo1 t1=new threaddemo1();
          Thread m1=new Thread(t1);
          m1.start();
        }
    }

