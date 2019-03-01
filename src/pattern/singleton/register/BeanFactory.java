package pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**单例模式
 * 〈spring中实现单例 采用注册式 〉
 *
 * @author gw.Zeng
 * @create 2018/6/15
 * @since 1.0.0
 */
public class BeanFactory {

    public BeanFactory() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String name) {

        if (!ioc.containsKey(name)) {
            Object obj = null;
            try {
                obj = Class.forName(name).newInstance();
                ioc.put(name, obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return obj;
        } else
            return ioc.get(name);
    }

}
