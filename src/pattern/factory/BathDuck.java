package pattern.factory;

/**
 * 〈小黄鸭〉
 *
 * @author gw.Zeng
 * @create 2018/6/16
 * @since 1.0.0
 */
public class BathDuck extends ChildrensToys implements Toys{


    @Override
    public String getName() {
        return "小黄鸭";
    }
}
