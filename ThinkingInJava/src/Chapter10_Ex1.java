/**
 * Created by LuJun on 2016/12/3.
 */
public class Chapter10_Ex1 {
    class Inner {
        Inner() {
            System.out.println("return Inner");
        }

    }

    Inner getInner() {
        return new Inner();
    }

    public static void main(String args[]){
        Chapter10_Ex1 c = new Chapter10_Ex1();
        c.getInner();
    }
}
