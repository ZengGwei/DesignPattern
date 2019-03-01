package pattern.observer.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 〈〉
 *事件的注册和监听
 * @author gw.Zeng
 * @create 2018/7/8
 * @since 1.0.0
 */
public class EventListener {

    //map basically a registry
    private Map<Enum,Event> events= new HashMap<Enum,Event>();

    //注册
    public void addListener(Enum enumType, Object targer, Method callback) {
        //注册事件
        //用反射调用这个方法
        events.put(enumType,new Event(targer,callback));
    }
    protected void tirgger(Enum call){
        if(!this.events.containsKey(call)){
            return;
        }
        Event event = this.events.get(call);
        event.setTrigger(call.toString());
        tirgger(event);

    }

    protected  void tirgger(Event event){
        event.setSource(this);
        event.setTime(System.currentTimeMillis());
        try{
            event.getCallback().invoke(event.getTarger(),event);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
