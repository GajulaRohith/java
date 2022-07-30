public class InstanceVar {
    int a=5;
    void add()
    {
     a=a+5;
     System.out.println("a= "+a);
    }
     void add1()
     {

         System.out.println("a= "+a);
     }
     public static void main(String args[])
     {
         InstanceVar obj=new InstanceVar();
         InstanceVar obj1 = new InstanceVar();
         obj.add();
         obj.add1();
         obj1.add1();
     }


}
