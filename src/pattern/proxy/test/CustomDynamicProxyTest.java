package pattern.proxy.test;

import pattern.proxy.customer.CustomProxyPinduoduo;
import pattern.proxy.jdkdynamicproxy.PaperFactory;
import pattern.proxy.staticproxy.Factory;

/**
 * 〈自定义动态代理测试〉
 *
 * @author gw.Zeng
 * @create 2018/6/18
 * @since 1.0.0
 */
public class CustomDynamicProxyTest{
    public static void main(String[] args)  {
        CustomProxyPinduoduo proxy = new CustomProxyPinduoduo();
        try {
             long str = System.currentTimeMillis();
            Factory factory =(Factory) proxy.getInstance(new PaperFactory());
            factory.buyRawMaterial();
            System.out.println("耗时："+(System.currentTimeMillis() - str) +"ms");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
