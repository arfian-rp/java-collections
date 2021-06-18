import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //METHOD
        //1. Collections.binarySearch(list, value)
        //1. Collections.binarySearch(list, value, comparator)

        List<Integer> LIST = new ArrayList<>(1000);
        for (int i=1;i<=1000;i++){
            LIST.add(i);
        }
        int INDEX = Collections.binarySearch(LIST, 397);
        System.out.println(INDEX);

    }
}
