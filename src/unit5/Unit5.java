package unit5;
import java.util.ArrayList;

public class Unit5 {
static ArrayList al = new ArrayList();
 
    public static void main(String[] args) {
        al.add("a");
        al.add(0, "b");
        al.add("Banana");
        al.add("Lychee");
        al.add(1, "Orange");
        
        //Change banana to kiwi
        System.out.println("Banana is at: " + al.indexOf("BANANA"));
        al.set(3, "Kiwi");
        
        //Remove "b" and "a"
        al.remove(0);
        al.remove("a");
        al.sort(null);
        show();
    }
    
    public static void show(){
        for(int x=0;x<al.size();x++){
            String letter= String.valueOf(al.get(x));
            System.out.println("Location " + x + " => " + letter);
        }
    }
    
}
