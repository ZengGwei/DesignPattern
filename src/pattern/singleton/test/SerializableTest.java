package pattern.singleton.test;

import pattern.singleton.seriable.SerializableSingleton;

import java.io.*;

/**
 * 〈〉
 *
 * @author gw.Zeng
 * @create 2018/6/15
 * @since 1.0.0
 */
public class SerializableTest {

    public static void main(String[] args) {


        SerializableSingleton s1 = SerializableSingleton.getInstance();
        try {
            FileOutputStream output = new FileOutputStream("SerializableSingleton.obj");
            ObjectOutputStream objOutput = new ObjectOutputStream(output);
            objOutput.writeObject(s1);

            FileInputStream input = new FileInputStream("SerializableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(input);
            SerializableSingleton s2 =(SerializableSingleton) ois.readObject();
            ois.close();

            System.out.println(s1 );
            System.out.println( s2);
            System.out.println(s1 == s2);//false,反序列化破换了单例

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
