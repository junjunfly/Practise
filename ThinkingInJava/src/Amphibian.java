/**
 * Created by LuJun on 2016/11/26.
 */
public class Amphibian {

    public void moveInWater() {
        System.out.println("move in the water!");
    }

    public void flyIntheSky() {
        System.out.println("fly in the sky");
    }

}

class Frog extends Amphibian {
    public void moveInWater(){
        System.out.println("move by child");
    }
    public void flyIntheSky(){
        System.out.println("fly by child");
    }
}

class E16_Forg {

    public static void main(String args[]){
        Amphibian f = new Frog();
        f.moveInWater();
        f.flyIntheSky();
    }
}
