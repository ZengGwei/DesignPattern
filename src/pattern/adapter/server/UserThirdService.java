package pattern.adapter.server;

import pattern.adapter.Member;
import pattern.adapter.ResultMsg;

/**
 * 〈〉
 *稳定的方法不去动，直接继承下来
 * @author gw.Zeng
 * @create 2018/7/5
 * @since 1.0.0
 */
public class UserThirdService extends  UserService {

    public ResultMsg thridRegist(int operId){
        //1、openId是全局唯一，我们可以把它当做是一个用户名(加长)
        //2、密码默认为QQ_EMPTY
        //3、注册（在原有系统里面创建一个用户）

        //4、调用原来的登录方法

        return this.registForQQ(operId,123456);
    }

    public ResultMsg registForQQ(int userName,int password){
        super.regist(new Member(userName,password));
        return   super.login(new Member(userName,password));
    }



}
