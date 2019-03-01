package pattern.factory.test;

import pattern.factory.simpleFactory.SimpleFactory;

/**
 * 工厂方法模式
 * 〈简单工厂测试〉
 * 优点：简单工厂模式能够根据外界给定的信息，决定究竟应该创建哪个具体类的对象。明确区分了各自的职责和权力，有利于整个软件体系结构的优化。
   缺点：很明显工厂类集中了所有实例的创建逻辑，容易违反GRASPR的高内聚的责任分配原则
 * @author gw.Zeng
 * @create 2018/6/16
 * @since 1.0.0
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        //小作坊式的生产模式
        //用户本身不再关心生产的过程，而只需要关心这个结果
        System.out.println(factory.getToy("BathDuck"));
    }

}
