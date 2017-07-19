package test;

/**
 * Created by hspcadmin on 2017/7/19.
 */
public class Son3 extends Father{
    public Son3(int i) {
        super(i);
        System.out.println("constructor son3");
    }

//    @Override//override注解可帮助编译器检验方法到底是重写还是重载
    void f(int a) {
        System.out.println("son3");
        super.f();
    }
}
