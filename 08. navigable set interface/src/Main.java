import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //navigable set adalah turunan sorted set
        //navigable set menambah method2 untuk melakukan navigasi
        //pencariian elemen seperti lebihbesardari kurang dari dll
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Arfian","rafi","pradana"));
        NavigableSet<String> namesDesc = names.descendingSet();
        NavigableSet<String> arfian = names.tailSet("Arfian",true);

        for (var k :
                names) {
            System.out.println(k);
        }for (var k :
                namesDesc) {
            System.out.println(k);
        }
        System.out.println(arfian);

        //immutable navigable set

        NavigableSet<String> immutablenavigable = Collections.unmodifiableNavigableSet(names);
        //immutablenavigable.add("test"); //error

    }
}
