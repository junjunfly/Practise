/**
 * Created by LuJun on 2016/10/19.
 */
public class Tank {
    boolean isFull = false;

    Tank(boolean status) {
        isFull = status;
    }

    void empty() {
        isFull = false;
    }

    protected void finalize() throws Throwable {
        if (!isFull) {
            System.out.println("Correct: is empty");
        } else {
            System.out.println("Error: is full!");
        }
    }

    public static void main(String args[]) {
        new Tank(true);
        System.gc();
        System.runFinalization();
    }
}


//public class Tank {
//
//    public boolean state = false;
//
//    public void changeState(boolean state) {
//        this.state = state;
//    }
//
//    protected void finalize() throws Throwable {
//        if (state) {
//            System.out.println("----满的，有问题---------");
//            throw new Throwable("状态不为空!");
//        } else {
//            System.out.println("----空的，没问题---------");
//            super.finalize();
//        }
//    }
//
//    public static void main(String[] args) {
//        new Tank();
//        System.gc();
//        System.runFinalization();
//
//        new Tank().changeState(true);
//        System.gc();
//        System.runFinalization();
//    }
//}
