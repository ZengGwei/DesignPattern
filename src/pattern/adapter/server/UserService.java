package pattern.adapter.server;

import pattern.adapter.Member;
import pattern.adapter.ResultMsg;


/**
 * 〈〉
 *
 * @author gw.Zeng
 * @create 2018/7/5
 * @since 1.0.0
 */
public class UserService {

    public ResultMsg regist(Member member){
        return new ResultMsg("200",member.getUserAccount()+"注册成功！",null);
    }

    public ResultMsg login(Member member){
        return new ResultMsg("200",member.getUserAccount()+"登录成功！",null);
    }

    public ResultMsg loginOut(Member member){
        return new ResultMsg("200",member.getUserAccount()+"退出登录成功！",null);
    }
}
