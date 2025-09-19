import java.util.*;
public class CustomSortTreeSet {
    public static void main(String[] args){
        TreeSet<String>names=new TreeSet<>(Comparator.reverseOrder());
        names.add("Amit");
        names.add("Riya");
        names.add("Zara");
        System.out.println("Reverse Sorted Names:"+names);

    }
}
