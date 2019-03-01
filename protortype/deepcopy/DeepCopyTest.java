package pattern.protortype.deepcopy;

/**
 * 〈原型模式〉
 *  原型模式就是从一个对象再创建另外一个可定制的对象，而且不需要知道任何创建的细节。
    所谓原型模式，就是 Java 中的克隆技术，以某个对象为原型。复制出新的对象。显然新的对象具备原
    型对象的特点，效率高（避免了重新执行构造过程步骤）;
    深拷贝：不仅要复制对象的所有非引用成员变量值，还要为引用类型的成员变量创建新的实例，并且初始化为形式参数实例值
 * @author gw.Zeng
 * @create 2018/6/17
 * @since 1.0.0
 */
public class DeepCopyTest {
    public static void main(String[] args) {
        QiTianDaSheng o = new QiTianDaSheng()  ;

        QiTianDaSheng n = (QiTianDaSheng) o.deepClone();
        System.out.println(o.weapon == n.weapon);//false


    }
}
