import java.util.Scanner;
class multiplicationtable{
    public void table(int x) {
        int i=0,res=0;
        System.out.println("The multiplication table of "+x+" is :");
        for (i=1;i<=10;i++)
        {
            res= x*i;
            System.out.println(+x+"X"+i+"="+res);
        }
    }
    public static void main(String[] args) {
        int value;
        System.out.println("Enter the number:");
        Scanner sc= new Scanner(System.in);
        value=sc.nextInt();
        multiplicationtable s= new multiplicationtable();
        s.table(value);
    }
}