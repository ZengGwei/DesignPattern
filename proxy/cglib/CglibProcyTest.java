package pattern.proxy.cglib;

import pattern.proxy.staticproxy.AlibabaProxy;
import pattern.proxy.staticproxy.Factory;
import pattern.proxy.staticproxy.ShoeFactory;

/**
 * 〈代理模式〉
 *
 * @author gw.Zeng
 * @create 2019/2/22
 * @since 1.0.0
 */
public class CglibProcyTest {
    public static void main(String[] args) {

        ShoeFactory factory = null;
        try {
            factory = (ShoeFactory) new CglibProxy().getInstance(ShoeFactory.class);
            factory.buyRawMaterial();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

}
