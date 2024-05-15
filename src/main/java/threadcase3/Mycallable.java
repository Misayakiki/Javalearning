package threadcase3;

import java.util.concurrent.Callable;

/**
 * @ClassName: Mycallable
 * @Description:
 * @Author: 熊壮壮
 * @CreateTime: 2024/05/15 10:57
 * @Version: 1.0
 **/

public class Mycallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum+= i;
        }
        return sum;
    }
}
