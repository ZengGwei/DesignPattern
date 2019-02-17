package pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 〈注册式单例〉--spring中使用
 *
 * @author gw.Zeng
 * @create 2018/6/15
 * @since 1.0.0
 */
public class RegisterMap {
    //线程安全map
    private  static Map<String,Object> register = new ConcurrentHashMap<>();

    public RegisterMap() {
    }

    public static  RegisterMap getInstance(String beanName){
        if (beanName == null){
            beanName = RegisterMap.class.getName();
        }

        if(register.get(beanName) == null){
            register.put(beanName,new RegisterMap());
        }
        return (RegisterMap) register.get(beanName);
    }


}
