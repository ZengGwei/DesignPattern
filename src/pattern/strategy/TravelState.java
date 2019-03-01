package pattern.strategy;

/**
 * 〈策略模式〉
 *
 * @author gw.Zeng
 * @create 2018/6/20
 * @since 1.0.0
 */
public class TravelState {

    private int code;
    private Object data;
    private String msg;

    public TravelState(int code,String msg,Object data) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "TravelState{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
