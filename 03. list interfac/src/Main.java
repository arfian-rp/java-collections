import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//list bisa dimasukkan data yg sama
//data di list berurut
//list memiliki index
//list != array
//list = dynamic, array = static

//secara garis besar implementasi list ada 2
//ARRAY LIST :
//1. isinya ada array berukuran 10 (default)
//2. ketika data array sudah penum (data ke 11)
//     maka secara otomatis arraylist akan
//      membuat array baru dengan kapasitas
//      baru dengan ukuran kapasitas lama + data baru

//LINKED LIST :
//1. Linked list adalah implementasi list dengan data double Linked list
//2. data akan disimpan dalam node

//METHOD        |ARRAY LIST            |LINKED LIST
//add           |cepat (jika kapasitas | cepat
//              |jika kapasitas cukup) |
//get           |cepat (get pakai index|lambat (harus cek node dari awal sampai ketemu)
//set           |cepat (set pakai index|lambat (harus cek node dari awal sampai ketemu)
//remove        |lambat (menggeser data|cepat (cuma mengubah prev dan next node sebelah yg dihapus)
//              |dibelakang yg dihapus)|


public class Main {
    public static void main(String[] args) {
        System.out.println("array list");
        List<String> arraylist = new ArrayList<>();
        arraylist.add("arfian");
        arraylist.add("rafi");
        System.out.println(arraylist.get(0));
        System.out.println("linked list");
        List<String> linkedlist = new LinkedList<>();
        linkedlist.add("sapi");
        linkedlist.add("kerbau");
        System.out.println(linkedlist.get(1));
    }
}
