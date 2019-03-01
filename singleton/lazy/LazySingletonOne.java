package pattern.singleton.lazy;

/**
 * 〈懒汉式单例 一〉
 *单例模式
 * 特点：
 *   1.外部需要时 才实例化，延迟对象。
 *   2.线程不安全
 * @author gw.Zeng
 * @create 2018/6/15
 * @since 1.0.0
 */
public class LazySingletonOne {

    public LazySingletonOne() {
    }

    private  static LazySingletonOne lazy = null; //静态块，公共内存区域

    public LazySingletonOne getInstance(){
        if (lazy == null){                      //缺点,当两个线程同时进入 if ,不安全
            lazy = new LazySingletonOne();
        }
        return lazy;
    }

}
