package www.itheima.math;

public class Test4 {
    public static void main(String[] args) {
        int money = 1;
        int day = 1;
        int gongzi = 2;
        while (money < 108){
            money = money + gongzi;
            gongzi = gongzi + 2;
            day++;
        }
        System.out.println(day);
    }
}
