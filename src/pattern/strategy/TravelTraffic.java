package pattern.strategy;

import pattern.strategy.travel.TravelType;

/**策略模式
 * 〈出行交通〉
 *
 * @author gw.Zeng
 * @create 2018/6/20
 * @since 1.0.0
 */
public class TravelTraffic {

    private String userId;
    private String ticket;

    public TravelTraffic(String userId, String ticket) {
        this.userId = userId;
        this.ticket = ticket;
    }

    //这个参数，完全可以用交通 Traffic这个接口来代替
    //为什么？

    //完美地解决了switch的过程，不需要在代码逻辑中写switch了
    //更不需要写if    else if
    public TravelState travel(TravelType travelType){
        return travelType.getTraffic().trip(userId,ticket);
    }


}
