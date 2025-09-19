import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<String>fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Banana");
        System.out.println("Fruits List:"+fruits);
        System.out.println("first fruit:"+fruits.get(0));
        fruits.remove("Banana");
        for (String fruit:fruits){
            System.out.println(fruit);
        }
    }
}
