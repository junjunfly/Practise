import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by LuJun on 2016/11/24.
 */
public class TestPerm {
    public static void main(String ...arg){
        List<String> list = new ArrayList<String>();
        while(true){
            list.add(UUID.randomUUID().toString().intern());
        }
    }

//    public static void main(String... args){
//        List<byte[]> buffer = new ArrayList<byte[]>();
//        buffer.add(new byte[10*1024*1024]);
//    }
}
