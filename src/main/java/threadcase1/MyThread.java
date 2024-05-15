package threadcase1;

/**
 * @ClassName: ThreadCase1.MyThread
 * @Description: 创建线程方法1
 * @Author: 熊壮壮
 * @CreateTime: 2024/05/14 18:05
 * @Version: 1.0
 **/

public class MyThread extends  Thread{
    @Override
    public void run() {
        /*
        书写run()方法需要执行的代码
         */
        for (int i = 0; i <100 ; i++) {
            System.out.println(getName() +" hello world!");
        }
    }
}
