/**
 * Created by LuJun on 2016/12/3.
 */
public class Chapter10_InnerClass_1 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }
    public void ship(String dest){
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String args[]){
        Chapter10_InnerClass_1 ci = new Chapter10_InnerClass_1();
        ci.ship("Tasmania");
    }
}
