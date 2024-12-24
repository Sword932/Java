package www.itheima.math;

public class Test3 {
    public static void main(String[] args) {
        int m = 2019;
        int h = 324;
        int sum = 0;
        while (m != 0 && h != 0){
            if(m > h){
                m = m - h;
                sum++;
            }
            if (h > m){
                h = h -m;
                sum++;
            }
            if (h == m){
                h = 0;
                m = 0;
                sum++;
            }
        }
        System.out.println(sum);
    }
}
