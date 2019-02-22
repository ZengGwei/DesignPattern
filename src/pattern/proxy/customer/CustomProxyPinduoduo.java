package pattern.proxy.customer;

import pattern.proxy.staticproxy.Factory;
import java.lang.reflect.Method;

/**
 * 〈JDK代理（拼夕夕夕夕）〉
 *
 * @author gw.Zeng
 * @create 2018/6/18
 * @since 1.0.0
 */
public class CustomProxyPinduoduo implements CustomInvocationHandler{

    //被代理的对象，把引用给保存下来
    private Factory target;

    //获取代理对象
    public  Object getInstance(Factory target) throws Exception{
        this.target = target;
        Class<?> clazz = target.getClass();
        //新对象时字节码重组来实现的
        return  CustomProxy.newProxyInstance(new CustomClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("拼夕夕：你要采购原料...");
        System.out.println("拼夕夕：正在匹配符合要求的商家....");
        Object invoke = method.invoke(target, args);
        System.out.println("拼夕夕：合适就成交....");

        return invoke;
    }
}
