import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        //bisa digunakan untuk partisi data di collection
        //biasanya digunakan untuk memproses data yg besar


        List<String> list = List.of("Arfian","Rafi","Pradana","ARFIAN","RAFI","PRADANA");
        Spliterator<String> spliterator1 = list.spliterator();
        Spliterator<String> spliterator2 = spliterator1.trySplit();

        System.out.println(spliterator1.estimateSize());
        System.out.println(spliterator2.estimateSize());

        spliterator1.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        spliterator2.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
