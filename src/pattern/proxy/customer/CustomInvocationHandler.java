package pattern.proxy.customer;

import java.lang.reflect.Method;

/**
 * 〈自定义 调节处理器〉
 *代理模式
 * @author gw.Zeng
 * @create 2018/6/18
 * @since 1.0.0
 */
public interface CustomInvocationHandler {
    Object invoke(Object proxy, Method method,Object[] args) throws Throwable;
}
