/**
 * Created by LuJun on 2016/10/13.
 */
public class TestConstruct {
    TestConstruct() {
        this(23);
    }

    TestConstruct(int count) {
        System.out.println(count);
    }

    public static void main(String args[]) {
        TestConstruct tc = new TestConstruct();
    }

}
