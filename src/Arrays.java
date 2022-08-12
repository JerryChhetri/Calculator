import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter the Number of Integer ");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int marks [] = new int [val];
        System.out.println("Enter the Value");
        
        for(int i=0; i<val; i++){
            marks[i] = sc.nextInt();
        }
        for (int i=0; i<val; i++){
            System.out.println(marks[i]);
        }
    }
}
