package www.itheima.math;

public class Test2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10000; i++) {
            if(i < 10){
                if ((i * i * i) % 10 == i){
                    System.out.println(i);
                    sum++;
                }
            } else if (i < 100){
                if ((i * i * i) % 100 == i){
                    System.out.println(i);
                    sum++;
                }
            } else if (i < 1000){
                if ((i * i * i) % 1000 == i){
                    System.out.println(i);
                    sum++;
                }
            } else if (i < 10000){
                if ((i * i * i) % 10000 == i){
                    System.out.println(i);
                    sum++;
                }
            }

        }
        System.out.println(sum);
    }
}
