package pattern.factory.abstroctFactory;

import pattern.factory.Toys;

/**
 * 〈抽象工厂方法〉
 * 抽象工厂是用户的主入口
 * 在Spring中应用得最为广泛的一种设计模式易于扩展
 * @author gw.Zeng
 * @create 2018/6/16
 * @since 1.0.0
 */
public abstract class AbstractFactory {
    /**
     * 获的 小黄鸭
     * @return
     */
    public abstract Toys getBathDuck();
    /**
     *获的 泰迪熊
     * @return
     */
    public abstract Toys getDeddyBear();
    /**
     *获的 乐高积木
     * @return
     */
    public abstract Toys getLegoBlocks();

    //公共的逻辑
    //方便于统一管理

}
