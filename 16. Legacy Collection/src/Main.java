import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        //VECTOR CLASS
        //1. implementasi dari interface list
        //2. cara kerja mirip arrayList, yg membedakan semua method vektor menggunakan kata kuncu SYNCHRONIZED(thread safe)
        //3. menggunakan vektor lebih lambat drpd array list
        System.out.println("VECTOR");
        List<String> vektor = new Vector<>();

        vektor.add("Arfian");
        vektor.add("Rafi");
        vektor.add("Pradana");

        for (var i :
                vektor) {
            System.out.println(i);
        }

        //HASH TABLE CLASS
        //1. implementasi Map (mirip hashmap)
        //2. SYNCHRONIZED, aman proses paralel dapi lambat
        System.out.println("HASH TABLE");
        Map<String, String> hashtable = new Hashtable<>();
        hashtable.putAll(Map.of(
                "k1","VAL1",
                "k2","VAL2",
                "k3","VAL3"
        ));

        for (var e:
             hashtable.keySet()) {
            System.out.println(e);
        }

    }
}
