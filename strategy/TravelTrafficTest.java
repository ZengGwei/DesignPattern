package pattern.strategy;

import pattern.strategy.travel.TravelType;

/**策略模式
 *  策略模式 〈测试〉
 *  定义一系列的算法，把它们一个个封装起来，并且使它们可相互替换。本模式使得算法可独立于使用它的客户而变化。
 * @author gw.Zeng
 * @create 2018/6/20
 * @since 1.0.0
 */
public class TravelTrafficTest {

    public static void main(String[] args) {
        TravelTraffic travel = new TravelTraffic("262201199812042344","机票xxxxxx");
        //出行，选择飞机、火车、客车、滴滴快车、滴滴顺风车

        //这个值是在出行的时候才决定用哪个值
        TravelState res = travel.travel(TravelType.TRAIN_TRAVEL);
        System.out.println(res);
    }

}
