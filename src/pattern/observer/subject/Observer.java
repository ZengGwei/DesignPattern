package pattern.observer.subject;

import pattern.observer.core.Event;

/**
 * 〈观察者模式〉
 *
 * @author gw.Zeng
 * @create 2018/7/8
 * @since 1.0.0
 */
public class Observer {

    public void advice(Event e){
        System.out.println("=======触发事件，打印日志=====\n"+e);



    }

}
