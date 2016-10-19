import java.util.Random;

/**
 * Created by LuJun on 2016/10/19.
 * 创建该类的对象引用数组没有调用该类的初始化方法
 */
public class TestArrays {
    TestArrays(String str) {
        System.out.println(str);
    }

    public static void main(String args[]) {
        Random r = new Random(47);
        TestArrays[] testArrayses = new TestArrays[r.nextInt(10)];
    }
}

