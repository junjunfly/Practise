/**
 * Created by LuJun on 2016/11/26.
 */
public class Battle  extends  Insect{
    private int k = printInit("Beetle.k initialized");
    public Battle(){
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 = printInit("static Beetle.x2 initialized");
    public static  void  main(String[] args){
        System.out.println("beetle constructor");
        Battle b = new Battle();
    }
}

class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        System.out.println("i = " + i + " , j = " + j);
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}
//static Insect.x1 initialized
//static Beetle.x2 initialized
//beetle constructor
//i = 9 j = 0
//beetle.k initialized
//k = 47
//j = 39

