package www.itheima.math;

public class Test5 {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            if(i % 5 == 1){
                int one = (i - 1)/5*4;
                if(one % 5 == 2){
                    int two = (one - 2)/5*4;
                    if(two % 5 == 3){
                        int three = (two - 3)/5*4;
                        if(three % 5 == 4){
                            int four = (three - 4)/5*4;
                            if(four % 5 == 0){
                                System.out.println(i);
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
