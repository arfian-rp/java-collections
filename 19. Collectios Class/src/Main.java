import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Method di Collections class
        List<String> list1 = new ArrayList<>();
        list1.addAll(List.of("Arfian","Rafi","Pradana"));

        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println(list1);

        System.out.println(list1);
        Collections.shuffle(list1); //acak
        System.out.println(list1);
    }
}
