import java.util.Scanner;
public class ArraySumandAvg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        int avg = sum/n;
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + avg);
    }
}
