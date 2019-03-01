package pattern.proxy.staticproxy;

/**
 * 〈代理模式〉
 *
 * @author gw.Zeng
 * @create 2018/6/18
 * @since 1.0.0
 */
public class ShoeFactory implements Factory{

    @Override
    public void buyRawMaterial() {
        System.out.println("我是制鞋厂，我要采购原料！");
    }

    @Override
    public void sellGoods() {
        System.out.println("我是制鞋厂,去库存，卖鞋！");
    }
}
