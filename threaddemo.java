public class threaddemo implements Runnable{
    public void run()
    {
        System.out.println("Thread class is running");
    }
    public static void main(String[] args)
    {
        threaddemo t1=new threaddemo();
        Thread m1=new Thread(t1);
        m1.start();
    }
}
