package pattern.adapter;

import pattern.adapter.server.UserThirdService;

/**
 * 〈〉
 *
 * @author gw.Zeng
 * @create 2018/7/5
 * @since 1.0.0
 */
public class SiginForThirdServiceTest {
    public static void main(String[] args) {
//        Member member = new Member(123543, 123456);
        UserThirdService service = new UserThirdService();
        //不改变原来的代码，也要能够兼容新的需求
        //还可以再加一层策略模式
        service.thridRegist(2342434);


    }

}
