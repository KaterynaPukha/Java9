package pack1;

public class Main {

    public static void main(String[] args) {
        int a,b;
        int x = 67;
       int y = 3;
       System.out.println(x+y);
       System.out.println(x-y);
       System.out.println(x*y);
       System.out.println("Частное от диление" +  (double)x/y);
       a=x++;
       b=++x;
       System.out.println (a);
       System.out.println (b);
       x--;
       --x
    }
}
