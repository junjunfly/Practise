/**
 * Created by LuJun on 2016/12/3.
 */
public class FactoryTest {
    public static void ride(CycleFactory fact) {
        Cycle c = fact.getCycle();
        System.out.println(c.wheels() + "_" + c.drive());
    }

    public static void main(String args[]) {
        ride(new TricleFactory());
        ride(new BicycleFactory());
    }
}

interface Cycle {
    int wheels();

    String drive();
}

interface CycleFactory {
    Cycle getCycle();
}

class Bicycle implements Cycle {

    @Override
    public int wheels() {
        return 1;
    }

    @Override
    public String drive() {
        return "drive Bicycle";
    }
}

class Tricle implements Cycle {

    @Override
    public int wheels() {
        return 2;
    }

    @Override
    public String drive() {
        return "drive Tricle";
    }
}

class BicycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class TricleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Tricle();
    }
}