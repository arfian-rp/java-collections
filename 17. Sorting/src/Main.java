import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Sorting hanya buat List, Set queue deque sudah ada
        //METHOD
        //1. Collections.sort(list); -> mengurutkan list (comparable bawaan elemen)
        //2. Collections.sort(list, comparato); -> mengurutkan list dengan comparator

        List<String> hewan = new ArrayList<>();
        List<Integer> angka = new ArrayList<>();

        hewan.addAll(List.of("Sapi", "Kambng","kucing"));
        angka.addAll(List.of(32,5,72));

        Collections.sort(hewan);
        Collections.sort(angka);

        System.out.println(hewan);
        System.out.println(angka);
    }
}
