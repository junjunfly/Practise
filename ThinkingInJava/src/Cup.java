/**
 * Created by LuJun on 2016/10/19.
 * 静态初始化只做一次
 */
public class Cup {
    Cup(int marker) {
        System.out.println("Cup" + marker + "");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;

    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        System.out.println("Cups()");
    }
}

class ExplicitStatic {
    public static void main(String args[]) {
        System.out.println("Inside main()");
        Cups.cup1.f(99);
    }

    static Cups cups1 = new Cups();
    static Cups cups2 = new Cups();//第二次没有初始化static里的cups
}
