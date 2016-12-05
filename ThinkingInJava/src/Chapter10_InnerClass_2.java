/**
 * Created by LuJun on 2016/12/3.
 */
public class Chapter10_InnerClass_2 {
    class Contents {
        private int i = 11;

        private int value() {
            return i;
        }
    }

    class Desternation {
        private String label;

        Desternation(String whereTo) {
            label = whereTo;
        }

        String readLine() {
            return label;
        }
    }

    public Desternation to(String s) {
        return new Desternation(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents c = contents();
        Desternation d = to(dest);
        System.out.println(d.readLine());
    }

    public static void main(String args[]) {
        Chapter10_InnerClass_2 ci = new Chapter10_InnerClass_2();
        ci.ship("Tasmania");
        Chapter10_InnerClass_2 ci_2 = new Chapter10_InnerClass_2();
        Chapter10_InnerClass_2.Contents c = ci_2.contents();
        Chapter10_InnerClass_2.Desternation d = ci_2.to("Borneo");
    }
}
