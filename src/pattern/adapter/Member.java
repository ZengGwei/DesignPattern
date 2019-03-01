package pattern.adapter;

/**
 * 〈适配器模式〉
 *
 * @author gw.Zeng
 * @create 2018/7/5
 * @since 1.0.0
 */
public class Member {
    private int userAccount;
    private int password;
    private String toke;

    public Member(int userAccount, int password) {
        this.userAccount = userAccount;
        this.password = password;
    }

    public Member() {}

    public int getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(int userAccount) {
        this.userAccount = userAccount;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getToke() {
        return toke;
    }

    public void setToke(String toke) {
        this.toke = toke;
    }
}
