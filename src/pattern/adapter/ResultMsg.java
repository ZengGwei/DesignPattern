package pattern.adapter;

/**
 * 〈适配器模式〉
 *
 * @author gw.Zeng
 * @create 2018/7/5
 * @since 1.0.0
 */
public class ResultMsg {

    private String code;
    private String msg;
    private Object date;

    public ResultMsg(String code, String msg, Object date) {
        this.code = code;
        this.msg = msg;
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }
}
