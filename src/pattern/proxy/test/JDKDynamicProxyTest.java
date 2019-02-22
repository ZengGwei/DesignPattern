package pattern.proxy.test;

import pattern.proxy.jdkdynamicproxy.JDKProxyPinduoduo;
import pattern.proxy.jdkdynamicproxy.PaperFactory;
import pattern.proxy.staticproxy.Factory;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * 〈jdk动态代理测试〉
 *
 * @author gw.Zeng
 * @create 2018/6/18
 * @since 1.0.0
 */
public class JDKDynamicProxyTest {

    public static void main(String[] args) {
        try {
            Factory factory =(Factory) new JDKProxyPinduoduo().getInstance(new PaperFactory());
            System.out.println(factory.getClass());//打印出：class com.sun.proxy.$Proxy0
            factory.buyRawMaterial();
            //字节码重组过程 原理：
            // 1.拿到被代理对象的引用，通过反射获取 所有的接口
            // 2.JDK proxy 重新生成一个新类 $Proxy0,同时新 的类要实现被代理类 的所有的接口
            // 3.动态生成 java 代码，把新加入的业务逻辑方法由一定的逻辑代码去调用
            // 4.编译 生成新的 .class 文件。
            // 5.重新加载到 JVM 运行。

            //通过反编译看 $Proxy0
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Factory.class});
            FileOutputStream ops = new FileOutputStream("E://$Proxy0.class");
            ops.write(bytes);
            ops.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
