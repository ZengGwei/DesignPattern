package pattern.strategy.travel;

import pattern.strategy.TravelState;

/**
 * 〈〉
 *
 * @author gw.Zeng
 * @create 2018/6/20
 * @since 1.0.0
 */
public class AirTravel implements Traffic{
    @Override
    public TravelState trip(String userId, String ticket) {
        System.out.println("正在验证旅客信息...");
        System.out.println("正在验证机票信息...");
        System.out.println("验证通过...");

        return new TravelState(200,"验证成功",null);
    }
}
