import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        //mendukung foreach
        //bisa memanipulasi data dengan method bawaan
        //tidak ada direct implementation
        System.out.println("ADD");

        collection.add("sapi");
        collection.add("kambing");
        collection.addAll(List.of("domba","itik","ikan"));

        for (var name :
                collection) {
            System.out.println(name);
        }

        System.out.println("REMOVE");

        collection.remove("kambing");
        collection.removeAll(List.of("domba","ikan"));

        for (var name :
                collection) {
            System.out.println(name);
        }

        System.out.println("MENGECEK DATA DI COLLECTION");
        System.out.println(collection.contains("sapi"));
        System.out.println(collection.contains("kucing"));
        System.out.println(collection.containsAll(List.of("unta","ikan")));
        System.out.println(collection.size());

    }
}
