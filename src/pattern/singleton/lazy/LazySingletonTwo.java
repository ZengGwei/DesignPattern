package pattern.singleton.lazy;

/**
 * 〈懒汉式单例 二〉
 *
 * 特点：
 *   1.外部需要时 才实例化，延迟对象。
 *   2.线程安全,效率低
 * @author gw.Zeng
 * @create 2018/6/15
 * @since 1.0.0
 */
public class LazySingletonTwo {

    public LazySingletonTwo() {
    }

    private  static LazySingletonTwo lazy = null; //静态块，公共内存区域

    public static synchronized LazySingletonTwo  getInstance(){
        if (lazy == null){
            lazy = new LazySingletonTwo();
        }
        return lazy;
    }

}
