import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<String>books=new LinkedList<>();
        books.add("java");
        books.add("python");
        books.add("c++");
        books.add("HTML");
        books.add("SQL");
        System.out.println("Books List"+books);
        books.remove("python");
        System.out.println("After removal:"+books);
    }
}
