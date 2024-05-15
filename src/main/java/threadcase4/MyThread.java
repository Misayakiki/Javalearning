package threadcase4;

import java.util.Objects;

/**
 * @ClassName: MyThread
 * @Description:
 * @Author: 熊壮壮
 * @CreateTime: 2024/05/15 16:54
 * @Version: 1.0
 **/

public class MyThread extends Thread {
    //static表示类的所有对象都共享ticket这个数据
    static int ticket = 0;

    /**锁对象可以是任何对象，但是要注意：
     * 锁对象一定要是唯一的，不然不同的锁没有意义,这里用MyThread.class字节码文件对象class来当做唯一对象
     */
    //static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (ticket < 100) {
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName()+"正在卖第" + ticket + "张票");
                }
                else {
                    break;
                }
            }
        }
    }
}
