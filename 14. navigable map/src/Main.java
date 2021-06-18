import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.putAll(Map.of(
                "Arfian","Arfian",
                "Rafi","Rafi",
                "Pradana","Pradana"
        ));
        System.out.println(map.lowerKey("Rafi"));
        System.out.println(map.higherKey("Arfian"));
    }
}
