import java.util.Scanner;
public class name {

    public void join(String x, String y) {
        System.out.println("The name of the person is : "+x+" "+y);
    }

    public static void main(String[] args) {
        String first, last;
        Scanner sc = new Scanner(System.in);
        name s = new name();
        System.out.println("Enter the first name:");
        first = sc.next();
        System.out.println("Enter the last name:");
        last = sc.next();
        s.join(first,last);
    }
}