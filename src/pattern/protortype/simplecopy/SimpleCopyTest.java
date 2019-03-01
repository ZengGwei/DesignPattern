package pattern.protortype.simplecopy;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

/**原型模式
 * 〈浅拷贝〉
 *1.浅拷贝，即是赋值拷贝，拷贝对象有引用类型是，引用指向同一个对象。
 * @author gw.Zeng
 * @create 2018/6/17
 * @since 1.0.0
 */
public class SimpleCopyTest {

    public static void main(String[] args) {
        MonkeySun sunxingzhe = new MonkeySun();
        sunxingzhe.name = "孙行者";
        sunxingzhe.jingubang = new RuYi();
        System.out.println(sunxingzhe.jingubang);

        try {
            MonkeySun zhexingsun =(MonkeySun) sunxingzhe.clone();
            System.out.println(zhexingsun.jingubang);
            System.out.println(sunxingzhe.jingubang == zhexingsun.jingubang);//true

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
