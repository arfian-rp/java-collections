import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    //secara default list di java datanya mutable(bisa diubah)
    //immutable list = list yg tdk bisa diubah

    public static void main(String[] args) {
        List<String> one = Collections.singletonList("satu");
        List<String> emty = Collections.emptyList();
        List<String> mutable = new ArrayList<>();
        mutable.addAll(List.of("satu","dua","tiga"));
        List<String> immutable = Collections.unmodifiableList(mutable);
        List<String> elements = List.of("a","b","c");



        PersonIm budi = new PersonIm("budi");
        budi.addHobby("basket");
        budi.addHobby("renang");
        System.out.println(budi.getNama());
        //dosomething(budi.getHobbies()); //error
        for (var hobby :
                budi.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void dosomething(List<String> hobbies){
        hobbies.add("bukan hobby");
    }
}

class PersonIm{
    private String nama;
    private List<String> hobbies;

    public PersonIm(String nama) {
        this.nama = nama;
        this.hobbies = new ArrayList<>();
    }
    public void addHobby(String hobby){
        hobbies.add(hobby);
    }
    public List<String> getHobbies(){
        return Collections.unmodifiableList(hobbies);//immutable list
    }
    public String getNama(){
        return nama;
    }
}