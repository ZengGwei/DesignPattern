package pattern.proxy.staticproxy;

/**
 * 〈代理模式〉
 *
 * @author gw.Zeng
 * @create 2018/6/18
 * @since 1.0.0
 */
public class AlibabaProxy {

    private  Factory factory;

    //没办法扩展
    public AlibabaProxy(Factory factory) {
        this.factory = factory ;
    }

    public void buyRawMaterial() {
        this.factory.buyRawMaterial();
        System.out.println("代理：说出符合要求的原料。。。");
        System.out.println("代理：采购...");
    }


    public void sellGoods() {
        this.factory.sellGoods();
        System.out.println("代理：寻找意向顾客.....");
        System.out.println("代理：卖出商品....");
    }
}
