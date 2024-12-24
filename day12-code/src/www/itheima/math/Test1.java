package www.itheima.math;

public class Test1 {
    public static void main(String[] args) {
        int sum = 0;
        int temp = 0;
        for (int i = 1; i <= 2019; i++) {
            temp = i;
            while (temp != 0){
                if(temp % 10 == 2 || temp % 10 == 0 || temp % 10 == 1 || temp % 10 == 9){
                    sum = sum + i;
                    break;
                }
                temp = temp / 10;
            }
        }
        System.out.println(sum);
    }
}
