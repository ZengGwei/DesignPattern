package pattern.strategy.travel;

import pattern.strategy.TravelState;

/**
 * 〈火车〉
 *
 * @author gw.Zeng
 * @create 2018/6/20
 * @since 1.0.0
 */
public class TrainTravel implements Traffic{
    @Override
    public TravelState trip(String userId, String ticket) {
        System.out.println("正在验证旅客信息...");
        System.out.println("正在验证火车票信息...");
        System.out.println("验证通过...");

        return new TravelState(200,"验证成功",null);
    }
}
