import java.util.*;
public class ListExample {
    public static void main(String[] args){
        List<String>animals=new ArrayList<>();
        animals.add("Dog");
        animals.add("cat");
        animals.add("Elephant");
        animals.add("Dog");
        for (String animal:animals){
            System.out.println(animal);
            System.out.println("First animal:"+animals.get(0));
        }

    }
}
