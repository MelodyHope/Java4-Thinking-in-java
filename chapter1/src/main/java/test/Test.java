package test;

/**
 * Created by hspcadmin on 2017/7/17.
 */
public class Test {
//	/**
//	 * @param args
//	 * @throws CloneNotSupportedException
//	 * @throws IllegalAccessException
//	 * @throws InstantiationException
//	 */
//	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException {
//		// TODO 自动生成的方法存根
//		MyClassLoader mycl = new MyClassLoader();
//		try {
//			Class democlass = mycl.loadClass("test\\Demo");
//			Demo demo1 = (Demo) democlass.newInstance();
//			demo1.printA();
//		} catch (ClassNotFoundException e) {
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		}
//
//	}
//	public static void main(String[] args) {
//		String a = "abc";
//		String b = "abc";
//		a=null;
//		if(a==b){
//			System.out.println("a==b");
//		}
//	}
//	static String ab = "ab";
//    static String getA()
//    {
//        return "a";
//    }
//    static String getAB()
//    {
//        return "ab";
//    }
//    public static void main(String[] args)
//    {
//        // 1
//        String _ab = new String("ab");
//        System.out.printf("ab==_ab %b\n", ab==_ab);
//        // 2
//        String s1 = "a"+"b";
//        System.out.printf("ab==s1 %b\n", ab==s1);
//        // 3
//        String s2 = getA()+"b";
//        System.out.printf("ab==s2 %b\n", ab==s2);
//        // 4
//        System.out.printf("ab==getAB() %b\n", ab==getAB());
//        // 5
//        String s3 = getAB();
//        System.out.printf("ab==s3 %b\n", ab==s3);
//    }

//	public static final int i=9;
//	public static void main(String[] args) {
//		int j = 9;
//		System.out.println(""+(i==j));
//	}

//	public static void main(String[] args) {
//		System.getProperties().list(System.out);
//		System.out.println(System.getProperty("user.home"));
//		System.out.println(System.getProperty("java.library.path"));
//	}

//	static int i;
//	public static void main(String[] args) {
//		Integer i = new Integer(1);
//		Integer j = new Integer(1);
//		i.equals(j);
//		System.out.println(""+i.equals(j));
//	}

//	public static void main(String[] args) {
//		int i = 3;
//		int j = 1;
//		int x = i&j;
//		int y = i|j;
//		int z = ~j;
//		System.out.println(x+","+y+","+z);
//	}

//	public static void main(String[] args) {
//		char a = 'A';
//		int i = 4;
//		int j = i>>1;
//		int b = moveRightChar(a, j);
//		System.out.println(""+j+","+Integer.toBinaryString(b));
//	}
//
//	public static int moveRightChar(char c, int l){
//		int a = (int)c;
//		return a>>l;
//	}

//	public static void main(String[] args) {
//		int i=0;
//		outter:
//		for(;true;){
//			System.out.println("outter"+i);
//			inner:
//			for(;i<5;i++){
//				System.out.println("inner:"+i);
//				if(i==1){
//					continue;
//				}
//				if(i==2){
//					i++;
//					break;
//				}
//				if(i==3){
//					i++;
//					continue outter;
//				}
//				if(i==4){
//					break outter;
//				}
//			}
//		}
//	}


//	public static void main(String[] args) {
//		int[] a = {1,2,3};
//		int[] b = {1,2,3};
//		for(int i : b){
//			System.out.println(""+i);
//		}
//		a[1] = 4;
//		for(int i : a){
//			System.out.println(""+i);
//		}
//		for(int i : b){
//			System.out.println(""+i);
//		}
//		String a = "abc";
//		String b = "abc";
//		System.out.println(a==b);

//	}

//class A {
//
//    /* (non-Javadoc)
//     * @see java.lang.Object#toString()
//     */
//    @Override
//    public String toString() {
//        // TODO 自动生成的方法存根
//        return "A.class";
//    }
//
//}

//    public static void main(String[] args) {
//
//        A a = new A();
//        System.out.println(""+a);
//    }
//
//    static void pf(Object... args){
//        for(Object arg : args){
//            System.out.println(""+arg);
//        }
//    }
//    public static void main(String[] args){
//        pf(1,"abc",'x');
//    }

//    public enum A{
//        TOM, KATE, JONE
//    }
//
//    public static void main(String[] args){
//        for (A a : A.values()){
//            System.out.println(""+a+":"+a.ordinal());
//        }
//    }

    public static void main(String[] args){
        Ab x = new Ab();
    }

}