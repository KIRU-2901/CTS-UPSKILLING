import java.util.Scanner;
public class Trycatch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        try{
            int res = num1/num2;
            System.out.println(res);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}
