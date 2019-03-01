package pattern.factory.test;

import pattern.factory.factoryMethod.BathDuckFactory;
import pattern.factory.factoryMethod.ToysFactory;

/**
 * 〈工厂方法模式〉
 * 优点：相较于简单工厂模式，解耦；是对简单工厂模式解耦的一个体现
 * 缺点：是每增加一个产品类，就需要增加一个对应的工厂类，增加了额外的开发量。
 * @author gw.Zeng
 * @create 2018/6/16
 * @since 1.0.0
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ToysFactory factory = new BathDuckFactory();
        System.out.println(factory.getToy());
    }
}
