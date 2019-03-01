package pattern.observer.subject;

import pattern.observer.core.Event;

import java.lang.reflect.Method;

/**
 * 〈观察者模式〉
 *
 * @author gw.Zeng
 * @create 2018/7/8
 * @since 1.0.0
 */
public class ObserverTest {

    public static void main(String[] args) {

        try {
            Observer obj = new Observer();
            Method advice = obj.getClass().getMethod("advice", new Class<?>[]{Event.class});

            Subject subject =new Subject();
            subject.addListener(SubjectEventType.ON_ADD,obj,advice);

            subject.add();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
