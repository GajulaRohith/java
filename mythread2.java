public class mythread2 implements Runnable{
    public void run()
    {
        System.out.println("Thread is running using runnable interface");
    }
    public static void main(String[] args)
    {
        Thread m1=new Thread(new mythread2());
        m1.start();
    }
}
