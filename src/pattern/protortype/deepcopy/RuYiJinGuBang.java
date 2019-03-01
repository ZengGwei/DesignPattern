package pattern.protortype.deepcopy;

import java.io.Serializable;

/**
 * 〈原型模式〉
 *
 * @author gw.Zeng
 * @create 2018/6/17
 * @since 1.0.0
 */
public class RuYiJinGuBang implements Serializable{

    private int h =100;

    private int w = 100;

    public void changeBig(){
        h+=100;
        w+=50;
    }
    public void changeSmall(){
        h-=100;
        w-=50;
    }
}
