package pattern.tempalte;

import pattern.tempalte.Dao.UserDao;

/**
 * 〈模板方法模式〉
 * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。Template Method 使得子类可以不改变
 * 一个算法的结构即可重定义该算法的某些特定步骤。
 * Template Method 模式一般是需要继承的。这里想要探讨另一种对 Template Method 的理解。Spring
 * 中的 JdbcTemplate，在用这个类时并不想去继承这个类，因为这个类的方法太多，但是我们还是想用
 * 到 JdbcTemplate 已有的稳定的、公用的数据库连接，那么我们怎么办呢？我们可以把变化的东西抽出
 * 来作为一个参数传入 JdbcTemplate 的方法中。但是变化的东西是一段代码，而且这段代码会用到
 * JdbcTemplate 中的变量。怎么办？那我们就用回调对象吧。在这个回调对象中定义一个操纵
 * JdbcTemplate 中变量的方法，我们去实现这个方法，就把变化的东西集中到这里了。然后我们再传入
 * 这个回调对象到 JdbcTemplate，从而完成了调用。这就是 Template Method 不需要继承的另一种实
 * 现方式
 *
 * @author gw.Zeng
 * @create 2018/07/01
 * @since 1.0.0
 */
public class TemplateMothedTest {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        userDao.query();


    }


}
