import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args){
        HashSet<String>cities=new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");
        System.out.println("Cities:"+cities);
        System.out.println("contains Mumbai?: "+cities.contains("Mumbai"));
    }
}
