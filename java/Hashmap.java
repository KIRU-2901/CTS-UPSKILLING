import java.util.*;
public class Hashmap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Ram");
        map.put(102, "Sam");
        map.put(103, "John");
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.println(map.get(id));
    }
}
