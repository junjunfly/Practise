/**
 * Created by LuJun on 2016/11/27.
 */
public class Chapter9_Ex3 {
    public static void main(String args[]) {
        Base2 b2 = new Base2();
        b2.print();
    }
}

abstract class Base {
    public Base() {
        print();
    }

    public abstract void print();
}

class Base2 extends Base {
    int i = 47;

    public void print() {
        System.out.println(i);
    }
}