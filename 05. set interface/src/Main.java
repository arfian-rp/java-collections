import java.util.*;

public class Main {
    public static void main(String[] args) {
        //set hanya bisa diisi data unik (tdk bole duplkt)
        //set tidak memiliki index (tdk ada jaminan data di set terurut)
        //set tidak memiliki method baru (cuma di parent iterable & colection)
        //hash set = tidak urut (berdasarkan waktu menambah data)
        //linked hash set = urut (berdasarkan waktu menambah data)
        //enum set = elemen nya harus enum

        System.out.println("hash Set");
        Set<String> names1 = new HashSet<>();
        names1.add("Arfian");
        names1.add("Rafi");
        names1.add("Pradana");
        names1.add("A");
        names1.add("R");
        names1.add("P");

        for (var k :
                names1) {
            System.out.println(k);
        }

        System.out.println("linked hash Set");
        Set<String> names2 = new LinkedHashSet<>();
        names2.add("Arfian");
        names2.add("Rafi");
        names2.add("Pradana");
        names2.add("A");
        names2.add("R");
        names2.add("P");

        for (var k :
                names2) {
            System.out.println(k);
        }

        System.out.println("enum set");
        EnumSet<Gender> gender1 = EnumSet.allOf(Gender.class);
        for (var k :
                gender1) {
            System.out.println(k);
        }
        EnumSet<Gender> gender2 = EnumSet.of(Gender.MALE);
        System.out.println(gender2);
    }

    public static enum Gender{
        MALE, FEMALE, NOT_MENTION
    }
}
