package www.itheima.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MyJframe extends JFrame implements ActionListener {
    JButton yesBut = new JButton("帅爆了");
    JButton midBut = new JButton("一般般吧");
    JButton noBut = new JButton("不帅，有点磕惨");
    JButton jButton = new JButton("放过我吧，爸爸");

    //判断是否点击过了
    boolean flag = false;
    public MyJframe() {
        //初始化JFrame
        initJFrame();
        //初始化界面
        initView();

        //显示
        this.setVisible(true);
    }
    private void initJFrame(){
        //设置大小
        this.setSize(550,600);
        //关闭模式
        this.setDefaultCloseOperation(3);
        //置顶
        this.setAlwaysOnTop(true);
        //居中
        this.setLocationRelativeTo(null);
        //取消默认
        this.setLayout(null);
    }
    private void initView(){
        this.getContentPane().removeAll();

        //如果发生过点击，则显示按钮
        if (flag ){
            jButton.setBounds(160, 100, 200, 30);
            this.getContentPane().add(jButton);
        }

        JLabel jLabel = new JLabel("你觉得自己帅吗？");
        //设置文字的样式和大小
        jLabel.setFont(new Font("微软雅黑",0, 30));

        jLabel.setBounds(140, 150, 300, 50);

        //设置按钮的位置
        yesBut.setBounds(200, 250, 100, 30);
        midBut.setBounds(200, 300, 100, 30);
        noBut.setBounds(175, 350, 150, 30);

        //给按钮绑定事件
        yesBut.addActionListener(this);
        midBut.addActionListener(this);
        noBut.addActionListener(this);
        jButton.addActionListener(this);
        this.getContentPane().add(yesBut);
        this.getContentPane().add(midBut);
        this.getContentPane().add(noBut);
        this.getContentPane().add(jLabel);

        this.getContentPane().repaint();
    }
    private void showJDialog(String content){
        JDialog jDialog = new JDialog();
        jDialog.setSize(400, 200);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setDefaultCloseOperation(2);
        jDialog.setModal(true);
        jDialog.setTitle("开始惩罚");

        //创建JLabel对象管理文字并添加到弹框当中
        JLabel jLabel = new JLabel(content);
        jLabel.setFont(new Font("微软雅黑", 0, 20));
        jLabel.setBounds(50, 50, 200, 150);
        jDialog.getContentPane().add(jLabel);

        //让弹框展示出来
        jDialog.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == yesBut) {
            showJDialog("XXX，你太自信了，给你一点惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 3600");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            flag = true;
            initView();
        } else if (source == midBut) {
            showJDialog("XXX，你还是太自信了，给你一点小惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 7200");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            flag = true;
            initView();
        } else if (source == noBut) {
            showJDialog("xxx, 你真有自知之明，给你的奖励");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 5400");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            flag = true;
            initView();
        } else if (source == jButton){
            showJDialog("乖儿子，这次就先饶了你，哈哈");
            try {
                Runtime.getRuntime().exec("shutdown -a");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            flag = false;
            initView();
        }
    }
}
