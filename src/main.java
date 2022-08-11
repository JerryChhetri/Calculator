import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        System.out.println("CALCULATOR");
        Scanner s = new Scanner(System.in );
        int a, b;
        char operator;
        System.out.print("NUM 1 : ");
        a=s.nextInt();
        System.out.print("NUM 2 : ");
        b=s.nextInt();
        System.out.print("Enter operator (+, -, *, /)");
        operator = s.next().charAt(0);
        double addition  = a+b;
        double subtraction  = a-b;
        double multiplication  = a*b;
        double division  = a/b;

        switch(operator)
        {
            case '+' :
            {
                System.out.print("Total after Addition is : "+addition);
                break;
            }
            case '-' :
            {
                System.out.print("Total after Subtraction is : " +subtraction);
                break;
            }
            case '*' :
            {
                System.out.print("Total after Multiplication is : "+multiplication);
                break;
            }
            case '/' :
            {
                System.out.print("Total after Division is : "+division);
                break;
            }
            default :
            {
                System.out.print("Please select proper operator");
                return;
            }
        }
    }
}
