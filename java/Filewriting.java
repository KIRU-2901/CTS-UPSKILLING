import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Filewriting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente string: ");
        String str = sc.nextLine();
        try{
            FileWriter fw = new FileWriter("output.txt");
            fw.write(str);
            fw.close();
            System.out.println("Data written Successfully");
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
