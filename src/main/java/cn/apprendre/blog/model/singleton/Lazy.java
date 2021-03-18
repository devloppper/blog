package cn.apprendre.blog.model.singleton;

/**
 * @author JayHoo
 * 懒汉式的单例模式
 * 步骤
 *  1.使用一个静态同时被volatile修饰的变量标识单例
 *  2.私有化构造器
 *  3.提供单例获取的方法，同时用DC方式实例化
 */
public class Lazy {
    private static volatile Lazy INSTANCE;

    private Lazy() {}

    public static Lazy getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (Lazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Lazy();
                }
            }
        }
        return INSTANCE;
    }
}
