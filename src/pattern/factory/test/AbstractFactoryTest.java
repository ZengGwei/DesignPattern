package pattern.factory.test;

import pattern.factory.abstroctFactory.ToysFactory;

/**
 * 工厂方法模式
 * 〈抽象工厂方法测试〉
 *优点：
    抽象工厂模式隔离了具体类的生产，使得客户并不需要知道什么被创建。
    当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
    增加新的具体工厂和产品族很方便，无须修改已有系统，符合“开闭原则”。
 * @author gw.Zeng
 * @create 2018/6/16
 * @since 1.0.0
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {

        ToysFactory factory = new ToysFactory();
        //对于用户而言，更加简单了
        //用户只有选择的权利了，保证了程序的健壮性
        System.out.println(factory.getBathDuck());
    }
}
