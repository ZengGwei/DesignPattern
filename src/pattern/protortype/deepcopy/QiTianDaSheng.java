package pattern.protortype.deepcopy;

import java.io.*;

/**
 * 〈原型模式〉
 *
 * @author gw.Zeng
 * @create 2018/6/17
 * @since 1.0.0
 */
public class QiTianDaSheng extends Monkey implements Cloneable,Serializable{

    public RuYiJinGuBang weapon  ;

    public QiTianDaSheng() {
        this.weapon =new RuYiJinGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object deepClone(){//利用 反序列化 实现拷贝

        try {
            ByteArrayOutputStream baops =new ByteArrayOutputStream();
            ObjectOutputStream oops = new ObjectOutputStream(baops);
            oops.writeObject(this);

            ByteArrayInputStream baips =new ByteArrayInputStream(baops.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(baips);

            QiTianDaSheng dasheng = (QiTianDaSheng) ois.readObject();

            return dasheng;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }



}
