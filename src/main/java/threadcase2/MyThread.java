package threadcase2;

/**
 * @ClassName: MyThread
 * @Description:
 * @Author: 熊壮壮
 * @CreateTime: 2024/05/14 21:10
 * @Version: 1.0
 **/

public class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            Thread t=Thread.currentThread();
            System.out.println(t.getName()+" hello world");
        }
    }
}
