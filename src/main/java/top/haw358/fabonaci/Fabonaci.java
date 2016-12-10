package top.haw358.fabonaci;

/**
 * Created by Administrator on 2016-12-10.
 */
public class Fabonaci {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        long starTime = System.currentTimeMillis();
        fabonaci(100);
        long endTime = System.currentTimeMillis();
        long Time = endTime - starTime;
        System.out.println(endTime);
        System.out.println(starTime);
        System.out.println(Time);
    }

    public static long fabonaci(int n) {
        long a = 0;
        long b = 1;
        long c = -1;
        if (n < 2) {

        } else {
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
                System.out.println(c);
            }
        }
        return c;
    }
}
