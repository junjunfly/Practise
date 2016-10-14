/**
 * Created by LuJun on 2016/10/13.
 */
public class Leaf {
    int i = 0;

    Leaf increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String args[]) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}
