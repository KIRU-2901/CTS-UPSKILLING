class method{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a,int b, int c){
        return a+b+c;
    }
}
public class Methodoverloading {
    public static void main(String[] args){
        method m = new method();
        System.out.println(m.add(80,90));
        System.out.println(m.add(80.5,90.5));
        System.out.println(m.add(80,90,100));
    }
}
