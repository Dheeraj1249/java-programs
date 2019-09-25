import java.util.Scanner;

class fibonacci {

    public int F(int n) {

        if(n==0)
            return 0;

        if(n==1)
            return 1;

        return F(n-1)+F(n-2);

    }

    public static void main(String[] args) {

        int n, i=0;

        Scanner sc = new Scanner(System.in);

        fibonacci s = new fibonacci();

        System.out.print("Enter the value of n: ");

        n = sc.nextInt();

        for (i=0; i<n; i++)
            System.out.print(s.F(i)+" ");

    }

}