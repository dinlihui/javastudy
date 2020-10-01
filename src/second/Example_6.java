package second;

import java.util.Arrays;

public class Example_6 {
    public static void main (String args[]){
        int [] a = {10,20,30,40,50,60},b,c,d;
        b = Arrays.copyOf(a,10);
        System.out.println("数组a的各个元素的值:");
        System.out.println(Arrays.toString(a));

    }
}
