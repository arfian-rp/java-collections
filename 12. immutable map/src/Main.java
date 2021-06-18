import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> emty = Collections.emptyMap();
        Map<String, String> sigle = Collections.singletonMap("k1","VAL1");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("k1","ARFIAN");
        mutable.put("k2","RAFI");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);
        //immutable.put("k3","PRADANA"); //error

        Map<String ,String > map = Map.of(
                "k1","Arfian",
                "k2","Rafi",
                "k3","Pradana"
        );

    }
}
