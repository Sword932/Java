package www.itheima.objectdemo;

import java.util.Arrays;

public class User implements Cloneable {
    private int id;
    private String userName;
    private String passWord;
    private String path;
    private int[] data;

    public User() {
    }

    public User(int id, String userName, String passWord, String path, int[] data) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "User{id = " + id + ", userName = " + userName + ", passWord = " + passWord + ", path = " + path + ", data = " + Arrays.toString(data) + "}";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类中的clone方法
        //相当于让java帮我们克隆一个对象，并把克隆之后的对象返回出去。

        //
        int[] data1 = this.data;
        int[] newData = new int[data1.length];
        for (int i = 0; i < data1.length; i++) {
            newData[i] = data1[i];
        }
        //调用父类中的克隆对象
        User u = (User) super.clone();
        //父类方法是浅克隆，替换克隆出来的对象中的数组地址值
        u.data = newData;
        return u;


    }
}
