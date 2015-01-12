import unit5.*;

public class TireSales {
    
    public static void main(String[] args){
    ArrayStack pole = new ArrayStack();
    
    //Add 4 tires to pole
    pole.push(new Tire("Goodyear"));
    pole.push(new Tire("Goodyear"));
    pole.push(new Tire("Goodyear"));
    pole.push(new Tire("Goodyear"));
    
    //Sell twice
    System.out.println("Selling two tires");
    System.out.println(pole.pop());
    System.out.println(pole.pop());
    
    //Sell 3 tires
    System.out.println("Selling three tires");
    System.out.println(pole.pop());
    System.out.println(pole.pop());
    System.out.println(pole.pop());
    
    }
    
    
}
