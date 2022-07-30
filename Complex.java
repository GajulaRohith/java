public class Complex {
    int real,imag;
    Complex(){ }
    Complex(int real,int imag)
    {
        this.real=real;
        this.imag=imag;
    }
    void display()
    {
        System.out.println(real+"+"+imag+"i");
    }
    Complex Sum(Complex c1,Complex c2)
    {
        Complex res=new Complex();
        res.real=c1.real+c2.real;
        res.imag=c1.imag+c2.imag;
        return res;
    }
}
class Demo
{
    public static void main(String args[])
    {
        Complex c1=new Complex(2,3);
        Complex c2=new Complex(2,13);
        Complex c3=new Complex();
        c3=c3.Sum(c1,c2);
        c1.display();
        c2.display();
        System.out.println("The addition of two complex numbers :");
        c3.display();
    }
}
