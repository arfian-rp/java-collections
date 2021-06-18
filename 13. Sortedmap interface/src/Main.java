import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //cocok untuk kasus yg posisi key harus urut
        Comparator<String> strcom = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        SortedMap<String,String> sortedMap = new TreeMap<>(strcom);
        sortedMap.put("first","ARFIAN");
        sortedMap.put("middle","RAFI");
        sortedMap.put("last","PRADANA");

        for (var i :
                sortedMap.keySet()) {
            System.out.println(i);
        }

        //Collections.emtySortedMap();
        //Collections.unmodifiableSortedMap(sortedmap);

    }
}
