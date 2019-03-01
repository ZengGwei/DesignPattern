package pattern.proxy.customer;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**代理模式
 * 〈自定义代理类 〉
 * //字节码重组过程 原理：
 *
 // 1.拿到被代理对象的引用，通过反射获取 所有的接口
 // 2.JDK proxy 重新生成一个新类 $Proxy0,同时新 的类要实现被代理类 的所有的接口
 // 3.动态生成 java 代码，把新加入的业务逻辑方法由一定的逻辑代码去调用
 // 4.编译 生成新的 .class 文件。
 // 5.重新加载到 JVM 运行。
 * @author gw.Zeng
 * @create 2018/6/18
 * @since 1.0.0
 */
public class CustomProxy {

    private  static String sn = "\r\n";
    public static Object newProxyInstance(CustomClassLoader loader, Class<?>[] interfaces, CustomInvocationHandler h){
        try {
            //1、动态生成 .java 文件
            String codeString = generateSrc(interfaces);
            //2.java文件输出磁盘
            String filePath = CustomProxy.class.getResource("").getPath();
            System.out.println(filePath);
            File file = new File(filePath+"$Proxy0.java");
            FileWriter fw =new FileWriter(file);
            fw.write(codeString);
            fw.flush();
            fw.close();

            //3.编译java文件成.class
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable<? extends JavaFileObject> iterable = manager.getJavaFileObjects(file);

            JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
            task.call();
            manager.close();
            //4.编译成的.class放入JVM中
            Class<?> proxy = loader.findClass("$Proxy0");
            if(proxy ==null){
                throw new RuntimeException("未找到类：");
            }
            file.delete();
            Constructor<?> constructor = proxy.getConstructor(CustomInvocationHandler.class);

            //5.返回字节码重组的额新对象
            return constructor.newInstance(h);

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
            StringBuilder sb = new StringBuilder();
            sb.append("package pattern.proxy.customer;"+sn);
            sb.append("import pattern.proxy.staticproxy.Factory;" +sn);
            sb.append("import java.lang.reflect.Method;"+sn);

            sb.append("public class $Proxy0 implements "+interfaces[0].getName()+"{"+sn);
                sb.append("CustomInvocationHandler h;"+sn);
                sb.append("public $Proxy0(CustomInvocationHandler h){ "+sn);
                sb.append("   this.h=h;"+sn);
                sb.append("}"+sn);
                for (Method m:interfaces[0].getMethods()){
                    sb.append("public "+m.getReturnType().getName()+" "+m.getName()+"(){"+sn);
                            sb.append("try{"+sn);
                                    sb.append("Method m = "+interfaces[0].getName()+".class.getMethod(\""+m.getName()+"\",new Class[]{});");
                                    sb.append("this.h.invoke(this,m,null);");

                            sb.append("}catch(Throwable e){"+sn);
                                    sb.append("e.printStackTrace(); "+sn);
                            sb.append("}"+sn);
                    sb.append("}"+sn);
                }
            sb.append("}"+sn);

        return sb.toString();
    }


}
