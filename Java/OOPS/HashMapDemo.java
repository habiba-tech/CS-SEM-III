import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[] args){
        HashMap<Integer,String> students=new HashMap<>();

        students.put(101,"Amit");
        students.put(102,"Riya");
        students.put(103,"Zara");
        students.put(101,"Soham");
        System.out.println("All Students:"+students);
        System.out.println("Roll 102:"+students.get(102));
    }
}
