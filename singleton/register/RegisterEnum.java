package pattern.singleton.register;

import org.omg.CORBA.PUBLIC_MEMBER;

/**单例模式
 * 〈单例-枚举实现〉
 *
 * @author gw.Zeng
 * @create 2018/6/15
 * @since 1.0.0
 */
public enum RegisterEnum {
    WHITE{
        private int r =255;
        private int g = 0;
        private int b = 0;
    },BLACK{},BUIE{};

    public void getInstance(){}
}
