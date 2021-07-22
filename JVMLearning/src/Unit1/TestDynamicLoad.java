package Unit1;

/**
 * @program: JVM
 * @description
 * @author: Mr.Yang
 * @create: 2021-07-22 09:35
 **/

/**
 * 测试动态加载
 */
public class TestDynamicLoad {
    public static void main(String[] args) {
        new A();
        System.out.println("------------------------");
        new B();

    }

    static class A{}

    static class B{}

}
