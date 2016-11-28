/**
 * Created by LuJun on 2016/11/27.
 */
public class Frog2 extends livingCreature{

    protected void created(){
        System.out.println("Frog2 created");
        super.create();
    }

    public static void main(String args[]){
        Frog2 f = new Frog2();
        f.created();
    }
}

class Characteristic{
    protected void create(){
        System.out.println("Characteristic created");
    }
}
class Description{
    protected void create(){
        System.out.println("Description created");
    }
}

class livingCreature{
    Characteristic c = new Characteristic();
    Description t = new Description();
    protected void create(){
        System.out.println("livingCreature created");
        c.create();
        t.create();
    }
}
