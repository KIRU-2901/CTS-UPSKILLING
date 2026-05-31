interface Playable{
    void play();
}
class Guitar implements Playable{
    public void play(){
        System.out.println("Strings");
    }
}
class Piano implements Playable{
    public void play(){
        System.out.println("Keys");
    }
}
public class Interface {
    public static void main(String[] args){
        Playable g = new Guitar();
        g.play();
        Playable p = new Piano();
        p.play();
    }
}
