package second;

public class Example_2 {
    public static void main (String args[]){
        byte b = 22;
        int n = 129;
        float f = 123456.6789f;
        double d = 12345677.1223455;
        System.out.println("b = "+b);
        System.out.println("n = "+n);
        System.out.println("f = "+f);
        System.out.println("d = "+d);
        b = (byte)n;
        f = (float)d;
        System.out.println("b ="+b);
        System.out.println("f = "+f);
    }
}
