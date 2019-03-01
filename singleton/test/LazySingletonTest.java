package pattern.singleton.test;

import pattern.singleton.lazy.LazySingletonThree;
import pattern.singleton.lazy.LazySingletonTwo;

import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;

/**
 * 〈懒汉式单例 测试〉
 *
 * @author gw.Zeng
 * @create 2018/6/15
 * @since 1.0.0
 */
public class LazySingletonTest {

    public static void main(String[] args) {

        //静态类部类 懒汉式单例 破坏测试
        try {
            Class<?> lazyClass = LazySingletonThree.class;
            //通过反射 拿到构造器
            Constructor<?> declaredConstructor = lazyClass.getDeclaredConstructor();

            declaredConstructor.setAccessible(true);

            Object obj1 = declaredConstructor.newInstance();
            Object obj2 = declaredConstructor.newInstance();

            System.out.println(obj1 == obj2);//没有构造器内代码块，此处为false,出现多个实例。

        } catch (Exception e) {
            e.printStackTrace();
        }


        //线程安全测试
        int count = 20000;
        CountDownLatch latch = new CountDownLatch(count);
        long strat = System.currentTimeMillis();
        for (int i=0;i<count;i++){
            new Thread(){
                @Override
                public void run() {
                    try {

                        latch.await(); //所有线程 阻塞与此；

                        LazySingletonTwo lazySing = LazySingletonTwo.getInstance();
                        System.out.println(lazySing);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();

            //计数
            latch.countDown();

        }
        long end = System.currentTimeMillis();
        System.out.println("耗时:"+(end-strat));

    }

}
