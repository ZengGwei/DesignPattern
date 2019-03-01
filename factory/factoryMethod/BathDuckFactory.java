package pattern.factory.factoryMethod;

import pattern.factory.BathDuck;
import pattern.factory.Toys;

/**
 * 〈工厂方法模式〉
 *  事情变得越来越专业
 * @author gw.Zeng
 * @create 2018/6/16
 * @since 1.0.0
 */
public class BathDuckFactory implements ToysFactory{
    @Override
    public Toys getToy() {
        return new BathDuck();
    }
}
