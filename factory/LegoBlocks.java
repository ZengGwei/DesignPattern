package pattern.factory;

/**
 * 〈乐高积木〉
 *
 * @author gw.Zeng
 * @create 2018/6/16
 * @since 1.0.0
 */
public class LegoBlocks extends ChildrensToys implements Toys {
    @Override
    public String getName() {
        return "乐高积木";
    }
}
