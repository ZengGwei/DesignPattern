package pattern.proxy.jdkdynamicproxy;

import pattern.proxy.staticproxy.Factory;

/**
 * 〈纸巾生产厂〉
 *代理模式
 * @author gw.Zeng
 * @create 2018/6/18
 * @since 1.0.0
 */
public class PaperFactory implements Factory{
    @Override
    public void buyRawMaterial() {
        System.out.println("我需要采购竹子，木材....,价低量大");
    }

    @Override
    public void sellGoods() {
        System.out.println("工厂：一批手纸、餐巾纸、纤维抽纸大量出售....");
    }
}
