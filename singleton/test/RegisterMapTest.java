package pattern.singleton.test;

import pattern.singleton.register.RegisterMap;

import java.util.concurrent.CountDownLatch;

/**
 * 〈注册式单例 测试〉
 *
 * @author gw.Zeng
 * @create 2018/6/15
 * @since 1.0.0
 */
public class RegisterMapTest {

    public static void main(String[] args) {

        int count =200;
        CountDownLatch latch = new CountDownLatch(count);
        for (int i= 0; i<count ;i++){
            new  Thread(){
                @Override
                public void run() {
                    try {
                        latch.await();

                        RegisterMap obj = RegisterMap.getInstance("pattern.singleton.register.RegisterMap");
                        System.out.println(obj);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }.start();

            latch.countDown();
        }

    }


}
