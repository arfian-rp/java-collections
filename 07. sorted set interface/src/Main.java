import java.util.*;

public class Main {
    public static void main(String[] args) {
    // sorted set adalah turunan set, namun elemen yg dimasukkan otomatis diurutkan

        //immutable sortedset (contoh)
        //Collections.emtySortedSet()
        //Collections.unmodifiableSortedSet(set)

        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());
        people.add(new Person("udin"));
        people.add(new Person("edo"));
        people.add(new Person("beni"));

        for (var k :
                people) {
            System.out.println(k.getNama());
        }
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
        return this.hobbies;
    }
    public String getNama(){
        return this.nama;
    }
}

class PersonComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2){
        return o1.getNama().compareTo(o2.getNama());
    }
}
