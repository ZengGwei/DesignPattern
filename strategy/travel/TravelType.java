package pattern.strategy.travel;

/**策略模式
 * 〈出游〉
 *
 * @author gw.Zeng
 * @create 2018/6/20
 * @since 1.0.0
 */
public enum  TravelType {
    AIR_TRAVEL(new AirTravel()),
    TRAIN_TRAVEL(new TrainTravel());

    private Traffic traffic;
    TravelType(Traffic traffic) {
        this.traffic = traffic;
    }

    public Traffic getTraffic() {
        return traffic;
    }
}
