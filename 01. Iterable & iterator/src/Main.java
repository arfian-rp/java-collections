import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //iterable
        //iterable mendukung foreach
        System.out.println("ITERABLE");

        Iterable<String> names = List.of("arfian","rafi","pradana");

        for (var name :
                names) {
            System.out.println(name);
        }

        //iterator
        System.out.println("ITERATOR");

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

    }
}
