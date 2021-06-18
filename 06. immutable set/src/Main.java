import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("satu");
        Set<String> mutable = new HashSet<>();
        mutable.addAll(Set.of("a","b","c"));
        Set<String> immutable = Collections.unmodifiableSet(mutable);
        // immutable.remove("a"); //error
        Set<String> elements = Set.of("a","b","c");
    }
}
