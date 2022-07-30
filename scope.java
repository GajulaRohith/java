public class scope {
    public static void main(String[] args)
    {
        int x;
        x=10;
        if(x==10)
        {
            int y=20;
            System.out.println("x and y is "+x+" and "+y);
            x=y+2;
        }
        System.out.println("X is "+x);
    }
}
