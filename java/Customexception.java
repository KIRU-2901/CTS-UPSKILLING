import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class Customexception {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        try{
            if(age<18){
                throw new InvalidAgeException("Age must be at least 18");
            }
            else{
                System.out.println("Valid");
            }
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
