package pattern.factory.abstroctFactory;

import pattern.factory.BathDuck;
import pattern.factory.DeddyBear;
import pattern.factory.LegoBlocks;
import pattern.factory.Toys;

/**
 * 〈工厂方法模式〉
 *
 * @author gw.Zeng
 * @create 2018/6/16
 * @since 1.0.0
 */
public class ToysFactory extends AbstractFactory{
    @Override
    public Toys getBathDuck() {
        return new BathDuck();
    }

    @Override
    public Toys getDeddyBear() {
        return new DeddyBear();
    }

    @Override
    public Toys getLegoBlocks() {
        return new LegoBlocks();
    }
}
