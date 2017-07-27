package test;

/**
 * Created by hspcadmin on 2017/7/17.
 */
public class Son1 extends Father implements FatherInter{
    public Son1(int i) {
        super(i);
        System.out.println("constructor son1");
    }

//    @Override
//    public void f(){
//        System.out.println("son1");
////        super.f();
//    }
}
