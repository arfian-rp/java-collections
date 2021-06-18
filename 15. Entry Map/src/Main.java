import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //saat kita menyimpan data di map, data tsb disimpan di dalam pair(key-value)
        //di java collection, implementasi pair di map bernama entry
        //entry adalah interface sederhana yg berisikan method untuk mengambil key dan value
        Map<String, String> map = new HashMap<>();
        map.put("K1","Arfian");
        map.put("K2","Rafi");
        map.put("K3","Pradana");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (var e :
                entries) {
            System.out.println(e.getKey()+":"+e.getValue());
        }

    }
}
