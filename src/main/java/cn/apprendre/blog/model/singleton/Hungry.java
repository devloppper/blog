package cn.apprendre.blog.model.singleton;

/**
 * @author JayHoo
 * 饿汉式的单例模式
 * 方法：
 * 1.使用静态变量约束单例属性
 * 2.私有化构造器防止再造
 * 3.提供获取单例的静态方法
 * 原理：
 * 随着Java的类加载，被实例化到静态变量中，只需要实例化一次
 */
public class Hungry {
    private static Hungry INSTANCE;

    static {
        INSTANCE = new Hungry();
    }

    private Hungry() {
    }

    public static Hungry getInstance() {
        return INSTANCE;
    }
}
