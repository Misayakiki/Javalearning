package threadcase1;

/**
 * @ClassName: ThreadCase1.ThreadDemo
 * @Description: threaddemo
 * @Author: 熊壮壮
 * @CreateTime: 2024/05/14 18:01
 * @Version: 1.0
 **/

public class ThreadDemo {
    public static void main(String[] args) {
        /**
         * 创建现成的第一种方法
         * 1.继承Thread类
         * 2.重写run（）方法
         */
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();

        t1.setName("Thread1");
        t2.setName("Thread2");

        /*
        开启线程
         */
        t1.start();
        t2.start();
    }
}
