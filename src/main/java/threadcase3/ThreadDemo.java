package threadcase3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName: ThreadDemo
 * @Description:
 * @Author: 熊壮壮
 * @CreateTime: 2024/05/15 11:00
 * @Version: 1.0
 **/

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /**
         * 多线程的第三种实现方式
         *  特点：可以获取到现场运行的结果
         *  1.创建一个类Mycallable实现Callable接口
         *  2.重写call方法（有返回值，表示多线程运行的结果）
         *  3.创建MyCallable对象（表示多线程要执行的任务）
         *  4.船管FutureTask对象（作用于多线程运行的结果）
         *  5.创建Thread并启动（表示线程
         *
         */
        Mycallable mc = new Mycallable();

        FutureTask<Integer> ft = new FutureTask<>(mc);

        Thread t1 = new Thread(ft);

        t1.start();

        Integer rs = ft.get();
        System.out.println(rs);
    }
}
