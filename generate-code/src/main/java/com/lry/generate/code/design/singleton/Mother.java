package com.lry.generate.code.design.singleton;

/**
 * Created by qinqin on 2019/5/19.
 * <p>
 * 母亲 - 每个人都只有一个母亲 因此可以作为一个单例看
 * <p>
 * 单例模式最多只允许创建一个对象
 */
public class Mother {

    // 因此构造函数私有，外界不能使用，因此只能在类中创建，创建对象需要一个成员变量保存，保存成员变量是静态的 而且为了安全 因此设置为私有
    private static Mother mother = new Mother();

    /*
     * 使用private关键字修饰构造函数 这个类之外的地方不能使用
     */
    private Mother() {

    }

    /*
     * 对象被私有 外界不能访问，因此需要提供一个公开的get方法 供外界使用  又因为外界无法创建对象，因此这个公开方法只能用static修饰
     */
    public static Mother getInstance() {
        return mother;
    }
}
