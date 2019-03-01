package pattern.dalegate;

/**
 * 〈委派模式非23中设计经典模式〉
 *
 * @author gw.Zeng
 * @create 2018/7/2
 * @since 1.0.0
 */
public class EmployeeTow implements Employment {
    @Override
    public void doing(String task) {
        System.out.println("我擅长B任务，我做！");
    }
}
