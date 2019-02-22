package pattern.factory.factoryMethod;

import pattern.factory.DeddyBear;
import pattern.factory.Toys;

/**
 * 〈〉
 *
 * @author gw.Zeng
 * @create 2018/6/16
 * @since 1.0.0
 */
public class DeddyBearFactory implements ToysFactory {
    @Override
    public Toys getToy() {
        return new DeddyBear();
    }
}
