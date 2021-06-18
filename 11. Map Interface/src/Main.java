import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Map : struktur data collection yg berisikan mapping antara key dan value
        //key harus unik, tidak boleh duplikat
        //map mirip array, namun array pakai index
        //sedangkan map menggunakan key(bebas)
        //map sama seperti array assoc di php

        //implementasi map:
        //HASHMAP: melakukan distribusi key dengan hash code
        System.out.println("HASH MAP");
        Map<String, String> hashmap = new HashMap<>();
        hashmap.put("nama1","ARFIAN");
        hashmap.put("nama2","RAFI");
        hashmap.put("nama3","PRADANA");

        System.out.println(hashmap.get("nama1"));
        System.out.println(hashmap.get("nama2"));
        System.out.println(hashmap.get("nama3"));

        //WEAK HASHMAP: implementasi hashmap, menggunakan key lemah(jika tidak digunakan akan dihapus)
        System.out.println("WEAK HASH MAP");
        Map<Integer, Integer> weakhasmap = new WeakHashMap<>();
        for (int i=0;i<1000000;i++){
            weakhasmap.put(i,i);
        }
        System.gc(); //menjalankan garbage collactor
        System.out.println("size: "+weakhasmap.size());

        //IDENTITY HASHMAP: implmn hashmp, yg membedakan cara pengecekan (tidak menggunakan equals() tapi (==) (artinya data dianggp sama jika lokasinya sama))
        System.out.println("IDENTITY HASH MAP");
        Map<String, String> identityhashmap = new IdentityHashMap<>();

        //yg membedakan tidak menggunakan equals() tapi == (alamat)
        String key1 = "k1";
        String k = "k";
        String key2 = k+"1";
        System.out.println(key1.equals(key2));
        System.out.println(key1 == key2);

        identityhashmap.put(key1, "VALUE1");
        identityhashmap.put(key2, "VALUE2");

        System.out.println(identityhashmap.get(key1));
        System.out.println(identityhashmap.get(key2));

        //LINKED HASHMAP: implmt map dengan double linked list, data lebih terprediksi (sesuai urutan), proses get lambat (harus iterasi)
        System.out.println("LINKED HASH MAP");
        Map<String, String> linkedhashmap = new LinkedHashMap<>();
        linkedhashmap.put("first","ARFIAN");
        linkedhashmap.put("middle","RAFI");
        linkedhashmap.put("last","PRADANA");

        Set<String> keys = linkedhashmap.keySet();
        for (var v :
                keys) {
            System.out.println(v);
        }

        //ENUM MAP: implementasi map dimana key adalah enum
        System.out.println("ENUM MAP");
        Map<Level, String> enummap = new EnumMap<Level, String>(Level.class);
        enummap.put(Level.FREE,"ARFIAN");
        enummap.put(Level.STANDART,"RAFI");
        enummap.put(Level.PREMIUM,"PRADANA");
        for (var key :
                enummap.keySet()) {
            System.out.println(enummap.get(key));
        }
    }

    public static enum Level{
        FREE, STANDART, PREMIUM
    }
}
