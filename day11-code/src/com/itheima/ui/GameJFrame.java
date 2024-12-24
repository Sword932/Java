package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {

    //创建二维数据，加载图片的时候，根据二维数组中的数据进行加载
    int[][] location = new int[4][4];
    //记录空白方块在二维数组中的位置
    int x;
    int y;
    String path = "";
    String[] pathArr = new String[31];
    String[] pathBeauty = new String[13];
    String[] pathAnimal = new String[8];
    String[] pathSport = new String[10];
    int step = 0;
    int[][] wim = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //创建选项下面的条目对象（重新游戏、）
    JMenuItem beauty = new JMenuItem("美女");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem aboutItem = new JMenuItem("公众号");
    public GameJFrame(){
        //设置游戏界面
        setGameInterface();
        //设置菜单
        setMenu();
        //初始化数据
        initData();
        //随机生成拼图
        randomPath();
        //初始化图片
        initImage();
        //让界面显示出来，建议写在最后
        this.setVisible(true);
    }

    //初始化数据
    private void initData(){
        Random r = new Random();
        //定义数组用来保存图片名
        int[] arrIndex = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int temp;
        //打乱图片顺序
        for (int i = 0; i < arrIndex.length; i++) {
            int index = r.nextInt(0, 16);
            temp = arrIndex[i];
            arrIndex[i] = arrIndex[index];
            arrIndex[index] = temp;
        }
        for (int i = 0; i < arrIndex.length; i++) {
            if(arrIndex[i] == 0){
                x = i / 4;
                y = i % 4;
            }
                location[i / 4][i % 4] = arrIndex[i];
        }
    }
    //随机生成拼图
    private void randomPath() {
        //动物拼图
        for (int i = 0; i < 8; i++) {
            String path1 = "..\\day11-code\\image\\animal\\animal" + (i + 1) + "\\";
            pathArr[i] = path1;
        }
        //美女拼图
        for (int i = 0; i < 13; i++) {
            String path2 = "..\\day11-code\\image\\girl\\girl" + (i + 1) + "\\";
            pathArr[i + 8] = path2;
        }
        //运动拼图
        for (int i = 0; i < 10; i++) {
            String path3 = "..\\day11-code\\image\\sport\\sport" + (i + 1) + "\\";
            pathArr[i + 8 + 13] = path3;
        }
        Random r = new Random();
        //获取随机的拼图地址
        int index = r.nextInt(0,31);
        //随机拼图
        path = pathArr[index];
    }
    private void initImage() {

        //清空原本已经出现的所有图片
        this.getContentPane().removeAll();

        if(victory()){
            //显示胜利的图标
            //创建ImageIcon对象
            ImageIcon vict = new ImageIcon("..\\day11-code\\image\\win.png");
            //创建一个JLabel的对象
            JLabel jtb1 = new JLabel(vict);
            jtb1.setBounds(191, 295, 197,73);
            this.getContentPane().add(jtb1);
//            return;
        }

        //显示计步器
        JLabel stepCount = new JLabel("步数：" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);
        //循环添加所有图片
        for (int j = 0; j < 4; j++ ){
            for (int i = 0; i < 4; i++){
                //获取当前要加载的序号
                int num = location[j][i];
                //创建一个imageIcon的对象
                ImageIcon icon = new ImageIcon(path + num + ".jpg");
                //创建一个JLabel的对象（管理容器）
                JLabel jLabel = new JLabel(icon);
                //指定一个图片的位置
                jLabel.setBounds((i *105) + 83, (j * 105) + 134, 105, 105);
                //给图片添加边框
                //0:让图片凸出来
                //1:让图片凹下去
                jLabel.setBorder(new BevelBorder(1));
                //把管理图片的容器添加到界面中
                this.add(jLabel);
            }
        }

        //添加背景图片
        ImageIcon bg = new ImageIcon("..\\day11-code\\image\\background.png");
        JLabel jbg = new JLabel(bg);
        //设置背景图片的位置
        jbg.setBounds(40, 40, 508, 560);
        this.add(jbg);


        //刷新一下界面
        this.getContentPane().repaint();
    }

    public void setGameInterface() {
        //设置界面的宽高
        this.setSize(595, 705);
        //设置界面的标题
        this.setTitle("拼图单机版V1.0");
        //将游戏界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //取消默认居中
        this.getContentPane().setLayout(null);
        //给整个界面添加键盘事件
        this.addKeyListener(this);
    }
    public void setMenu(){
        //初始化菜单
        //创建整个的菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面的两个选项对象（功能  关于我们）
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
        JMenu alterImage = new JMenu("更换图片");


        //给条目绑定事件
        beauty.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        aboutItem.addActionListener(this);

        //将每一个选项下面的条目添加到选项中
        alterImage.add(beauty);
        alterImage.add(animal);
        alterImage.add(sport);
        functionJMenu.add(alterImage);
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        aboutJMenu.add(aboutItem);

        //将菜单里面的两个选项添加到菜单当中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //按下不松时，会调用这个方法
        int code = e.getKeyCode();
        if(code == (int)'A' || code == (int)'a'){
            this.getContentPane().removeAll();
            //加载第一张，完整的拼图
            ImageIcon all = new ImageIcon( path + "all.jpg");
            JLabel jtb1 = new JLabel(all);
            jtb1.setBounds(83, 134, 105*4,105*4);
            jtb1.setBorder(new BevelBorder(1));
            this.getContentPane().add(jtb1);
            //加载第二张，背景图片
            ImageIcon bg = new ImageIcon("D:\\Java学习\\day11-code\\image\\background.png");
            JLabel jtb2 = new JLabel(bg);
            jtb2.setBounds(40, 40, 508, 560);
            this.getContentPane().add(jtb2);
            //刷新界面
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否胜利，如果胜利，此方法需要直接结束，不能再执行下面的移动代码了
        if(victory()){
            return;
        }
        //对上，下，左，右进行判断
        //左；37 上：38  右：39  下：40
        int code = e.getKeyCode();
        int temp;
        if (code == 37){
            if(y != 3){
                System.out.println("向左移动");
                location[x][y] = location[x][y + 1];
                location[x][y + 1] = 0;
                y++;
                //每移动一次，步数加一次
                step++;
                initImage();
            }
        }
        if (code == 38){
            if(x != 3){
                System.out.println("向上移动");
                location[x][y] = location[x + 1][y];
                location[x + 1][y] = 0;
                x++;
                //每移动一次，步数加一次
                step++;
                initImage();
            }
        } else if (code == 39){
            if(y != 0){
                System.out.println("向右移动");
                location[x][y] = location[x][y - 1];
                location[x][y - 1] = 0;
                y--;
                //每移动一次，步数加一次
                step++;
                initImage();
            }
        } else if (code == 40){
            if(x != 0){
                System.out.println("向上移动");
                location[x][y] = location[x - 1][y];
                location[x - 1][y] = 0;
                x--;
                //每移动一次，步数加一次
                step++;
                initImage();
            }
        } else if(code == (int)'A' || code == (int)'a'){
            initImage();
        } else if(code == (int)'W' || code == (int)'w'){
            location = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            initImage();
        }
    }

    //判断location数组中的数是否跟wim数组中的数据一致
    public boolean victory(){
        for (int i = 0; i < 4; i++) {
            for (int i1 = 0; i1 < 4; i1++) {
                if(wim[i][i1] != location[i][i1]){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if(obj == replayItem){
            //随机拼图
            randomPath();
            //再次打乱二维码中的数据
            initData();
            //计步器清零
            step = 0;
            //重新加载图片
            initImage();
        } else if(obj == reLoginItem){
            //重新登录
            //关闭当前界面
            this.setVisible(false);
            //打开登录界面
            new LoginJFrame();
        } else if(obj == closeItem){
            //关闭游戏
            System.exit(0);

        } else if(obj == aboutItem){
            //创建一个弹框对象
            JDialog jDialog = new JDialog();
            //设置一个管理图片的容器对象JLabel
            JLabel jtb = new JLabel(new ImageIcon("..\\day11-code\\image\\about.png"));
            //设置位置和宽高
            jtb.setBounds(0, 0, 258, 258);
            //把图片添加到弹框当中
            jDialog.getContentPane().add(jtb);
            //给弹框设置大小
            jDialog.setSize(344,344);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭则无法操作下面的界面
            jDialog.setModal(true);
            //让弹框显示出来
            jDialog.setVisible(true);
        } else if (obj == beauty){
            System.out.println("美女拼图");
            //美女拼图
            for (int i = 0; i < 13; i++) {
                String path2 = "..\\day11-code\\image\\girl\\girl" + (i + 1) + "\\";
                pathBeauty[i] = path2;
            }
            Random r = new Random();
            //获取随机的美女拼图地址
            int index = r.nextInt(0,13);
            //随机美女拼图
            path = pathBeauty[index];
            initImage();
        } else if (obj == animal){
            System.out.println("动物拼图");
            //动物拼图
            for (int i = 0; i < 8; i++) {
                String path1 = "..\\day11-code\\image\\animal\\animal" + (i + 1) + "\\";
                pathAnimal[i] = path1;
            }
            Random r = new Random();
            //获取随机的动物拼图地址
            int index = r.nextInt(0,8);
            //随机动物拼图
            path = pathAnimal[index];
            initImage();
        } else if (obj == sport){
            System.out.println("运动拼图");
            //运动拼图
            for (int i = 0; i < 10; i++) {
                String path3 = "..\\day11-code\\image\\sport\\sport" + (i + 1) + "\\";
                pathSport[i] = path3;
            }
            Random r = new Random();
            //获取随机的运动拼图地址
            int index = r.nextInt(0,10);
            //随机运动拼图
            path = pathSport[index];
            initImage();
        }
    }
}
