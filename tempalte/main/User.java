package pattern.tempalte.main;

/**
 * 〈模板模式〉
 *
 * @author gw.Zeng
 * @create 2019/2/25
 * @since 1.0.0
 */
public class User {
    private String userName;
    private int age;
    private int gender;

    private String addr;

    public User() {}

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public User(String userName, int age, int gender) {
        this.userName = userName;
        this.age = age;
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
