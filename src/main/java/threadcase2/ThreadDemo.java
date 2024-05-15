package threadcase2;

/**
 * @ClassName: ThreadDemo
 * @Description:
 * @Author: 熊壮壮
 * @CreateTime: 2024/05/14 18:25
 * @Version: 1.0
 **/

public class ThreadDemo {
    public static void main(String[] args) {
        /**
         * 多线程启动的第二种方式  ：
         * 1.自己定义一个类实现Runnable接口
         * 2.重写run()方法
         * 3.创建自己类的对象
         * 4.创建Thread类对象，并开启线程
         */
        MyThread myRun = new MyThread();

        Thread t1 =new Thread(myRun);

        t1.setName("Thread1");

        t1.start();
    }
}
