package pattern.singleton.seriable;

import java.io.Serializable;

/**
 * 〈反序列化 破坏单例〉
 *
 * @author gw.Zeng
 * @create 2018/6/15
 * @since 1.0.0
 */
public class SerializableSingleton implements Serializable{
    //反序列化时导致单例破坏

    private   static  final SerializableSingleton SERIABLE_SINGLETON =new SerializableSingleton();

    public SerializableSingleton() {
    }

    public static SerializableSingleton getInstance(){
        return SERIABLE_SINGLETON;
    }

}
