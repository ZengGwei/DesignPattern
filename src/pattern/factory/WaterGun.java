package pattern.factory;

/**
 * 〈玩具水枪〉
 *
 * @author gw.Zeng
 * @create 2018/6/16
 * @since 1.0.0
 */
public class WaterGun extends ChildrensToys implements Toys{
    @Override
    public String getName() {
        return "玩具水枪";
    }
}
