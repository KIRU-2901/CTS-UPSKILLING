import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String rev = new StringBuilder(str).reverse().toString();
        if(str.equals(rev)){
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
