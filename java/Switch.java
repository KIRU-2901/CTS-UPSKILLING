public class Switch {
    static void check(Object obj){
        switch(obj){
            case Integer i -> System.out.println("Integer: " + i);
            case String s -> System.out.println("String: " + s);
            case Double d -> System.out.println("Double: " + d);
            default -> System.out.println("Unknown type");
        }
    }  
    public static void main(String[] args){
        check(29);
        check("Java");
        check(29.1);
    }  
}