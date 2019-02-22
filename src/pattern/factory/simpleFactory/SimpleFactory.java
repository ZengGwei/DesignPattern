package pattern.factory.simpleFactory;

import pattern.factory.BathDuck;
import pattern.factory.DeddyBear;
import pattern.factory.LegoBlocks;
import pattern.factory.Toys;

/**
 * 〈简单工厂模式〉
 * 又叫做静态工厂方法（StaticFactory Method）模式，但不属于 23 种设计模式之一。
 * 简单工厂模式的实质是由一个工厂类根据传入的参数，动态决定应该创建哪一个产品类。
 * Spring 中的 BeanFactory 就是简单工厂模式的体现，根据传入一个唯一的标识来获得 Bean 对象，但
 * 是否是在传入参数后创建还是传入参数前创建这个要根据具体情况来定
 *
 * @author gw.Zeng
 * @create 2018/6/16
 * @since 1.0.0
 */
public class SimpleFactory {

    public Toys getToy(String toyName) {
        if ("BathDuck" == toyName) {
            return new BathDuck();
        } else if ("DeddyBear" == toyName) {
            return new DeddyBear();
        } else if ("LegoBlocks" == toyName) {
            return new LegoBlocks();
        } else {
            System.out.println("No such goods");
            return null;
        }

    }

}
