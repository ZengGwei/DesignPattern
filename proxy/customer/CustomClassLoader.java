package pattern.proxy.customer;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 〈自定义类加载器〉
 *代理模式
 * @author gw.Zeng
 * @create 2018/6/18
 * @since 1.0.0
 */
public class CustomClassLoader extends ClassLoader {

    private File classPathFile;


    public CustomClassLoader() {
        String path = CustomClassLoader.class.getResource("").getPath();

        this.classPathFile = new File(path);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String fullName = CustomClassLoader.class.getPackage().getName() + "." + name;
        FileInputStream ips = null;
        ByteArrayOutputStream out = null;
        try{
            if(classPathFile != null){
                File classFile = new File(classPathFile, name.replaceAll("\\.", "/") + ".class");
                if (classFile.exists()){
                     ips = new FileInputStream(classFile);
                     out = new ByteArrayOutputStream();

                    byte[] bytes =new byte[1024];
                    int len;
                    while ((len =ips.read(bytes)) != -1){
                        out.write(bytes,0,len);
                    }
                    return defineClass(fullName,out.toByteArray(),0,out.size());
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (ips !=null){
                try {
                    ips.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
       return null;
    }
}
