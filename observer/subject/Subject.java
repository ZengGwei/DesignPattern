package pattern.observer.subject;

import pattern.observer.core.EventListener;

/**
 * 〈观察者模式〉
 *
 * @author gw.Zeng
 * @create 2018/7/8
 * @since 1.0.0
 */
public class Subject extends EventListener{

    //通常的话，采用动态里来实现监控，避免了代码侵入
    public void add(){
        System.out.println("调用添加方法add");

        tirgger(SubjectEventType.ON_ADD);
    }

    public void remove(){
        System.out.println("调用移除方法remove");
        tirgger(SubjectEventType.ON_REMOVE);
    }

}
