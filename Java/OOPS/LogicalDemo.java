package Habiba;

public class LogicalDemo {
    public static void main(String[] args){
        int age=25;
        boolean hasLicense=true;

        if (age>=18 && hasLicense) {
            System.out.println("Can Drive");
        }else{
            System.out.println("Cannot Drive");
        }
        System.out.println(!hasLicense);
    }
}
