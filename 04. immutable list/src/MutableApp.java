import java.util.ArrayList;
import java.util.List;

public class MutableApp {
    //secara default list di java datanya mutable(bisa diubah)
    //immutable list = list yg tdk bisa diubah

    public static void main(String[] args) {
        Person budi = new Person("budi");
        budi.addHobby("basket");
        budi.addHobby("renang");
        System.out.println(budi.getNama());
        //tes
        dosomething(budi.getHobbies());
        for (var hobby :
                budi.getHobbies()) {
            System.out.println(hobby);
        }
    }
    public static void dosomething(List<String> hobbies){
        hobbies.add("bukan hobby");
    }
}

class Person{
    private String nama;
    private List<String> hobbies;

    public Person(String nama) {
        this.nama = nama;
        this.hobbies = new ArrayList<>();
    }
    public void addHobby(String hobby){
        hobbies.add(hobby);
    }
    public List<String> getHobbies(){
        return hobbies;
    }
    public String getNama(){
        return nama;
    }
}