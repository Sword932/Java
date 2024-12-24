package com.itheima.ui;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

public class LoginJFrame extends JFrame implements KeyListener, MouseListener {
    //创建一个集合存放一些测试密码和用户名
    static ArrayList<User> list = new ArrayList<>();
    static {
        list.add(new User("zhangsan","123"));
        list.add(new User("zhangweiwei", "1234"));
    }
    String pathLogin = "..\\day11-code\\image\\login\\登录按钮.png";
    ImageIcon loginImage = new ImageIcon("..\\day11-code\\image\\login\\登录按钮.png");
    ImageIcon registerImage = new ImageIcon("..\\day11-code\\image\\login\\注册按钮.png");
    //用JButton管理按钮图片
    JButton login = new JButton(loginImage);
    JButton register = new JButton(registerImage);
    String yzmNumber = getYzm();
    JLabel jLabel3 = new JLabel();

    //创建文本框
    JTextField jTextUserName = new JTextField();
    JTextField jTextPassWord = new JTextField();
    JTextField jTextYzm = new JTextField();



    //登录界面，跟登录相关代码都写这里
    public LoginJFrame(){
        //初始化界面
        initLoginInterface();
        //美化界面
        initImage();

        //显示界面
        this.setVisible(true);
    }

    private void initLoginInterface(){
        //设置界面的宽高
        this.setSize(488, 430);
        //设置界面的标题
        this.setTitle("拼图游戏V1.0登录");
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面关闭模式
        this.setDefaultCloseOperation(3);
        //设置取消默认
        this.getContentPane().setLayout(null);
    }

    private void initImage(){
        //清空画面
        this.getContentPane().removeAll();
        //显示提示
        ImageIcon userName = new ImageIcon("..\\day11-code\\image\\login\\用户名.png");
        ImageIcon passWord = new ImageIcon("..\\day11-code\\image\\login\\密码.png");
        ImageIcon yzm = new ImageIcon("..\\day11-code\\image\\login\\验证码.png");

        //用JLabel管理用户名、密码、验证码的提示文字
        JLabel jLabel = new JLabel(userName);
        JLabel jLabel1 = new JLabel(passWord);
        JLabel jLabel2 = new JLabel(yzm);

        //给jLabel3添加文字验证码
        jLabel3.setText(yzmNumber);



        //去除按钮边框
        login.setBorderPainted(false);
        register.setBorderPainted(false);
        //去除按钮背景
        login.setContentAreaFilled(false);
        register.setContentAreaFilled(false);
        //给文本框添加键盘事件
        jTextUserName.addKeyListener(this);
        jTextPassWord.addKeyListener(this);
        jTextYzm.addKeyListener(this);

        //给按钮添加鼠标事件
        login.addMouseListener(this);
        register.addMouseListener(this);

        //设置用户名提示和文本框位置
        jLabel.setBounds(127, 149, 47,27);
        jTextUserName.setBounds(187, 149, 187,27);
        //设置密码提示和文本框位置
        jLabel1.setBounds(127, 189, 47,17);
        jTextPassWord.setBounds(187, 189, 187,27);
        //设置验证码提示和文本框位置
        jLabel2.setBounds(127, 229, 56,21);
        jTextYzm.setBounds(187, 229, 67,27);
        jLabel3.setBounds(268, 227, 50,30);
        //设置登录和注册按钮位置
        login.setBounds(127, 269, 128,47);
        register.setBounds(267, 269, 128,47);

        this.getContentPane().add(jLabel);
        this.getContentPane().add(jLabel1);
        this.getContentPane().add(jLabel2);
        this.getContentPane().add(jTextUserName);
        this.getContentPane().add(jTextPassWord);
        this.getContentPane().add(jTextYzm);
        this.getContentPane().add(login);
        this.getContentPane().add(register);
        this.getContentPane().add(jLabel3);

        //添加背景图片
        ImageIcon bg = new ImageIcon("..\\day11-code\\image\\login\\background.png");
        JLabel jLabelBg = new JLabel(bg);
        jLabelBg.setBounds(0,0,470,390);
        this.getContentPane().add(jLabelBg);
        //刷新
        this.getContentPane().repaint();
    }

    //获取验证码
    private String getYzm(){
        Random r = new Random();
        char[] yzm = new char[62];
        char[] endYzm = new char[5];
        for (int i = 0; i < 26; i++){
            yzm[i] = (char)( i + 65);
        }
        for (int i = 0; i < 26; i++){
            yzm[i + 26] = (char)( i + 97);
        }
        for (int i = 0; i < 10; i++){
            yzm[i + 26 + 26] = (char)( i + 48);
        }
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(0, 52);
            endYzm[i] = yzm[index];
        }
        endYzm[4] = yzm[r.nextInt(52, 62)];
        char temp;
        for (int i = 0; i < endYzm.length; i++) {
            int index = r.nextInt(0,5);
            temp = endYzm[i];
            endYzm[i] = endYzm[index];
            endYzm[index] = temp;
        }
        String endyzm = "";
        for (int i = 0; i < endYzm.length; i++) {
            endyzm = endyzm + endYzm[i];
        }
        return endyzm;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
        if(source == login){
            if (jTextYzm.getText().equalsIgnoreCase(yzmNumber)){
                //如果验证码正确继续判断账号和密码是否为空
                if(jTextUserName.getText().equals("")&& jTextPassWord.getText().equals("")){
                }else {
                    //账号密码不为空，则继续判断用户名和密码是否正确
                    for (int i = 0; i < 2; i++) {
                        if(jTextUserName.getText().equals(list.get(i).getUserName()) && jTextPassWord.getText().equals(list.get(i).getPassWord())){
                            System.out.println("我进来了========");
                            //如果都正确，则关闭登录界面
                            this.setVisible(false);
                            //跳转到游戏界面
                            new GameJFrame();
                        }
                    }
                }
            }
        } else if(source == jLabel3){
            System.out.println("点击验证码");
        }
    }
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int source = e.getButton();
//        if(source == 1){
//            //如果点击登录按钮不松，则换成一个深色背景图
//            pathLogin = "..\\day11-code\\image\\login\\登录按钮.png";
//
//        }
//        initImage();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
