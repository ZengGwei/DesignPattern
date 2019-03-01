package pattern.singleton.hunger;

/**
 * 〈饿汉式单例〉
 *单例模式
 * 特点：
 *  1.饿汉式单例 在类加载时 就初始化了，并创建 单例对象。
 *  2.线程绝对安全，不存在任何线程安全问题。
 *  3.相较于 其他单例 ，执行效率比较高。
 *  4.缺点 就是 不管用不用 都占着内存，浪费内存空间。
 * @author gw.Zeng
 * @create 2018/6/15
 * @since 1.0.0
 */
public class HungerSingleton {
    //先静后动，先属性后方法
    private  static final  HungerSingleton hunger = new HungerSingleton();

    public HungerSingleton() {
    }

    public  HungerSingleton getInstance(){
        return hunger;
    }


}
