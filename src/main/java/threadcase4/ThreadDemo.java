package threadcase4;

/**
 * @ClassName: ThreadDemo
 * @Description:
 * @Author: 熊壮壮
 * @CreateTime: 2024/05/15 17:05
 * @Version: 1.0
 **/

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }


}
