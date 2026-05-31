module com.utils{
    exports com.utils;
}
module com.greetings{
    requires com.utils;
}


package com.utils;
public class Utility {
    public static void greet(){
        System.out.println("JAVA");
    }
}
