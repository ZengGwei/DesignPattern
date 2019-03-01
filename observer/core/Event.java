package pattern.observer.core;

import java.lang.reflect.Method;

/**
 * 〈观察者模式〉
 * 事件
 * @author gw.Zeng
 * @create 2018/7/8
 * @since 1.0.0
 */
public class Event {

    //事件源
    private  Object source;
    //通知目标
    private Object targer;
    //回调
    private Method callback;
    //触发
    private String trigger;

    private long time;

    public Event(Object targer, Method callback) {
        this.targer = targer;
        this.callback = callback;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public void setTarger(Object targer) {
        this.targer = targer;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public Object getSource() {
        return source;
    }

    public Object getTarger() {
        return targer;
    }

    public Method getCallback() {
        return callback;
    }

    public String getTrigger() {
        return trigger;
    }

    @Override
    public String toString() {
        return "Event{" +
                "\n\tsource=" + source +
                ",\n\t targer=" + targer +
                ",\n\t callback=" + callback +
                ",\n\t trigger='" + trigger + '\'' +
                ",\n\t time=" + time +
                '}';
    }
}
