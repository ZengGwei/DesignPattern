package pattern.strategy.travel;

import pattern.strategy.TravelState;

/**
 * 〈策略模式〉
 *
 * @author gw.Zeng
 * @create 2018/6/20
 * @since 1.0.0
 */
public interface Traffic {

    TravelState trip(String userId,String ticket);
}
