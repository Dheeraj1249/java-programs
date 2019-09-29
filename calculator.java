import java.util.Scanner;
import java.lang.System;
class calculator {
    public void intake() {
        float a,b;
        int ch;
        char choice;
        Scanner sc = new Scanner(System.in);
        calculator s = new calculator();
        System.out.println("Enter two numbers to perform calculations:");
        a = sc.nextFloat();
        b = sc.nextFloat();
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n6.Exit\nEnter your choice:");
        ch = sc.nextInt();
        s.compute(a,b,ch);
    }
    public void compute(float a, float b, int ch) {
        float res;
            switch (ch) {
                case 1:
                    res = a + b;
                    System.out.println(a + " + " + b + " = " + res);
                    break;
                case 2:
                    res = a - b;
                    System.out.println(a + " - " + b + " = " + res);
                    break;
                case 3:
                    res = a * b;
                    System.out.println(a + " * " + b + " = " + res);
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Division not possible....Divide by 0 exception");
                    } else {
                        res = a / b;
                        System.out.println(a + " / " + b + " = " + res);
                    }
                    break;
                case 5:
                    res = (int) a % (int) b;
                    System.out.println(a + " % " + b + " = " + res);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
    }
    public static void main(String[] args) {
        char choice;
        Scanner j = new Scanner(System.in);
        calculator p = new calculator();
        p.intake();
        do {
            System.out.println("Do you want to perform another calculation? (Y/N)");
            choice = j.next().charAt(0);
            if (choice == 'Y' || choice == 'y')
                p.intake();
            else if (choice == 'N' || choice == 'n') {
                System.out.println("End of execution");
                System.exit(0);
            }
            if (choice!='Y' && choice!='y' && choice!='N' && choice!='n') {
                System.out.println("Invalid choice");
                System.exit(0);
            }
        }while (choice!='Y' || choice!='y' || choice!='N' || choice!='n');
        }
    }