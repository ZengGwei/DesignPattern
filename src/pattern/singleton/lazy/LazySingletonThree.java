package pattern.singleton.lazy;

/**单例模式
 * 〈懒汉式单例 三〉
 *
 * 特点：
 *   1. 利用 静态内部类的  特点：外部类调用时，才加载的特性。
 *   2.兼顾了 饿汉式 的性能浪费，同时避免了 synchronized 的性能不足。
 *
 * @author gw.Zeng
 * @create 2018/6/15
 * @since 1.0.0
 */
public class LazySingletonThree {

    private static boolean initialized = false ;

    public LazySingletonThree() {//防止 单例 被反射侵犯，只准初始化一次
        synchronized (LazySingletonThree.class){
            if (initialized == false){
                initialized = !initialized;
            }else {
                throw  new RuntimeException("单例被侵犯！");
            }
        }
    }

    //static 使单例的空间共享
    //final 防止重写，重载
    public static final LazySingletonThree getInstance(){
        return LazyHolder.lazy;
    }

    //默认 不加载
    private  static class LazyHolder {
        private  static final  LazySingletonThree lazy = new LazySingletonThree();
    }

}
