import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //sudah jelas
        List<String> hewan = new ArrayList<>();
        hewan = List.of("Macan","Serigala","Harimau");

        Object[] objects = hewan.toArray();
        String[] strings = hewan.toArray(new String[]{});

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));
    }
}
