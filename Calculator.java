import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two digits:");
        int a =sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Choose an operation:(1-4)");
        System.out.println("1.Addtion\n2.Subtraction\n3.Multiplication\n4.Division");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
                System.out.print("Addtion : "+(a+b));
                break;
            case 2:
                System.out.print("Subtraction  "+(a-b));
                break;
            case 3:
                System.out.print("Multiplication : "+(a*b));
                break;
            case 4:
                System.out.print("Division : "+(a/b));
                break;
        }
    }
}
