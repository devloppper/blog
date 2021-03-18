package cn.apprendre.blog.model.singleton;

/**
 * @author JayHoo
 * 使用枚举的方式实现单例
 *  1.创建一个枚举，其中加上自身的方法
 */
public enum Enums {
    INSTANCE;

    public void func() {
        System.out.println("you did it");
    }

    public static void main(String[] args) {
        Enums.INSTANCE.func();
    }
}
