package pattern.protortype.simplecopy;

import java.util.List;

/**
 * 〈复制对象〉
 *  1.浅复制
 * @author gw.Zeng
 * @create 2018/6/17
 * @since 1.0.0
 */
public class MonkeySun implements Cloneable{

    public String name;

    public RuYi jingubang =null ;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
