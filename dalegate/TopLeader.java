package pattern.dalegate;

/**
 * 〈委派模式非23中设计经典模式〉
 *
 * @author gw.Zeng
 * @create 2018/7/2
 * @since 1.0.0
 */
public class TopLeader {
    public static void main(String[] args) {
        Leader tom = new Leader();
        tom.doing("A任务");
    }

}
