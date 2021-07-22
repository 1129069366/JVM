package Unit1;

import java.lang.reflect.Method;

/**
 * @program: JVM
 * @description
 * @author: Mr.Yang
 * @create: 2021-07-14 17:12
 **/
public class JVMTest1 {
    public static void main(String[] args) throws Exception{
        MyClassLoader myClassLoader = new MyClassLoader("D:\\test");  //手动在d盘创建对应目录
        Class clazz = myClassLoader.loadClass("Unit1.User");
        Object object = clazz.newInstance();
        Method method = clazz.getDeclaredMethod("print", null);
        method.invoke(object,null);
        System.out.println(clazz.getClassLoader().getClass().getName());
    }






}
